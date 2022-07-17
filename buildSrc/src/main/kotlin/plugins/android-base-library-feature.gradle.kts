package plugins
import dependencies.addAndroidTestsDependencies
import dependencies.addHiltDependencies
import dependencies.addAndroidxCoreDependencies
import dependencies.addFeatureModuleDependantDependencies
import dependencies.addAndroidxNavigationDependencies
import dependencies.addCoroutinesAndroidDependencies
import dependencies.addViewStateDependencies
import dependencies.addAndroidResponsiveSizeDependenciesDependencies
import gradle.kotlin.dsl.accessors._f28201936ac5dc93fbe24b62cb4541cf.android
import gradle.kotlin.dsl.accessors._f28201936ac5dc93fbe24b62cb4541cf.kotlinOptions

plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android{
    compileSdk = ProjectConfigs.compileSdkVersion

    defaultConfig {
        minSdk = ProjectConfigs.minSdkVersion
        targetSdk = ProjectConfigs.targetSdkVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures{
        viewBinding = true
    }
}


dependencies {
    addFeatureModuleDependantDependencies()
    addHiltDependencies()
    addAndroidxCoreDependencies()
    addAndroidxNavigationDependencies()
    addCoroutinesAndroidDependencies()
    addAndroidResponsiveSizeDependenciesDependencies()
    addViewStateDependencies()
    addAndroidTestsDependencies()
}