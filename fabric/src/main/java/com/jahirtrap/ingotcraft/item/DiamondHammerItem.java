package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class DiamondHammerItem extends BaseHammerItem {
    public DiamondHammerItem() {
        super(1561, 9f, 9f, 3, 10, Ingredient.of(new ItemStack(Items.DIAMOND)), new Item.Properties());
    }
}
