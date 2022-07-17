import org.gradle.kotlin.dsl.`kotlin-dsl`
plugins {
    `kotlin-dsl`
}

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven ("https://jitpack.io")
        maven ("https://oss.jfrog.org/libs-snapshot")
    }
}
repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven ("https://jitpack.io")
    maven ("https://oss.jfrog.org/libs-snapshot")
}
dependencies {
    compileOnly(gradleKotlinDsl())
    implementation("com.android.tools.build:gradle:7.2.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.39.1")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.2")
}