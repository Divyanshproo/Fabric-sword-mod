package com.example.swordmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;

public class SwordMod implements ModInitializer {

    // This is your custom sword item
    public static final Item CUSTOM_SWORD = new SwordItem(
            ToolMaterials.DIAMOND, // Base tool material (you can change later)
            6, // Attack damage bonus
            -2.4F, // Attack speed
            new Item.Settings()
    );

    @Override
    public void onInitialize() {
        // Register the sword
        Registry.register(Registries.ITEM, new Identifier("swordmod", "custom_sword"), CUSTOM_SWORD);
    }

}
