import com.iamkamrul.githubrepo.*
apply(plugin = "com.android.library")
apply(plugin = "org.jetbrains.kotlin.android")
apply(plugin = "kotlin-kapt")
apply(plugin = "androidx.navigation.safeargs")
apply(from = "$rootDir/android-base-dependencies.gradle")

dependencies {
    //addFeatureModuleDependencies()
    addAndroidxCoreDependencies()
    addAndroidxNavigationDependencies()
    addAndroidTestsDependencies()
}