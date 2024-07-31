package com.jahirtrap.ingotcraft.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModTab {
    public static CreativeModeTab TAB_INGOTCRAFT = FabricItemGroupBuilder.build(
            new ResourceLocation(MODID, "tab_ingotcraft"), () -> new ItemStack(ModContent.NETHERITE_PICK_HAMMER));

    public static void init() {
    }
}
