package com.marvel.app

object Dependencies {
    object Application {
        const val id = "com.marvel.app"
    }

    object Modules {
        const val app = ":app"
        const val core = ":libraries:core"
        const val navigation = ":libraries:navigation"
        const val network = ":libraries:network"
        const val home = ":features:home"
        const val detail = ":features:detail"
    }

    object Releases {
        const val versionCode = 1
        const val versionName = "1.0"
    }

    object Versions {
        const val compileSdk = 29
        const val buildTools = "30.0.2"
        const val minSdk = 21
        const val targetSdk = 29
        const val gradle = "4.0.1"
        const val kotlin = "1.4.0"
        const val hilt = "2.28.3-alpha"
        const val core = "1.3.1"
        const val fragment = "1.2.5"
        const val appCompat = "1.2.0"
        const val constraintLayout = "2.0.1"
        const val recyclerView = "1.1.0"
        const val lifecycle = "2.2.0"
        const val arch = "2.1.0"
        const val hiltX = "1.0.0-alpha02"
        const val coroutines = "1.3.9"
        const val navigation = "2.3.0"
        const val versions = "0.30.0"
        const val detekt = "1.12.0"
        const val material = "1.2.1"
        const val paging = "3.0.0-alpha06"
        const val coil = "0.13.0"
        const val retrofit = "2.9.0"
        const val logging = "4.8.1"
        const val junit = "4.13"
        const val mockk = "1.10.0"
        const val testRules = "1.3.0"
        const val testExt = "1.1.2"
        const val espresso = "3.3.0"
    }

    object Plugins {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
        const val navigation = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
        const val versions = "com.github.ben-manes.versions"
        const val detekt = "io.gitlab.arturbosch.detekt"
    }

    object GeneralLibraries {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val coil = "io.coil-kt:coil:${Versions.coil}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging}"
    }

    object GoogleLibraries {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val materialDesign = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidxLibraries {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val scope = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val hiltX = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltX}"
        const val hiltXCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltX}"
        const val navigationRuntime = "androidx.navigation:navigation-runtime-ktx:${Versions.navigation}"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
        const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    }

    object TestLibraries {
        const val junit = "junit:junit:${Versions.junit}"
        const val mockk = "io.mockk:mockk:${Versions.mockk}"
        const val archCoreTesting = "androidx.arch.core:core-testing:${Versions.arch}"
        const val paging = "androidx.paging:paging-common:${Versions.paging}"
        const val hilt = "com.google.dagger:hilt-android-testing:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
        const val testRules = "androidx.test:rules:${Versions.testRules}"
        const val testExt = "androidx.test.ext:junit:${Versions.testExt}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val navigation = "androidx.navigation:navigation-testing:${Versions.navigation}"
    }
}
