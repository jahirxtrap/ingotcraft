package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ToolMaterial;

import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BasePickHammerItem extends PickaxeItem implements RepairableItem {
    public BasePickHammerItem(ToolMaterial material, Properties properties) {
        super(material, 7f, -3f, properties);
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        return hurt(1, stack.copy());
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
