package com.stjender.keepslotmod.client;

import com.mojang.blaze3d.platform.InputConstants;
import com.stjender.keepslotmod.KeepSlotMod;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.ClientRegistry;

public final class KeyMappings {
    private KeyMappings() {}

    public static KeyMapping keep_slot_inventory_key;

    public static void init() {
        keep_slot_inventory_key = registerKey("keep_slot_key", InputConstants.KEY_I, KeyMapping.CATEGORY_INVENTORY);
    }

    private static KeyMapping registerKey(String name, int keyCode, String category) {
        final var key = new KeyMapping(String.format("key.%s.%s", KeepSlotMod.MOD_ID, name), keyCode, category);
        ClientRegistry.registerKeyBinding(key);
        return key;
    }
}
