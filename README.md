# Android Studio Project Templates


## What is this

This implements an Android Studio project template to create new project in Android Studio.

The template is based on my List/Detail app based on my [Rick & Morty](https://github.com/jamesonwilliams/rick-morty-compose/tree/main) demo app.

<img src="screenshots/template-entry.png" alt="List/Detail app entry in Android Studio project templates." />

The template accepts an item name, which will be used widely around the project for file naming and model naming. For example, your list detail app might list animals, and show details on a particular Animal.

The project also accepts a URL which will be plugged into Retrofit.

<img src="screenshots/config-screen.png" alt="Example of configuring a new project using the template." />

## Cool, how can I install it?

There is a pre-built plugin [under release](./release/my-project-templates-1.0-SNAPSHOT.zip).

Follow [these instructions](https://sasikanth.dev/creating-project-templates-in-android-studio/#installing-the-plugin) to install it in your Android Studio.

## Where did it come from?

This is a fork of [Sasikanth](https://sasikanth.dev/creating-project-templates-in-android-studio/)'s project.

More details on how to build/deploy the plugin are in [Sasikanth](https://www.sasikanth.dev/creating-project-templates-in-android-studio/)'s blog.

Thank you to Sasikanth for his earlier work.

## Versioning Status

Currently I've tested the project build in IntelliJ IDEA 2023.3, using the plugin in Android Studio Hedgehog (2023.1.1).

