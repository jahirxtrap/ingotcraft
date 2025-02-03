package com.jahirtrap.ingotcraft.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.EnumMap;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModMaterials {
    public interface Armor {
        ArmorMaterial STEEL = new ArmorMaterial(25, createMap(new int[]{2, 5, 6, 2, 5}),
                9, SoundEvents.ARMOR_EQUIP_IRON, 1f, 0f, ModTags.Items.STEEL_INGOTS, ResourceLocation.fromNamespaceAndPath(MODID, "steel"));
        ArmorMaterial BRONZE = new ArmorMaterial(15, createMap(new int[]{2, 5, 6, 2, 5}),
                16, SoundEvents.ARMOR_EQUIP_GOLD, 0f, 0f, ModTags.Items.BRONZE_INGOTS, ResourceLocation.fromNamespaceAndPath(MODID, "bronze"));

        private static EnumMap<ArmorType, Integer> createMap(int[] values) {
            EnumMap<ArmorType, Integer> enumMap = new EnumMap<>(ArmorType.class);
            for (int i = 0; i < values.length; i++) enumMap.put(ArmorType.values()[i], values[i]);
            return enumMap;
        }
    }

    public interface Tool {
        ToolMaterial STEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 501, 6.5f, 2f, 14, ModTags.Items.STEEL_INGOTS);
        ToolMaterial BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 7f, 2f, 16, ModTags.Items.BRONZE_INGOTS);
        ToolMaterial STONE_PICK_HAMMER = copy(ToolMaterial.STONE, 1, 1);
        ToolMaterial IRON_PICK_HAMMER = copy(ToolMaterial.IRON, 1, 1);
        ToolMaterial GOLD_PICK_HAMMER = copy(ToolMaterial.GOLD, 5, 1);
        ToolMaterial DIAMOND_PICK_HAMMER = copy(ToolMaterial.DIAMOND, 1, 1);
        ToolMaterial NETHERITE_PICK_HAMMER = copy(ToolMaterial.NETHERITE, 1, 1);
        ToolMaterial STEEL_PICK_HAMMER = copy(ModMaterials.Tool.STEEL, 1, 1);
        ToolMaterial BRONZE_PICK_HAMMER = copy(ModMaterials.Tool.BRONZE, 1, 1);
        ToolMaterial ZURITE_PICK_HAMMER = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1320, 9.5f, 4f, 16, ModTags.Items.ZURITE_INGOTS);
        ToolMaterial ENDERITE_PICK_HAMMER = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 16f, 5f, 17, ModTags.Items.ENDERITE_INGOTS);

        private static ToolMaterial copy(ToolMaterial material, int i, float j) {
            return new ToolMaterial(material.incorrectBlocksForDrops(), material.durability() * i, material.speed() + j, material.attackDamageBonus(), material.enchantmentValue(), material.repairItems());
        }
    }
}
