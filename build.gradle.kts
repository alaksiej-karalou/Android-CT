
buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath(com.github.aliakseikaraliou.androidct.buildsrc.Gradle.CLASSPATH)
        classpath(com.github.aliakseikaraliou.androidct.buildsrc.Kotlin.CLASSPATH)
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}