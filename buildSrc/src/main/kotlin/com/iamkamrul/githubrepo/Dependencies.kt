package com.iamkamrul.githubrepo

internal object Dependencies {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx_version}"
    const val material = "com.google.android.material:material:${Versions.material_version}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout_version}"
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activity_version}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    const val viewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt_android_version}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt_android_version}"

    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"

    const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    const val gson = "com.google.code.gson:gson:${Versions.retrofit_version}"

    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3_version}"
    const val okhttp3logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3_version}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"

    const val junit = "junit:junit:${Versions.junit}"
    const val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}