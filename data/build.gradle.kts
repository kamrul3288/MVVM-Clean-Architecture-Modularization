import com.iamkamrul.githubrepo.*

apply(from = "$rootDir/android-core-module-dependencies.gradle.kts")
dependencies {
    add("implementation",project(ModuleDependencies.di))
    add("api",project(ModuleDependencies.api_response))
    add("implementation",project(ModuleDependencies.domain))
}