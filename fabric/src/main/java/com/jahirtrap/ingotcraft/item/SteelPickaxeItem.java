package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelPickaxeItem extends BasePickaxeItem {
    public SteelPickaxeItem() {
        super(501, 6.5f, 2f, 2, 14, Ingredient.of(new ItemStack(IngotcraftModItems.STEEL_INGOT)), new Item.Properties());
    }
}
