package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class BronzeHammerItem extends BaseHammerItem {
    public BronzeHammerItem() {
        super(350, 8f, 8f, 2, 16, Ingredient.of(new ItemStack(IngotcraftModItems.BRONZE_INGOT)), new Item.Properties());
    }
}
