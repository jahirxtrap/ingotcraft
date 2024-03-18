package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public class StoneHammerItem extends BaseHammerItem {
    public StoneHammerItem() {
        super(131, 5f, 7f, 1, 5, Ingredient.of(new ItemStack(Blocks.COBBLESTONE)), new Item.Properties());
    }
}
