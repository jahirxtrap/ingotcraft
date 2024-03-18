package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class IronHammerItem extends BaseHammerItem {
    public IronHammerItem() {
        super(250, 7f, 8f, 2, 14, Ingredient.of(new ItemStack(Items.IRON_INGOT)), new Item.Properties());
    }
}
