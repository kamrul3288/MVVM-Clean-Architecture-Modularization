
plugins {
    `kotlin-dsl`
}


buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
    }
}


repositories {
    mavenLocal()
    mavenCentral()
    google()
    maven ("https://oss.jfrog.org/libs-snapshot")
}
