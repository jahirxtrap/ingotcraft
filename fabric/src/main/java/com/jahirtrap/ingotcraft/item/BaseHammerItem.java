package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.ContainerItem;
import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;
import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BaseHammerItem extends PickaxeItem implements ContainerItem, RepairableItem {
    public BaseHammerItem(Tier tier, Properties properties) {
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
    public boolean isRepairable() {
        return false;
    }
}
