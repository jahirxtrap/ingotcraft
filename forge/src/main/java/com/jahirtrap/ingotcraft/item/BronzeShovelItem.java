package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public class BronzeShovelItem extends BaseShovelItem {
    public BronzeShovelItem() {
        super(350, 7f, 2.5f, 2, 16, Ingredient.of(new ItemStack(IngotcraftModItems.BRONZE_INGOT.get())), new Item.Properties());
    }
}
