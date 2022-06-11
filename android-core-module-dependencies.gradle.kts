import com.iamkamrul.githubrepo.*
apply(plugin = "com.android.library")
apply(plugin = "org.jetbrains.kotlin.android")
apply(plugin = "kotlin-kapt")
apply(plugin = "dagger.hilt.android.plugin")
apply(from = "$rootDir/android-base-dependencies.gradle")

dependencies {
    addAndroidxCoreDependencies()
    addAndroidxLifeCycleDependencies()
    addCoroutinesAndroidDependencies()
    addNetworkDependencies()
    addHiltDependencies()
    addAndroidTestsDependencies()
}