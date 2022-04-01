package com.stjender.keepslotmod.client.events;

import com.stjender.keepslotmod.KeepSlotMod;
import com.stjender.keepslotmod.client.KeyMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = KeepSlotMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    private ClientModEvents() {}

    @SubscribeEvent
    public static void clientSetup (FMLClientSetupEvent event) {
        KeyMappings.init();
    }
}
