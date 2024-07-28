package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.init.ModTab.TAB_INGOTCRAFT;
import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BasePickHammerItem extends PickaxeItem {
    public BasePickHammerItem(Tier tier, Properties properties) {
        super(tier, 7, -3f, properties.tab(TAB_INGOTCRAFT));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return hurt(1, stack.copy());
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
