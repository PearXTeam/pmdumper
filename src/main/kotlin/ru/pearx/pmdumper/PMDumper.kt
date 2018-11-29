package ru.pearx.pmdumper

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.event.FMLServerStartingEvent

@Mod(modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter", name = NAME, modid = ID, version = VERSION, acceptedMinecraftVersions = ACCEPTED_MINECRAFT_VERSIONS, acceptableRemoteVersions = "*", dependencies = DEPENDENCIES)
object PMDumper {
    @Mod.EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        with(event.modMetadata) {
            autogenerated = false
            modId = ID
            name = NAME
            description = DESCRIPTION
            version = VERSION
            authorList = AUTHORS
        }
    }

    @Mod.EventHandler
    fun serverStart(event: FMLServerStartingEvent) {
        event.registerServerCommand(PMDumperCommand())
    }
}