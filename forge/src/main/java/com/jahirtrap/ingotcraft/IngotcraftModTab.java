package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngotcraftModTab {
    public static CreativeModeTab TAB_INGOT_CRAFT;

    public static void init() {
        TAB_INGOT_CRAFT = new CreativeModeTab("ingotcraft.tabingot_craft") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(IngotcraftModItems.NETHERITE_HAMMER.get());
            }
        };
    }
}
