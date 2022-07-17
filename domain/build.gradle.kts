import dependencies.*

plugins {
    plugins.`android-base-library-core`
}
dependencies {
    addCoroutinesAndroidDependencies()
    addEntityModule(configurationName = "api")
}