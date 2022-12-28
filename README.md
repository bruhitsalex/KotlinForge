# KotlinForge

Template for 1.8.9 forge mod that includes Kotlin, Mixins and showing.

## Changing Project Name

Given it's currently called KotlinForge, and you want to change it to `DefinatelyNotCheat`:

1. Rename the package `net.bruhitsalex.kotlinforge` folder to `net.myname.definatelynotcheat`
2. Rename the `KotlinForge` class to `DefinatelyNotCheat`
3. Rename the `mixins.kotlinforge.json` file in your resources folder to `mixins.definatelynotcheat.json`
4. In the `mixins.definatelynotcheat.json` file, fix `package` to `net.myname.definatelynotcheat.mixins` and `refmap` to `mixins.definatelynotcheat.refmap.json`
5. In build.gradle change the `group` to `net.myname.definatelynotcheat`
6. In build.gradle change the `archivesBaseName` to `DefinatelyNotCheat`
7. In build.gradle, change all mentions of `KotlinForge` to `DefinatelyNotCheat`, especially in `jar {` and `mixin {`
8. Go in `DefinatelyNotCheat.kt` and change the `@Mod` annotation to `@Mod(modid = "definatelynotcheat", name = "DefinatelyNotCheat", version = "1.0")`
9. If this is a cheat (disgusting) don't use the modid `definatelynotcheat` and change it to something else like autogg or whatever

## Error: KotlinForge:test: Could not find net.minecraftforge:forgeBin:1.8.9-11.15.1.2318-1.8.9.

1. Go in your terminal and redirect it to this project
2. run `./gradlew setupDecompWorkspace -Dorg.gradle.jvmargs=-Xmx4096M`

If you get a heap/GC error, increase the memory limit in the command above. It's currently set to 4GB.