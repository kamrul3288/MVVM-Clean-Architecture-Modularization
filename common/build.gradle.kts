import dependencies.*

plugins {
    plugins.`android-base-library`
}
dependencies {
    addCoroutinesAndroidDependencies()
    addAndroidxCoreDependencies()
    addAndroidxLifeCycleDependencies()
}
