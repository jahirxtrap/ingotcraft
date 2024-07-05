package com.jahirtrap.ingotcraft.init;

import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum IngotcraftTiers implements Tier {
    STEEL(2, 501, 6.5f, 2f, 14, () -> Ingredient.of(IngotcraftModItems.STEEL_INGOT)),
    BRONZE(2, 350, 7f, 2f, 16, () -> Ingredient.of(IngotcraftModItems.BRONZE_INGOT)),
    STONE_HAMMER(1, 131, 5f, 1f, 5, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_HAMMER(2, 250, 7f, 2f, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    DIAMOND_HAMMER(3, 1561, 9f, 3f, 10, () -> Ingredient.of(Items.DIAMOND)),
    GOLD_HAMMER(1, 160, 13f, 0f, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    NETHERITE_HAMMER(4, 2031, 10f, 4f, 15, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    STEEL_HAMMER(2, 501, 7.5f, 2f, 14, () -> Ingredient.of(IngotcraftModItems.STEEL_INGOT)),
    BRONZE_HAMMER(2, 350, 8f, 2f, 16, () -> Ingredient.of(IngotcraftModItems.BRONZE_INGOT)),
    ENDERITE_HAMMER(4, 4096, 16f, 5f, 17, () -> Ingredient.EMPTY);

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    IngotcraftTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.ingredient = ingredient;
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
