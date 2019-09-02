import com.github.aliakseikaraliou.androidct.buildsrc.AndroidSdk
import com.github.aliakseikaraliou.androidct.buildsrc.AndroidX
import com.github.aliakseikaraliou.androidct.buildsrc.Kotlin

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(AndroidSdk.COMPILE_SDK)
    buildToolsVersion(AndroidSdk.BUILD_VERSION)

    defaultConfig {
        applicationId = AndroidSdk.APPLICATION_ID
        minSdkVersion(AndroidSdk.MIN_SDK)
        targetSdkVersion(AndroidSdk.TARGET_SDK)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
}


dependencies {
    implementation(Kotlin.DEPENDENCY)

    implementation(AndroidX.BASE)
    implementation(AndroidX.CORE)

    implementation(AndroidX.ACTIVITY)
    implementation(AndroidX.FRAGMENT)

    implementation(AndroidX.CONSTRAINT)
//
//    androidTestImplementation 'androidx.test:runner:1.1.1'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.1.1'
}
