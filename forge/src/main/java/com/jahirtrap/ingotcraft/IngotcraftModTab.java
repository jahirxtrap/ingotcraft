package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngotcraftModTab {
    public static CreativeModeTab TAB_INGOTCRAFT;

    public static void init() {
        TAB_INGOTCRAFT = new CreativeModeTab("ingotcraft.tab_ingotcraft") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(IngotcraftModItems.NETHERITE_HAMMER.get());
            }
        };
    }
}
