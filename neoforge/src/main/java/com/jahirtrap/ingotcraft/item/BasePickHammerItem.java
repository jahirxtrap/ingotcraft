package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;

import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BasePickHammerItem extends Item {
    public BasePickHammerItem(ToolMaterial material, Properties properties) {
        super(properties.pickaxe(material, 7f, -3f));
    }

    @Override
    public ItemStack getCraftingRemainder(ItemStack stack) {
        return hurt(1, stack.copy());
    }
}
