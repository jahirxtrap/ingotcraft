package com.jahirtrap.ingotcraft.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngotcraftModTabs {
    public static CreativeModeTab TAB_INGOT_CRAFT;

    public static void load() {
        TAB_INGOT_CRAFT = new CreativeModeTab("tabingot_craft") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(IngotcraftModItems.STEEL_INGOT.get());
            }

            @Override
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
