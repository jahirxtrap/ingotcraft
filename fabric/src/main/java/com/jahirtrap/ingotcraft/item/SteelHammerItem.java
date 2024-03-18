package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelHammerItem extends BaseHammerItem {
    public SteelHammerItem() {
        super(501, 7.5f, 8f, 2, 14, Ingredient.of(new ItemStack(IngotcraftModItems.STEEL_INGOT)), new Item.Properties());
    }
}
