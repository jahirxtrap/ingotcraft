package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.crafting.Ingredient;

public class EnderiteHammerItem extends BaseHammerItem {
    public EnderiteHammerItem() {
        super(4096, 16f, 11f, 4, 17, Ingredient.EMPTY, new Properties().fireResistant());
    }
}
