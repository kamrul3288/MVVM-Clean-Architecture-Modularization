package dependencies
import core.Dependencies

internal val androidxCoreDependencies = listOf(
    Dependencies.appcompat,
    Dependencies.coreKtx,
    Dependencies.material,
    Dependencies.constraintLayout,
    Dependencies.activityKtx,
    Dependencies.fragmentKtx,
    Dependencies.recyclerview,
    Dependencies.cardview,
    Dependencies.preference,
)

internal val androidxSwipeRefreshLayout = listOf(
    Dependencies.swipeToRefreshLayout
)

internal val androidxLifeCycleDependencies = listOf(
    Dependencies.viewModel,
    Dependencies.livedata,
    Dependencies.lifecycleRuntime,
    Dependencies.viewModelSaveState,
    Dependencies.lifecycleService,
)

internal val androidxNavigationDependencies = listOf(
    Dependencies.navigationFragmentKtx,
    Dependencies.navigationUiKtx,
)

internal val coroutinesAndroidDependencies = listOf(
    Dependencies.kotlinxCoroutinesAndroid,
)

internal val rxjava3Dependencies = listOf(
    Dependencies.rxJava3,
    Dependencies.rxJava3Android
)



internal val firebaseDependencies = listOf(
    Dependencies.firebaseBom,
    Dependencies.firebaseCore,
    Dependencies.firebaseMessaging,
    Dependencies.firebaseAnalytics,
    Dependencies.firebaseCrashlytics,
)

internal val playCoreDependencies = listOf(
    Dependencies.playStoreCore,
    Dependencies.playStoreKtx
)

internal val facebookDependencies = listOf(
    Dependencies.facebookAndroid,
    Dependencies.facebookMarketing
)

internal val googleMapDependencies = listOf(
    Dependencies.mapCore,
    Dependencies.mapLocation,
    Dependencies.mapPlaces,
)



internal val imageZoomViewDependencies = listOf(
    Dependencies.imageZoomView
)


internal val networkDependencies = listOf(
    Dependencies.retrofit,
    Dependencies.converterGson,
    Dependencies.gson,
    Dependencies.okhttp3,
    Dependencies.okhttp3logging,
    Dependencies.rxJava3adapter,
)


internal val androidResponsiveSizeDependencies = listOf(
    Dependencies.sdp,
    Dependencies.ssp,
)




