package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModBlocks;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngotcraftMod implements ModInitializer {

    public static final String MODID = "ingotcraft";

    public static final CreativeModeTab TAB_INGOTCRAFT = FabricItemGroupBuilder.build(new ResourceLocation(IngotcraftMod.MODID, "tabingot_craft"), () -> new ItemStack(IngotcraftModItems.STEEL_INGOT));

    @Override
    public void onInitialize() {
        IngotcraftModBlocks.init();
        IngotcraftModItems.init();
    }
}
