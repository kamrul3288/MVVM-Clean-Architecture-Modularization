import org.gradle.kotlin.dsl.`kotlin-dsl`
plugins {
    `kotlin-dsl`
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }
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
