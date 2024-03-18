package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class GoldenHammerItem extends BaseHammerItem {
    public GoldenHammerItem() {
        super(160, 13f, 6f, 1, 22, Ingredient.of(new ItemStack(Items.GOLD_INGOT)), new Item.Properties());
    }
}
