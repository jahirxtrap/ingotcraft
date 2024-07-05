package com.jahirtrap.ingotcraft.init;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class IngotcraftMaterials {
    public static final Holder<ArmorMaterial> STEEL, BRONZE;

    static {
        STEEL = register("ingotcraft:steel", createMap(new int[]{2, 5, 6, 2, 5}),
                9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, () -> Ingredient.of(IngotcraftModItems.STEEL_INGOT.get()));
        BRONZE = register("ingotcraft:bronze", createMap(new int[]{2, 5, 6, 2, 5}),
                16, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, () -> Ingredient.of(IngotcraftModItems.BRONZE_INGOT.get()));
    }

    private static EnumMap<Type, Integer> createMap(int[] values) {
        EnumMap<Type, Integer> enumMap = new EnumMap<>(Type.class);
        for (int i = 0; i < values.length; i++) enumMap.put(Type.values()[i], values[i]);
        return enumMap;
    }

    private static Holder<ArmorMaterial> register(String string, EnumMap<Type, Integer> defense, int i, Holder<SoundEvent> holder, float f, float g, Supplier<Ingredient> supplier) {
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, ResourceLocation.parse(string), new ArmorMaterial(defense, i, holder, supplier, List.of(new ArmorMaterial.Layer(ResourceLocation.parse(string))), f, g));
    }
}
