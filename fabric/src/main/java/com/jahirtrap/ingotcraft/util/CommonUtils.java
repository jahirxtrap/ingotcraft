package com.jahirtrap.ingotcraft.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CommonUtils {
    public static ItemStack hurt(int amount, ItemStack stack) {
        stack = stack.copy();
        if (!stack.isDamageableItem()) return stack;
        stack.setDamageValue(stack.getDamageValue() + amount);
        if (stack.getDamageValue() >= stack.getMaxDamage()) stack.shrink(1);

        return stack;
    }

    public static TagKey<Item> itemTag(String string) {
        return TagKey.create(Registries.ITEM, ResourceLocation.parse(string));
    }
}
