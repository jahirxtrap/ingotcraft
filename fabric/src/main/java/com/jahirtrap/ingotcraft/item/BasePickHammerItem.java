package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BasePickHammerItem extends PickaxeItem implements RepairableItem, FabricItem {
    public BasePickHammerItem(Tier tier, Properties properties) {
        super(tier, 7, -3f, properties);
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack stack) {
        return hurt(1, stack.copy());
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
