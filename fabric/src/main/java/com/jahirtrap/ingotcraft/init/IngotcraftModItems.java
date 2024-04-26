package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;
import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public class IngotcraftModItems {
    public static final Item RAW_STEEL = RegistryObject("raw_steel", new BaseItem());
    public static final Item RAW_BRONZE = RegistryObject("raw_bronze", new BaseItem());
    public static final Item RAW_LEAD = RegistryObject("raw_lead", new BaseItem());
    public static final Item RAW_SILVER = RegistryObject("raw_silver", new BaseItem());
    public static final Item RAW_TIN = RegistryObject("raw_tin", new BaseItem());
    public static final Item RAW_STEEL_BLOCK = block("raw_steel_block", IngotcraftModBlocks.RAW_STEEL_BLOCK);
    public static final Item RAW_BRONZE_BLOCK = block("raw_bronze_block", IngotcraftModBlocks.RAW_BRONZE_BLOCK);
    public static final Item RAW_LEAD_BLOCK = block("raw_lead_block", IngotcraftModBlocks.RAW_LEAD_BLOCK);
    public static final Item RAW_SILVER_BLOCK = block("raw_silver_block", IngotcraftModBlocks.RAW_SILVER_BLOCK);
    public static final Item RAW_TIN_BLOCK = block("raw_tin_block", IngotcraftModBlocks.RAW_TIN_BLOCK);
    public static final Item STEEL_INGOT = RegistryObject("steel_ingot", new BaseItem());
    public static final Item BRONZE_INGOT = RegistryObject("bronze_ingot", new BaseItem());
    public static final Item LEAD_INGOT = RegistryObject("lead_ingot", new BaseItem());
    public static final Item SILVER_INGOT = RegistryObject("silver_ingot", new BaseItem());
    public static final Item TIN_INGOT = RegistryObject("tin_ingot", new BaseItem());
    public static final Item STEEL_BLOCK = block("steel_block", IngotcraftModBlocks.STEEL_BLOCK);
    public static final Item BRONZE_BLOCK = block("bronze_block", IngotcraftModBlocks.BRONZE_BLOCK);
    public static final Item LEAD_BLOCK = block("lead_block", IngotcraftModBlocks.LEAD_BLOCK);
    public static final Item SILVER_BLOCK = block("silver_block", IngotcraftModBlocks.SILVER_BLOCK);
    public static final Item TIN_BLOCK = block("tin_block", IngotcraftModBlocks.TIN_BLOCK);
    public static final Item STEEL_NUGGET = RegistryObject("steel_nugget", new BaseItem());
    public static final Item BRONZE_NUGGET = RegistryObject("bronze_nugget", new BaseItem());
    public static final Item LEAD_NUGGET = RegistryObject("lead_nugget", new BaseItem());
    public static final Item SILVER_NUGGET = RegistryObject("silver_nugget", new BaseItem());
    public static final Item TIN_NUGGET = RegistryObject("tin_nugget", new BaseItem());
    public static final Item COPPER_NUGGET = RegistryObject("copper_nugget", new BaseItem());
    public static final Item STEEL_SWORD = RegistryObject("steel_sword", new BaseSwordItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_PICKAXE = RegistryObject("steel_pickaxe", new BasePickaxeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_AXE = RegistryObject("steel_axe", new BaseAxeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_SHOVEL = RegistryObject("steel_shovel", new BaseShovelItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_HOE = RegistryObject("steel_hoe", new BaseHoeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final Item BRONZE_SWORD = RegistryObject("bronze_sword", new BaseSwordItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_PICKAXE = RegistryObject("bronze_pickaxe", new BasePickaxeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_AXE = RegistryObject("bronze_axe", new BaseAxeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_SHOVEL = RegistryObject("bronze_shovel", new BaseShovelItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_HOE = RegistryObject("bronze_hoe", new BaseHoeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final Item STEEL_HELMET = RegistryObject("steel_helmet", new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.HEAD, new Item.Properties()));
    public static final Item STEEL_CHESTPLATE = RegistryObject("steel_chestplate", new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.CHEST, new Item.Properties()));
    public static final Item STEEL_LEGGINGS = RegistryObject("steel_leggings", new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.LEGS, new Item.Properties()));
    public static final Item STEEL_BOOTS = RegistryObject("steel_boots", new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.FEET, new Item.Properties()));
    public static final Item BRONZE_HELMET = RegistryObject("bronze_helmet", new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final Item BRONZE_CHESTPLATE = RegistryObject("bronze_chestplate", new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final Item BRONZE_LEGGINGS = RegistryObject("bronze_leggings", new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final Item BRONZE_BOOTS = RegistryObject("bronze_boots", new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.FEET, new Item.Properties()));
    public static final Item INVISIBLE_HELMET = RegistryObject("invisible_helmet", new BaseArmorItem(IngotcraftMaterials.INVISIBLE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final Item INVISIBLE_CHESTPLATE = RegistryObject("invisible_chestplate", new BaseArmorItem(IngotcraftMaterials.INVISIBLE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final Item INVISIBLE_LEGGINGS = RegistryObject("invisible_leggings", new BaseArmorItem(IngotcraftMaterials.INVISIBLE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final Item INVISIBLE_BOOTS = RegistryObject("invisible_boots", new BaseArmorItem(IngotcraftMaterials.INVISIBLE, EquipmentSlot.FEET, new Item.Properties()));
    public static final Item REINFORCED_INVISIBLE_HELMET = RegistryObject("reinforced_invisible_helmet", new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, EquipmentSlot.HEAD, new Item.Properties().rarity(Rarity.RARE)));
    public static final Item REINFORCED_INVISIBLE_CHESTPLATE = RegistryObject("reinforced_invisible_chestplate", new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, EquipmentSlot.CHEST, new Item.Properties().rarity(Rarity.RARE)));
    public static final Item REINFORCED_INVISIBLE_LEGGINGS = RegistryObject("reinforced_invisible_leggings", new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, EquipmentSlot.LEGS, new Item.Properties().rarity(Rarity.RARE)));
    public static final Item REINFORCED_INVISIBLE_BOOTS = RegistryObject("reinforced_invisible_boots", new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, EquipmentSlot.FEET, new Item.Properties().rarity(Rarity.RARE)));
    public static final Item STONE_HAMMER = RegistryObject("stone_hammer", new BaseHammerItem(IngotcraftTiers.STONE_HAMMER, new Item.Properties()));
    public static final Item IRON_HAMMER = RegistryObject("iron_hammer", new BaseHammerItem(IngotcraftTiers.IRON_HAMMER, new Item.Properties()));
    public static final Item GOLDEN_HAMMER = RegistryObject("golden_hammer", new BaseHammerItem(IngotcraftTiers.GOLD_HAMMER, new Item.Properties()));
    public static final Item DIAMOND_HAMMER = RegistryObject("diamond_hammer", new BaseHammerItem(IngotcraftTiers.DIAMOND_HAMMER, new Item.Properties()));
    public static final Item NETHERITE_HAMMER = RegistryObject("netherite_hammer", new BaseHammerItem(IngotcraftTiers.NETHERITE_HAMMER, new Item.Properties().fireResistant()));
    public static final Item ENDERITE_HAMMER = RegistryObject("enderite_hammer", new BaseHammerItem(IngotcraftTiers.ENDERITE_HAMMER, new Item.Properties().fireResistant()));
    public static final Item STEEL_HAMMER = RegistryObject("steel_hammer", new BaseHammerItem(IngotcraftTiers.STEEL_HAMMER, new Item.Properties()));
    public static final Item BRONZE_HAMMER = RegistryObject("bronze_hammer", new BaseHammerItem(IngotcraftTiers.BRONZE_HAMMER, new Item.Properties()));

    public static void init() {
    }

    public static Item RegistryObject(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MODID, name), item);
    }

    public static Item block(String name, Block block) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new Item.Properties().tab(TAB_INGOTCRAFT)));
    }
}
