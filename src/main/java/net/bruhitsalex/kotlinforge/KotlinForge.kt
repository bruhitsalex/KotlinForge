package net.bruhitsalex.kotlinforge

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent

@Mod(modid = "kotlinforge", name = "KotlinForge", version = "1.0")
class KotlinForge {

    @EventHandler
    fun onPreInit(event: FMLPreInitializationEvent) {
        println("Hello from Kotlin!")
    }

}