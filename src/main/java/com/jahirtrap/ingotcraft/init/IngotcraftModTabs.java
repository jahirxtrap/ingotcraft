package com.jahirtrap.ingotcraft.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class IngotcraftModTabs {
    public static CreativeModeTab TAB_INGOT_CRAFT;

    public static void load() {
        TAB_INGOT_CRAFT = new CreativeModeTab("tabingot_craft") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(IngotcraftModItems.STEEL_INGOT);
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
