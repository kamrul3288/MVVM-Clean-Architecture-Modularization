package com.iamkamrul.githubrepo

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

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

fun DependencyHandler.addHelperDependencies(){
    helperDependencies.forEach {
        add("implementation",it)
    }
}

fun DependencyHandler.addCoreModuleDependencies(){
    coreModuleDependencies.forEach {
        add("implementation",project(it))
    }
}

fun DependencyHandler.addFeatureModuleDependentDependencies(){
    featureModuleDependentDependencies.forEach {
        add("implementation",project(it))
    }
}

fun DependencyHandler.addFeatureModuleDependencies(){
    featureModuleDependencies.forEach {
        add("implementation",project(it))
    }
}

fun DependencyHandler.addFeatureModuleHelperDependencies(){
    featureModuleHelperDependencies.forEach {
        add("implementation",it)
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
