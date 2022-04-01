package com.stjender.keepslotmod.client.events;

import com.stjender.keepslotmod.KeepSlotMod;
import com.stjender.keepslotmod.client.KeyMappings;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KeepSlotMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public final class ClientForgeEvents {
    private ClientForgeEvents() {}

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event) {
        if(KeyMappings.keep_slot_inventory_key.isDown()) {
            Minecraft.getInstance().player.displayClientMessage(new TextComponent("Hoe"), false);
        }
    }
}
