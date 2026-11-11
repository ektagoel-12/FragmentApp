# FragmentApp

A small Android app that demonstrates fragment navigation. Four buttons switch between four fragments, and each fragment shows a toast saying which fragment you are in and which one you came from.

## What it shows

- Replacing fragments in a container with `FragmentManager` transactions
- Passing the previous fragment's name to the next one via fragment arguments
- A simple layout with four buttons and a fragment container

The package is named `com.example.whatsappclone`: it started as the base for a messaging-style UI.

## Tech stack

- Kotlin, AndroidX AppCompat and Fragment
- Android `minSdk` 28, `compileSdk` / `targetSdk` 36

## Run it

Open the project in Android Studio and run the `app` configuration, or with a device or emulator connected:

```bash
./gradlew installDebug
```

## Project structure

```
app/src/main/java/com/example/whatsappclone/
  MainActivity.kt        Buttons and fragment switching
  fragments/             Fragment1 to Fragment4
app/src/main/res/layout/ activity_main.xml, fragment1-4.xml
```
