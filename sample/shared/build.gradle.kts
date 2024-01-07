import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.cklib)
    id("maven-publish")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
            isStatic = true
        }

        it.compilations.getByName("main") {
            val lib by cinterops.creating {
                val dir = project.file("src/nativeInterop/cinterop")
                includeDirs(dir)
                headers(
                    File(dir, "image.h"),
                    File(dir, "logs.h"),
                )
            }
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(libs.compose.ui.tooling)
            implementation(libs.androidx.activity.compose)
        }
        commonMain.dependencies {
            implementation(projects.library.shared)
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            @OptIn(ExperimentalComposeLibrary::class)
            implementation(compose.components.resources)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }

    publishing {
        repositories {
            maven {
                url = uri("https://maven.pkg.github.com/TakenokoTech/kmp-sample")
                group = "tech.takenoko.kmp.sample"
                name = "shared"
                version = "1.0.0-SNAPSHOT"
                credentials {
                    username = System.getenv("GITHUB_ACTOR")
                    password = System.getenv("GITHUB_TOKEN")
                }
            }
        }
    }
}

android {
    namespace = "tech.takenoko.android.kmp.sample"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
        ndk {
            abiFilters += listOf("x86", "x86_64", "armeabi-v7a", "arm64-v8a")
        }
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    externalNativeBuild {
        cmake.path = file("src/androidMain/CMakeLists.txt")
    }
    dependencies {
        debugImplementation(libs.compose.ui.tooling.preview)
    }
}
