package com.jahirtrap.ingotcraft.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum IngotcraftMaterials implements ArmorMaterial {
    STEEL("ingotcraft:steel", 25, createMap(new int[]{2, 5, 6, 2}),
            9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(IngotcraftModItems.STEEL_INGOT.get())),
    BRONZE("ingotcraft:bronze", 15, createMap(new int[]{2, 5, 6, 2}),
            16, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.of(IngotcraftModItems.BRONZE_INGOT.get()));

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<Type, Integer> defense;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> ingredient;

    IngotcraftMaterials(String name, int durabilityMultiplier, EnumMap<Type, Integer> defense, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> ingredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.defense = defense;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.ingredient = ingredient;
    }

    public int getDurabilityForType(Type type) {
        return createMap(new int[]{13, 15, 16, 11}).get(type) * this.durabilityMultiplier;
    }

    public int getDefenseForType(Type type) {
        return this.defense.get(type);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.ingredient.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
