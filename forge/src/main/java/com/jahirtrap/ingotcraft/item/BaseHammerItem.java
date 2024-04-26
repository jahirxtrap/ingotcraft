package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class BaseHammerItem extends PickaxeItem {
    public BaseHammerItem(Tier tier, Properties properties) {
        super(tier, 7, -3f, properties);
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        ItemStack retVal = stack.copy();
        if (retVal.getTag() != null && retVal.getTag().getBoolean("Unbreakable")) return retVal;
        retVal.setDamageValue(stack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
}
