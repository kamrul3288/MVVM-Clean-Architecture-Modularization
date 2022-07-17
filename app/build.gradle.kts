import dependencies.*

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = ProjectConfigs.compileSdkVersion
    defaultConfig {
        applicationId = ProjectConfigs.applicationId
        minSdk  = ProjectConfigs.minSdkVersion
        targetSdk  = ProjectConfigs.targetSdkVersion
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    addFeatureModules()
    addDataModule()
    addDomainModule()
    addCommonModule()

    addAndroidxCoreDependencies()
    addAndroidxNavigationDependencies()
    addAndroidxLifeCycleDependencies()
    addViewStateDependencies()
    addHiltDependencies()
    addAndroidTestsDependencies()
}
kapt {
    correctErrorTypes = true
}