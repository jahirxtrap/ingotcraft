package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;

import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BasePickHammerItem extends Item implements RepairableItem, FabricItem {
    public BasePickHammerItem(ToolMaterial material, Properties properties) {
        super(properties.pickaxe(material, 7f, -3f));
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
