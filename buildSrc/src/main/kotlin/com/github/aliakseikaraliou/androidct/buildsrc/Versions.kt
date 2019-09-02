package com.github.aliakseikaraliou.androidct.buildsrc

object AndroidX {
    const val BASE = "androidx.appcompat:appcompat:${Versions.ANDROIDX}"

    const val ACTIVITY = "androidx.activity:activity-ktx:${Versions.ANDROIDX_ACTIVITY}"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.ANDROIDX_FRAGMENT}"

    const val CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"

    const val CONSTRAINT =
        "androidx.constraintlayout:constraintlayout:${Versions.ANDROIDX_CONSTRAINT}"
}

object AndroidSdk {
    const val COMPILE_SDK = 29
    const val TARGET_SDK = 29
    const val MIN_SDK = 21
    const val BUILD_VERSION = "29.0.2"

    const val APPLICATION_ID = "com.github.aliakseikaraliou.androidct"
}

object Dagger {
    const val DEPENDENCY = "com.google.dagger:dagger:${Versions.DAGGER}"
    const val KAPT = "com.google.dagger:dagger:${Versions.DAGGER}"
}

object Gradle {
    const val CLASSPATH = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE}"
}

object Kotlin {
    const val CLASSPATH = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN_VERSION}"
    const val DEPENDENCY = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN_VERSION}"
}


object Retrofit {
    const val DEPENDENCY = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
}


private object Versions {

    const val ANDROID_GRADLE = "3.5.0"

    const val ANDROIDX = "1.1.0-rc01"
    const val ANDROIDX_ACTIVITY = "1.0.0-rc01"
    const val ANDROIDX_FRAGMENT = "1.1.0-rc04"
    const val ANDROIDX_CORE = "1.0.2"
    const val ANDROIDX_CONSTRAINT = "1.1.3"

    const val KOTLIN_VERSION = "1.3.41"

    const val DAGGER = "2.24"
    const val RETROFIT = "2.6.1"
}