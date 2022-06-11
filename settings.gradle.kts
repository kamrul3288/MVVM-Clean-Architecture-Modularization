pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
rootProject.name = "GithubRepo"
include (":app")
include(":model:apiresponse")
include(":model:entity")
include(":domain")
include(":data")
include(":di")
include(":common")
