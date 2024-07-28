package com.jahirtrap.ingotcraft.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static CreativeModeTab TAB_INGOTCRAFT;

    public static void init() {
        TAB_INGOTCRAFT = new CreativeModeTab("ingotcraft.tab_ingotcraft") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ModItems.NETHERITE_PICK_HAMMER.get());
            }
        };
    }
}
