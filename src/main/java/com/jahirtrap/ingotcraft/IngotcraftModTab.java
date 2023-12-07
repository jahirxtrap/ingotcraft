package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class IngotcraftModTab {
    public static CreativeModeTab TAB_INGOT_CRAFT;

    public static void init() {
        TAB_INGOT_CRAFT = new CreativeModeTab("tabingot_craft") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(IngotcraftModItems.STEEL_INGOT.get());
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
