import dependencies.*

plugins {
    plugins.`android-base-library-core`
}

dependencies {
    addNetworkDependencies()
    addTimberDependencies(configurationName = "api")
}