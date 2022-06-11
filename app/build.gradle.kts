import com.iamkamrul.githubrepo.*
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    addCoreModuleDependencies()

    addAndroidxCoreDependencies()
    addAndroidxLifeCycleDependencies()
    addAndroidxNavigationDependencies()
    addCoroutinesAndroidDependencies()
    addNetworkDependencies()
    addHiltDependencies()
    addAndroidTestsDependencies()
}
kapt {
    correctErrorTypes = true
}