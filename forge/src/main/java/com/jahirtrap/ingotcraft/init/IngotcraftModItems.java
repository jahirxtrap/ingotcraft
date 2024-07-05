package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;
import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public class IngotcraftModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final RegistryObject<Item> RAW_STEEL = REGISTRY.register("raw_steel", BaseItem::new);
    public static final RegistryObject<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", BaseItem::new);
    public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", BaseItem::new);
    public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", BaseItem::new);
    public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", BaseItem::new);
    public static final RegistryObject<Item> RAW_STEEL_BLOCK = block(IngotcraftModBlocks.RAW_STEEL_BLOCK);
    public static final RegistryObject<Item> RAW_BRONZE_BLOCK = block(IngotcraftModBlocks.RAW_BRONZE_BLOCK);
    public static final RegistryObject<Item> RAW_LEAD_BLOCK = block(IngotcraftModBlocks.RAW_LEAD_BLOCK);
    public static final RegistryObject<Item> RAW_SILVER_BLOCK = block(IngotcraftModBlocks.RAW_SILVER_BLOCK);
    public static final RegistryObject<Item> RAW_TIN_BLOCK = block(IngotcraftModBlocks.RAW_TIN_BLOCK);
    public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", BaseItem::new);
    public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", BaseItem::new);
    public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", BaseItem::new);
    public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", BaseItem::new);
    public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", BaseItem::new);
    public static final RegistryObject<Item> STEEL_BLOCK = block(IngotcraftModBlocks.STEEL_BLOCK);
    public static final RegistryObject<Item> BRONZE_BLOCK = block(IngotcraftModBlocks.BRONZE_BLOCK);
    public static final RegistryObject<Item> LEAD_BLOCK = block(IngotcraftModBlocks.LEAD_BLOCK);
    public static final RegistryObject<Item> SILVER_BLOCK = block(IngotcraftModBlocks.SILVER_BLOCK);
    public static final RegistryObject<Item> TIN_BLOCK = block(IngotcraftModBlocks.TIN_BLOCK);
    public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", BaseItem::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = REGISTRY.register("bronze_nugget", BaseItem::new);
    public static final RegistryObject<Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", BaseItem::new);
    public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", BaseItem::new);
    public static final RegistryObject<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", BaseItem::new);
    public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", BaseItem::new);
    public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new BaseSwordItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new BasePickaxeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new BaseAxeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new BaseShovelItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new BaseHoeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BaseSwordItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BasePickaxeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", () -> new BaseAxeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BaseShovelItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", () -> new BaseHoeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HELMET = REGISTRY.register("steel_helmet", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = REGISTRY.register("steel_chestplate", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = REGISTRY.register("steel_leggings", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = REGISTRY.register("steel_boots", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, EquipmentSlot.FEET, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HELMET = REGISTRY.register("bronze_helmet", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = REGISTRY.register("bronze_chestplate", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = REGISTRY.register("bronze_leggings", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BOOTS = REGISTRY.register("bronze_boots", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, EquipmentSlot.FEET, new Item.Properties()));
    public static final RegistryObject<Item> STONE_HAMMER = REGISTRY.register("stone_hammer", () -> new BaseHammerItem(IngotcraftTiers.STONE_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new BaseHammerItem(IngotcraftTiers.IRON_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HAMMER = REGISTRY.register("golden_hammer", () -> new BaseHammerItem(IngotcraftTiers.GOLD_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new BaseHammerItem(IngotcraftTiers.DIAMOND_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new BaseHammerItem(IngotcraftTiers.NETHERITE_HAMMER, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_HAMMER = REGISTRY.register("enderite_hammer", () -> new BaseHammerItem(IngotcraftTiers.ENDERITE_HAMMER, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> STEEL_HAMMER = REGISTRY.register("steel_hammer", () -> new BaseHammerItem(IngotcraftTiers.STEEL_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HAMMER = REGISTRY.register("bronze_hammer", () -> new BaseHammerItem(IngotcraftTiers.BRONZE_HAMMER, new Item.Properties()));

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(TAB_INGOTCRAFT)));
    }
}
