pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
        google()
        maven ("https://jitpack.io")
        maven ("https://oss.jfrog.org/libs-snapshot")
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
include(":features:repolist")
