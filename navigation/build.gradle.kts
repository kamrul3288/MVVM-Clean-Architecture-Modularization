import dependencies.*

plugins {
    plugins.`android-base-library`
    id ("androidx.navigation.safeargs.kotlin")
}

dependencies{
    addAndroidxNavigationDependencies()
    addEntityModule()
    addAndroidTestsDependencies()
}