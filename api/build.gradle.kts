import com.github.aliakseikaraliou.androidct.buildsrc.Dagger
import com.github.aliakseikaraliou.androidct.buildsrc.Kotlin
import com.github.aliakseikaraliou.androidct.buildsrc.Retrofit

plugins {
    id("kotlin")
    id("kotlin-kapt")
}


dependencies {
    implementation(Kotlin.DEPENDENCY)

    implementation(Dagger.DEPENDENCY)
    kapt(Dagger.KAPT)

    implementation(Retrofit.DEPENDENCY)
}
