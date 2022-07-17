buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven ("https://jitpack.io")
        maven ("https://oss.jfrog.org/libs-snapshot")
    }
    dependencies {
        classpath(ProjectConfigs.buildGradle)
        classpath(ProjectConfigs.kotlinGradlePlugin)
        classpath(ProjectConfigs.hiltAndroidGradlePlugin)
        classpath(ProjectConfigs.navSafeArgs)
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
