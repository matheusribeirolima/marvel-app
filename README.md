<p align="center">
    <img alt="Marvel App Logo" src="/images/marvel.svg" width=250px/>
</p>

# Marvel App

![Project Checks](https://github.com/matheusribeirolima/marvel-app/workflows/Pull%20Request%20&%20Master%20CI/badge.svg) ![License](https://img.shields.io/github/license/cortinico/kotlin-android-template.svg)

A simple Android project that lists and details Marvel characters.

## How to use 👣

Just add to the `PRIVATE_KEY` and `PUBLIC_KEY` attributes in the `keys.properties` file your **Marvel API** private and public keys, and you're good to go!

## Features 🎨

- Paginated listing of the characters' name and image.
- Display of the description and most expensive HQ of the character that the user selects.

## Tools 🔨

This project was built in Kotlin and designed according to the MVVM and Clean architectures using:

- **ViewModel:** The [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) class is designed to store and manage UI-related data in a lifecycle conscious way.
- **LiveData:** [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) is an observable data holder class. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services.
- **Coroutines:** [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) not only open the doors to asynchronous programming, but also provide a wealth of other possibilities such as concurrency, actors, etc.
- **Dagger Hilt:** [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project.
- **Material Components:** [Material Components](https://material.io/components) are interactive building blocks for creating a user interface.
- **Navigation:** [Android Jetpack's Navigation](https://developer.android.com/guide/navigation) component helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer.
- **Paging:** The [Paging Library](https://developer.android.com/topic/libraries/architecture/paging) helps you load and display small chunks of data at a time.
- **Retrofit:** A [type-safe HTTP client](https://square.github.io/retrofit/) for Android and the JVM
- **Coil:** [Image loading](https://coil-kt.github.io/coil/) for Android backed by Kotlin Coroutines.
- **Mockk:** [Mocking library](https://mockk.io) for Kotlin

## Static Analysis 🔍

This project uses [**detekt**](https://github.com/detekt/detekt) to analyze the source code, with the configuration that is stored in the [detekt.yml](config/detekt/detekt.yml) file.

## CI ⚙️

This project is using [**GitHub Actions**](https://github.com/matheusribeirolima/marvel-app/actions) as CI.

Currently, the following workflow is available:
- [Project Checks](.github/workflows/android-master.yml) - Perform static code validations, run tests and assemble the project.

## Marvel Api 📦

Open API that provides information about [Marvel Comics heroes](https://developer.marvel.com).

## Contributing 🤝

Feel free to open a issue or submit a pull request for any bugs/improvements.
