package core

internal object Dependencies {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat_version}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx_version}"
    const val material = "com.google.android.material:material:${Versions.material_version}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout_version}"
    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activity_version}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment_version}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview_version}"
    const val cardview = "androidx.cardview:cardview:${Versions.card_view_version}"
    const val preference = "androidx.preference:preference:${Versions.preference_version}"
    const val swipeToRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeLayout_version}"

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    const val viewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}"
    const val lifecycleService = "androidx.lifecycle:lifecycle-service:${Versions.lifecycle_version}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt_android_version}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt_android_version}"

    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}"

    const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val rxJava3adapter = "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofit_version}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
    const val gson = "com.google.code.gson:gson:${Versions.retrofit_version}"

    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3_version}"
    const val okhttp3logging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3_version}"

    const val rxJava3 = "io.reactivex.rxjava3:rxjava:${Versions.rxJava3_version}"
    const val rxJava3Android = "io.reactivex.rxjava3:rxandroid:${Versions.rx_android3_version}"

    const val sdp = "com.intuit.sdp:sdp-android:${Versions.sdp_version}"
    const val ssp = "com.intuit.ssp:ssp-android:${Versions.sdp_version}"

    const val playStoreCore = "com.google.android.play:core:${Versions.play_core_version}"
    const val playStoreKtx = "com.google.android.play:core-ktx:${Versions.play_ktx_version}"

    const val facebookAndroid = "com.facebook.android:facebook-android-sdk:${Versions.facebook_version}"
    const val facebookMarketing = "com.facebook.android:facebook-marketing:${Versions.facebook_marketing_version}"

    const val mapCore = "com.google.android.gms:play-services-maps:${Versions.map_version}"
    const val mapLocation = "com.google.android.gms:play-services-location:${Versions.map_location_version}"
    const val mapPlaces = "com.google.android.libraries.places:places:${Versions.map_place_version}"

    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebase_bom_version}"
    const val firebaseCore = "com.google.firebase:firebase-core"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging-ktx"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"

    const val roomKtx = "androidx.room:room-ktx:${Versions.room_version}"
    const val roomRuntime = "androidx.room:room-runtime:${Versions.room_version}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room_version}"
    const val roomCommon = "androidx.room:room-common:${Versions.room_version}"

    const val leakcanary = "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary_version}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    const val viewStateLayout = "com.github.kamrul3288:ViewStateLayout:${Versions.viewStateLayoutVersion}"
    const val circleImageview = "de.hdodenhof:circleimageview:${Versions.circleImageViewVersion}"
    const val picasso = "com.squareup.picasso:picasso:${Versions.picassoVersion}"
    const val dotIndicator = "com.tbuonomo:dotsindicator:${Versions.dots_indicator_version}"
    const val alerter = "com.github.tapadoo:alerter:${Versions.alerter_version}"
    const val imageZoomView = "com.github.chrisbanes:PhotoView:${Versions.image_zoom_version}"
    const val epoxyCore = "com.airbnb.android:epoxy:${Versions.epoxy_version}"

    const val junit = "junit:junit:${Versions.junit}"
    const val ext_junit = "androidx.test.ext:junit:${Versions.ext_junit}"
    const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}