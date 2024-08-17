package com.jahirtrap.ingotcraft.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTab {
    public static final CreativeModeTab TAB_INGOTCRAFT = new CreativeModeTab("ingotcraft.tab_ingotcraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModContent.NETHERITE_PICK_HAMMER.get());
        }
    };
}
