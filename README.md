# Edamame Assistant (Android)

This is a minimal, ready-to-open Android Studio project (Kotlin) for an "Edamame Assistant" app.
The environment that created this archive cannot build APKs here, but you can:

1. Open the project in Android Studio (Arctic Fox or newer) and build a signed APK via **Build > Generate Signed Bundle / APK**.
2. Or push this repository to GitHub and use the included GitHub Actions workflow to produce an APK automatically.

## Quick steps (local)
- Open Android Studio, choose "Open", select this folder.
- Let Gradle sync. Then Build -> Make Project.
- To generate an APK: Build -> Generate Signed Bundle / APK.

## Quick steps (CI with GitHub Actions)
- Create a new GitHub repo and push this project.
- Go to `.github/workflows/android-build.yml` for a sample workflow.
- Add signing keys/secrets if you want a release-signed APK.

