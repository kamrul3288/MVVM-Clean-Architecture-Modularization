import com.iamkamrul.githubrepo.*

apply(from = "$rootDir/android-core-module-dependencies.gradle.kts")

dependencies {
    add("api",project(ModuleDependencies.entity))
}
