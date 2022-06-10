package com.iamkamrul.githubrepo

import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.addAndroidxCoreDependencies(){
    androidxCoreDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addAndroidxLifeCycleDependencies(){
    androidxLifeCycleDependencies.forEach {
        add("implementation",it)
    }
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

fun DependencyHandler.addNetworkDependencies(){
    networkDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addHiltDependencies() {
    hiltDependencies.forEachIndexed { index, dep ->
        when(index){
            0->add("kapt",dep)
            else->add("implementation",dep)
        }
    }
}

fun DependencyHandler.addAndroidTestsDependencies() {
    androidTestsDependencies.forEachIndexed { index, dep ->
        when(index){
            0->add("testImplementation",dep)
            1,2,3->add("androidTestImplementation",dep)
            else->add("debugImplementation",dep)
        }
    }
}
