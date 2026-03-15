🚀 RANMEDIA MASTER BLUEPRINT: KOTLIN NATIVE MULTI-MODULE
1. PROJECT CONTEXT & GOAL
Project Name: RanMedia

Package Name: com.dev.ranmedia

Objective: Build a production-grade Media Player (Audio/Video) to demonstrate Middle/Senior Level Kotlin Native skills.

Audience: Flutter Developer (5 years exp) transitioning to Kotlin.

Key Philosophy: Clean Architecture, Unidirectional Data Flow (MVI), Multi-module, Offline-first.

2. TECH STACK & COMPLIANCE (JD REQUIREMENTS)
Language: Kotlin 1.9.23+ (Idiomatic style: data classes, sealed interfaces, extension functions).

UI: Jetpack Compose (Material 3, State Hoisting).

Architecture: Clean Architecture (Data, Domain, Presentation).

Concurrency: Kotlin Coroutines & Flow (StateFlow, SharedFlow).

DI: Hilt (Dagger Hilt).

Navigation: Navigation 3 (Type-safe Navigation Compose).

Data: Room (Persistence), DataStore (Preferences), Ktor (Networking), Kotlin Serialization.

Media: Media3/ExoPlayer, GLSL Shaders.

Ops: Firebase (Analytics, Crashlytics, Remote Config), AdMob & AppLovin MAX.

3. MULTI-MODULE STRUCTURE
Plaintext
Root Project: ZenMedia
├── :app (Main Entry, NavHost, Hilt App, MainActivity)
├── :core
│   ├── :common (Dispatchers, Utils, Constants, Base Classes)
│   ├── :data (Room DB, DataStore, Ktor Implementation, Repository Impls)
│   ├── :domain (Pure Kotlin: Models, Repository Interfaces, UseCases)
│   ├── :ui (Material 3 Theme, Reusable Composables, Color Extraction)
│   └── :media (Media3/ExoPlayer Service, MediaSession)
└── :features
    ├── :library (Song/Video Listing, Room Queries)
    ├── :player (Immersive UI, GLSL Shaders, Playback Control)
    └── :search (Flow-based Search logic)

4. VERSION CATALOG (gradle/libs.versions.toml)
Ini, TOML
[versions]
agp = "8.3.1"
kotlin = "1.9.23"
coreKtx = "1.12.0"
ksp = "1.9.23-1.0.19"
composeBom = "2024.02.02"
composeNavigation = "2.8.0-alpha06"
material3 = "1.2.1"
hilt = "2.51"
lifecycle = "2.7.0"
room = "2.6.1"
datastore = "1.0.0"
ktor = "2.3.9"
serialization = "1.6.3"
media3 = "1.3.0"
applovin = "12.4.1"

[libraries]
# Compose
androidx-compose-bom = { group = "androidx.compose", name = "compose-bom", version.ref = "composeBom" }
androidx-ui = { group = "androidx.compose.ui", name = "ui" }
androidx-material3 = { group = "androidx.compose.material3", name = "material3" }
androidx-navigation-compose = { group = "androidx.navigation", name = "navigation-compose", version.ref = "composeNavigation" }
# Architecture
hilt-android = { group = "com.google.dagger", name = "hilt-android", version.ref = "hilt" }
hilt-compiler = { group = "com.google.dagger", name = "hilt-android-compiler", version.ref = "hilt" }
androidx-lifecycle-viewmodel-compose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version.ref = "lifecycle" }
# Data
room-runtime = { group = "androidx.room", name = "room-runtime", version.ref = "room" }
room-ktx = { group = "androidx.room", name = "room-ktx", version.ref = "room" }
room-compiler = { group = "androidx.room", name = "room-compiler", version.ref = "room" }
ktor-client-core = { group = "io.ktor", name = "ktor-client-core", version.ref = "ktor" }
# Media
androidx-media3-exoplayer = { group = "androidx.media3", name = "media3-exoplayer", version.ref = "media3" }
androidx-media3-ui = { group = "androidx.media3", name = "media3-ui", version.ref = "media3" }

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }
hilt-android = { id = "com.google.dagger.hilt.android", version.ref = "hilt" }
ksp = { id = "com.google.devtools.ksp", version.ref = "ksp" }
kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlin" }
5. REFERENCE BEST PRACTICES (DOCS)
App Architecture: developer.android.com/topic/architecture

Compose UI: developer.android.com/jetpack/compose

Kotlin Flow: developer.android.com/kotlin/flow

Type-safe Nav: developer.android.com/guide/navigation/design/type-safety

6. IMPLEMENTATION GUIDELINES FOR AI AGENT
Strict MVI Pattern: Every feature must use a sealed interface for UiState and a sealed interface for UiEvent.

Stateless Composables: Use State Hoisting. Pass Lambdas for click events, not ViewModels.

Dependency Injection: Strictly use Hilt. Every Repository implementation must be bound to its interface in a Hilt Module.

Flutter Analogies: When explaining logic, use comparisons like:

LaunchedEffect is like initState.

remember is like a persistent variable in a StatefulWidget.

StateFlow is like a BehaviorSubject or ValueNotifier.

Clean Data: Ensure the :core:domain module has ZERO Android dependencies (Pure Kotlin).

Advanced Media: Implementation in :core:media must handle Android 14+ Foreground Service types (mediaPlayback).

7. EXECUTION STEPS
Phase 1: Initialize the Gradle Multi-module project & libs.versions.toml.

Phase 2: Setup Hilt DI & Core UI (Material 3 Theme).

Phase 3: Build :core:domain (Entities) & :core:data (Room/Ktor).

Phase 4: Build :features:library (Listing UI) & Navigation.

Phase 5: Build :core:media (ExoPlayer Service) & :features:player (UI + Shader).

Phase 6: Monetization & Firebase integration.