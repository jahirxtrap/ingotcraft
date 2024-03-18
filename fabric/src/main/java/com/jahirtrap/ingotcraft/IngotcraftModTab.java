package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngotcraftModTab {
    public static CreativeModeTab TAB_INGOT_CRAFT = FabricItemGroupBuilder.build(
            new ResourceLocation(IngotcraftMod.MODID, "tabingot_craft"), () -> new ItemStack(IngotcraftModItems.NETHERITE_HAMMER));

    public static void init() {
    }
}
