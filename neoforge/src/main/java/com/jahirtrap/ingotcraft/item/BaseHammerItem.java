package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BaseHammerItem extends PickaxeItem {
    public BaseHammerItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 7f, -3f)));
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        return hurt(1, stack.copy());
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
