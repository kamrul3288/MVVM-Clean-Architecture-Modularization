buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.buildGradle)
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.kotlinGradlePlugin)
        classpath(com.iamkamrul.githubrepo.ProjectConfigs.hiltAndroidGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.0")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
    }
}
