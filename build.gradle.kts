buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven ("https://jitpack.io")
        maven ("https://oss.jfrog.org/libs-snapshot")
    }
    dependencies {
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.buildGradle)
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.kotlinGradlePlugin)
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.hiltAndroidGradlePlugin)
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven ("https://jitpack.io")
        maven ("https://oss.jfrog.org/libs-snapshot")
    }
}
