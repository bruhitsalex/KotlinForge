# KotlinForge

Template for 1.8.9 forge mod that includes Kotlin, Mixins and showing.

## Changing Project Name

Given it's currently called KotlinForge, and you want to change it to `DefinatelyNotCheat`:

1. Rename the package `net.bruhitsalex.kotlinforge` folder to `net.myname.definatelynotcheat`
2. Rename the `KotlinForge` class to `DefinatelyNotCheat`
3. Rename the `mixins.kotlinforge.json` file in your resources folder to `mixins.definatelynotcheat.json`
4. In build.gradle change the `group` to `net.myname.definatelynotcheat`
5. In build.gradle change the `archivesBaseName` to `DefinatelyNotCheat`
6. In build.gradle, change all mentions of `KotlinForge` to `DefinatelyNotCheat`, especially in `jar {` and `mixin {`
7. Go in `DefinatelyNotCheat.kt` and change the `@Mod` annotation to `@Mod(modid = "definatelynotcheat", name = "DefinatelyNotCheat", version = "1.0")`
8. If this is a cheat (disgusting) don't use the modid `definatelynotcheat` and change it to something else like autogg or whatever