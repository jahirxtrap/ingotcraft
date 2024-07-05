package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class IngotcraftModItems {
    public static final Item RAW_STEEL = RegistryObject("raw_steel", new Item(new Item.Properties()));
    public static final Item RAW_BRONZE = RegistryObject("raw_bronze", new Item(new Item.Properties()));
    public static final Item RAW_LEAD = RegistryObject("raw_lead", new Item(new Item.Properties()));
    public static final Item RAW_SILVER = RegistryObject("raw_silver", new Item(new Item.Properties()));
    public static final Item RAW_TIN = RegistryObject("raw_tin", new Item(new Item.Properties()));
    public static final Item STEEL_INGOT = RegistryObject("steel_ingot", new Item(new Item.Properties()));
    public static final Item BRONZE_INGOT = RegistryObject("bronze_ingot", new Item(new Item.Properties()));
    public static final Item LEAD_INGOT = RegistryObject("lead_ingot", new Item(new Item.Properties()));
    public static final Item SILVER_INGOT = RegistryObject("silver_ingot", new Item(new Item.Properties()));
    public static final Item TIN_INGOT = RegistryObject("tin_ingot", new Item(new Item.Properties()));
    public static final Item STEEL_NUGGET = RegistryObject("steel_nugget", new Item(new Item.Properties()));
    public static final Item BRONZE_NUGGET = RegistryObject("bronze_nugget", new Item(new Item.Properties()));
    public static final Item LEAD_NUGGET = RegistryObject("lead_nugget", new Item(new Item.Properties()));
    public static final Item SILVER_NUGGET = RegistryObject("silver_nugget", new Item(new Item.Properties()));
    public static final Item TIN_NUGGET = RegistryObject("tin_nugget", new Item(new Item.Properties()));
    public static final Item COPPER_NUGGET = RegistryObject("copper_nugget", new Item(new Item.Properties()));
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
    public static final Item STEEL_HELMET = RegistryObject("steel_helmet", new BaseArmorItem(IngotcraftMaterials.STEEL, Type.HELMET, 25, new Item.Properties()));
    public static final Item STEEL_CHESTPLATE = RegistryObject("steel_chestplate", new BaseArmorItem(IngotcraftMaterials.STEEL, Type.CHESTPLATE, 25, new Item.Properties()));
    public static final Item STEEL_LEGGINGS = RegistryObject("steel_leggings", new BaseArmorItem(IngotcraftMaterials.STEEL, Type.LEGGINGS, 25, new Item.Properties()));
    public static final Item STEEL_BOOTS = RegistryObject("steel_boots", new BaseArmorItem(IngotcraftMaterials.STEEL, Type.BOOTS, 25, new Item.Properties()));
    public static final Item BRONZE_HELMET = RegistryObject("bronze_helmet", new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.HELMET, 15, new Item.Properties()));
    public static final Item BRONZE_CHESTPLATE = RegistryObject("bronze_chestplate", new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.CHESTPLATE, 15, new Item.Properties()));
    public static final Item BRONZE_LEGGINGS = RegistryObject("bronze_leggings", new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.LEGGINGS, 15, new Item.Properties()));
    public static final Item BRONZE_BOOTS = RegistryObject("bronze_boots", new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.BOOTS, 15, new Item.Properties()));
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
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), item);
    }
}
