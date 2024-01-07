plugins {
    // trick: for the same plugin versions in all sub-modules
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    alias(libs.plugins.ktlint).apply(false)
    alias(libs.plugins.cklib).apply(false)
}

subprojects {
    afterEvaluate {
        apply(plugin = libs.plugins.ktlint.get().pluginId)
    }
}
