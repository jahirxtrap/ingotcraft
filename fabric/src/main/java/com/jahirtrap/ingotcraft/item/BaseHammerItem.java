package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class BaseHammerItem extends PickaxeItem implements RepairableItem, FabricItem {
    public BaseHammerItem(Tier tier, Properties properties) {
        super(tier, 7, -3f, properties);
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        ItemStack retVal = stack.copy();
        if (retVal.getTag() != null && retVal.getTag().getBoolean("Unbreakable")) return retVal;
        retVal.setDamageValue(stack.getDamageValue() + 1);
        if (retVal.getDamageValue() >= retVal.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retVal;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
