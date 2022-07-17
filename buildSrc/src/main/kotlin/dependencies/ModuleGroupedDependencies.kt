package dependencies
import core.ModulesDep

internal val featureModuleDependencies = listOf(
    ModulesDep.repoList,
    ModulesDep.profile
)

internal val featureModuleDependantDependencies = listOf(
    ModulesDep.di,
    ModulesDep.domain,
    ModulesDep.common,
    ModulesDep.navigation
)