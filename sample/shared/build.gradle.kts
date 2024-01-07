import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.jetbrainsCompose)
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
                val dir = project.file("src/nativeInterop")
                defFile(File(dir, "definitions.def"))
                packageName("tech.takenoko.android.kmp.interop")
                compilerOpts("-I$dir")
                includeDirs(dir)
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
                group = "tech.takenoko.android.kmp.sample"
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
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
    dependencies {
        debugImplementation(libs.compose.ui.tooling.preview)
    }
}
