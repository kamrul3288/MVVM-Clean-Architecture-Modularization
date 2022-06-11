package com.iamkamrul.githubrepo

internal val androidxCoreDependencies = listOf(
    Dependencies.appcompat,
    Dependencies.coreKtx,
    Dependencies.material,
    Dependencies.constraintLayout,
    Dependencies.activityKtx,
    Dependencies.fragmentKtx,
)

internal val androidxLifeCycleDependencies = listOf(
    Dependencies.viewModel,
    Dependencies.livedata,
    Dependencies.lifecycleRuntime,
    Dependencies.viewModelSaveState,
)

internal val androidxNavigationDependencies = listOf(
    Dependencies.navigationFragmentKtx,
    Dependencies.navigationUiKtx,
)

internal val coroutinesAndroidDependencies = listOf(
    Dependencies.kotlinxCoroutinesAndroid,
)

internal val networkDependencies = listOf(
    Dependencies.retrofit,
    Dependencies.converterGson,
    Dependencies.okhttp3,
    Dependencies.okhttp3logging,
)

internal val hiltDependencies = listOf(
    Dependencies.hiltCompiler,
    Dependencies.hiltAndroid
)

internal val helperDependencies = listOf(
    Dependencies.timber,
    Dependencies.gson
)

internal val coreModuleDependencies = listOf(
   ModuleDependencies.di,
   ModuleDependencies.data,
   ModuleDependencies.domain,
   ModuleDependencies.common,
)

internal val featureModuleDependentDependencies = listOf(
    ModuleDependencies.di,
    ModuleDependencies.domain,
    ModuleDependencies.common
)

internal val androidTestsDependencies = listOf(
    Dependencies.junit,
    Dependencies.ext_junit,
    Dependencies.espresso_core,
)
