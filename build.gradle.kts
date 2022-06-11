buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.buildGradle)
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.kotlinGradlePlugin)
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.hiltAndroidGradlePlugin)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
    }
}
