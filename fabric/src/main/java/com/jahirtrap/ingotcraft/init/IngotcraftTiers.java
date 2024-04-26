package com.jahirtrap.ingotcraft.init;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum IngotcraftTiers implements Tier {
    STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 501, 6.5f, 2f, 14, () -> Ingredient.of(IngotcraftModItems.STEEL_INGOT)),
    BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 7f, 2f, 16, () -> Ingredient.of(IngotcraftModItems.BRONZE_INGOT)),
    STONE_HAMMER(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 5f, 1f, 5, () -> Ingredient.of(ItemTags.STONE_TOOL_MATERIALS)),
    IRON_HAMMER(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 7f, 2f, 14, () -> Ingredient.of(Items.IRON_INGOT)),
    DIAMOND_HAMMER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 9f, 3f, 10, () -> Ingredient.of(Items.DIAMOND)),
    GOLD_HAMMER(BlockTags.INCORRECT_FOR_STONE_TOOL, 160, 13f, 0f, 22, () -> Ingredient.of(Items.GOLD_INGOT)),
    NETHERITE_HAMMER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 10f, 4f, 15, () -> Ingredient.of(Items.NETHERITE_INGOT)),
    STEEL_HAMMER(BlockTags.INCORRECT_FOR_IRON_TOOL, 501, 7.5f, 2f, 14, () -> Ingredient.of(IngotcraftModItems.STEEL_INGOT)),
    BRONZE_HAMMER(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 8f, 2f, 16, () -> Ingredient.of(IngotcraftModItems.BRONZE_INGOT)),
    ENDERITE_HAMMER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 16f, 5f, 17, () -> Ingredient.EMPTY);

    private final TagKey<Block> incorrect;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> ingredient;

    IngotcraftTiers(TagKey<Block> incorrect, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> ingredient) {
        this.incorrect = incorrect;
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

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrect;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }
}
