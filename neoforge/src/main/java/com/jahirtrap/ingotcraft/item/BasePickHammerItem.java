package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.CraftingRemainderItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ToolMaterial;

import static com.jahirtrap.ingotcraft.util.CommonUtils.hurt;

public class BasePickHammerItem extends Item implements CraftingRemainderItem {
    public BasePickHammerItem(ToolMaterial material, Properties properties) {
        super(properties.pickaxe(material, 7f, -3f));
    }

    @Override
    public ItemStackTemplate getCraftingRemainder(ItemStack stack) {
        return ItemStackTemplate.fromNonEmptyStack(hurt(1, stack.copy()));
    }

    @Override
    public boolean isCombineRepairable(ItemStack stack) {
        return false;
    }
}
