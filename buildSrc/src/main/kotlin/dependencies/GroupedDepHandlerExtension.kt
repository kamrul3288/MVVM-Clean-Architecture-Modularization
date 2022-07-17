package dependencies
import core.Dependencies
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addAndroidxCoreDependencies(){
    androidxCoreDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addAndroidxSwipeRefreshLayout(){
    androidxSwipeRefreshLayout.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addAndroidxLifeCycleDependencies(){
    androidxLifeCycleDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addLiveDataDependencies(){
    add("implementation",Dependencies.livedata)
}


fun DependencyHandler.addAndroidxNavigationDependencies(){
    androidxNavigationDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addCoroutinesAndroidDependencies(){
    coroutinesAndroidDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addNetworkDependencies(configurationName:String = "implementation"){
    networkDependencies.forEach {
        add(configurationName,it)
    }
}

fun DependencyHandler.addHiltDependencies() {
    add("implementation",Dependencies.hiltAndroid)
    add("kapt",Dependencies.hiltCompiler)
}

fun DependencyHandler.addRxjava3Dependencies(){
    rxjava3Dependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addTimberDependencies(configurationName:String = "implementation"){
    add(configurationName,Dependencies.timber)
}

fun DependencyHandler.addGsonDependencies(configurationName:String = "implementation"){
    add(configurationName,Dependencies.gson)
}

fun DependencyHandler.addAndroidResponsiveSizeDependenciesDependencies(){
    androidResponsiveSizeDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addAlerterDependencies() {
    add("implementation",Dependencies.alerter)
}

fun DependencyHandler.addEPoxyDependencies(){
    add("implementation",Dependencies.epoxyCore)
}

fun DependencyHandler.addCircleImageviewDependencies(){
    add("implementation",Dependencies.circleImageview)
}

fun DependencyHandler.addPicassoDependencies(){
    add("implementation",Dependencies.picasso)
}

fun DependencyHandler.addViewStateDependencies(){
    add("implementation",Dependencies.viewStateLayout)
}

fun DependencyHandler.addFirebaseDependencies(){
    firebaseDependencies.forEachIndexed { index, it ->
        when (index) {
            0 -> add("implementation", platform(it))
            else -> add("implementation", it)
        }
    }
}

fun DependencyHandler.addPlayCoreDependencies(){
    playCoreDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addFacebookDependencies(){
    facebookDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addGoogleMapDependencies(){
    googleMapDependencies.forEach {
        add("implementation",it)
    }
}


fun DependencyHandler.addRoomDependencies(){
    add("implementation",Dependencies.roomKtx)
    add("implementation",Dependencies.roomRuntime)
    add("kapt",Dependencies.roomCompiler)

}

fun DependencyHandler.addRoomCommonDependencies(){
    add("implementation",Dependencies.roomCommon)
}

fun DependencyHandler.addImageZoomViewDependencies(){
    imageZoomViewDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addLeakcanaryDependencies(){
    add("debugImplementation",Dependencies.leakcanary)
}

fun DependencyHandler.addAndroidTestsDependencies() {
    add("testImplementation",Dependencies.junit)
    add("androidTestImplementation",Dependencies.ext_junit)
    add("androidTestImplementation",Dependencies.espresso_core)
}
