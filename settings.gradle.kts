pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RanMedia"
include(":app")
include(":core:common")
include(":core:domain")
include(":core:data")
include(":core:ui")
include(":core:media")
include(":features:library")
include(":features:player")
include(":features:search")
