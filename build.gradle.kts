buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
    }
    dependencies {
        classpath(com.marvel.app.Dependencies.Plugins.gradle)
        classpath(com.marvel.app.Dependencies.Plugins.kotlin)
        classpath(com.marvel.app.Dependencies.Plugins.hilt)
        classpath(com.marvel.app.Dependencies.Plugins.navigation)
    }
}

plugins {
    id(com.marvel.app.Dependencies.Plugins.versions) version com.marvel.app.Dependencies.Versions.versions
    id(com.marvel.app.Dependencies.Plugins.detekt) version com.marvel.app.Dependencies.Versions.detekt
}

allprojects {
    apply(from = "$rootDir/detekt.gradle")
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
