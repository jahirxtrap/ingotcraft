package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class IngotcraftModItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> RAW_STEEL = REGISTRY.register("raw_steel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_STEEL_BLOCK = block(IngotcraftModBlocks.RAW_STEEL_BLOCK);
    public static final DeferredItem<Item> RAW_BRONZE_BLOCK = block(IngotcraftModBlocks.RAW_BRONZE_BLOCK);
    public static final DeferredItem<Item> RAW_LEAD_BLOCK = block(IngotcraftModBlocks.RAW_LEAD_BLOCK);
    public static final DeferredItem<Item> RAW_SILVER_BLOCK = block(IngotcraftModBlocks.RAW_SILVER_BLOCK);
    public static final DeferredItem<Item> RAW_TIN_BLOCK = block(IngotcraftModBlocks.RAW_TIN_BLOCK);
    public static final DeferredItem<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BLOCK = block(IngotcraftModBlocks.STEEL_BLOCK);
    public static final DeferredItem<Item> BRONZE_BLOCK = block(IngotcraftModBlocks.BRONZE_BLOCK);
    public static final DeferredItem<Item> LEAD_BLOCK = block(IngotcraftModBlocks.LEAD_BLOCK);
    public static final DeferredItem<Item> SILVER_BLOCK = block(IngotcraftModBlocks.SILVER_BLOCK);
    public static final DeferredItem<Item> TIN_BLOCK = block(IngotcraftModBlocks.TIN_BLOCK);
    public static final DeferredItem<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = REGISTRY.register("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new BaseSwordItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new BasePickaxeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new BaseAxeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new BaseShovelItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new BaseHoeItem(IngotcraftTiers.STEEL, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BaseSwordItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BasePickaxeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", () -> new BaseAxeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BaseShovelItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", () -> new BaseHoeItem(IngotcraftTiers.BRONZE, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_HELMET = REGISTRY.register("steel_helmet", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, Type.HELMET, 25, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_CHESTPLATE = REGISTRY.register("steel_chestplate", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, Type.CHESTPLATE, 25, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_LEGGINGS = REGISTRY.register("steel_leggings", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, Type.LEGGINGS, 25, new Item.Properties()));
    public static final DeferredItem<Item> STEEL_BOOTS = REGISTRY.register("steel_boots", () -> new BaseArmorItem(IngotcraftMaterials.STEEL, Type.BOOTS, 25, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_HELMET = REGISTRY.register("bronze_helmet", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.HELMET, 15, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_CHESTPLATE = REGISTRY.register("bronze_chestplate", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.CHESTPLATE, 15, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_LEGGINGS = REGISTRY.register("bronze_leggings", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.LEGGINGS, 15, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_BOOTS = REGISTRY.register("bronze_boots", () -> new BaseArmorItem(IngotcraftMaterials.BRONZE, Type.BOOTS, 15, new Item.Properties()));
    public static final DeferredItem<Item> INVISIBLE_HELMET = REGISTRY.register("invisible_helmet", () -> new BaseArmorItem(IngotcraftMaterials.INVISIBLE, Type.HELMET, 15, new Item.Properties()));
    public static final DeferredItem<Item> INVISIBLE_CHESTPLATE = REGISTRY.register("invisible_chestplate", () -> new BaseArmorItem(IngotcraftMaterials.INVISIBLE, Type.CHESTPLATE, 15, new Item.Properties()));
    public static final DeferredItem<Item> INVISIBLE_LEGGINGS = REGISTRY.register("invisible_leggings", () -> new BaseArmorItem(IngotcraftMaterials.INVISIBLE, Type.LEGGINGS, 15, new Item.Properties()));
    public static final DeferredItem<Item> INVISIBLE_BOOTS = REGISTRY.register("invisible_boots", () -> new BaseArmorItem(IngotcraftMaterials.INVISIBLE, Type.BOOTS, 15, new Item.Properties()));
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_HELMET = REGISTRY.register("reinforced_invisible_helmet", () -> new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, Type.HELMET, 30, new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_CHESTPLATE = REGISTRY.register("reinforced_invisible_chestplate", () -> new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, Type.CHESTPLATE, 30, new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_LEGGINGS = REGISTRY.register("reinforced_invisible_leggings", () -> new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, Type.LEGGINGS, 30, new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_BOOTS = REGISTRY.register("reinforced_invisible_boots", () -> new BaseArmorItem(IngotcraftMaterials.REINFORCED_INVISIBLE, Type.BOOTS, 30, new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> STONE_HAMMER = REGISTRY.register("stone_hammer", () -> new BaseHammerItem(IngotcraftTiers.STONE_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new BaseHammerItem(IngotcraftTiers.IRON_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_HAMMER = REGISTRY.register("golden_hammer", () -> new BaseHammerItem(IngotcraftTiers.GOLD_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new BaseHammerItem(IngotcraftTiers.DIAMOND_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new BaseHammerItem(IngotcraftTiers.NETHERITE_HAMMER, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> ENDERITE_HAMMER = REGISTRY.register("enderite_hammer", () -> new BaseHammerItem(IngotcraftTiers.ENDERITE_HAMMER, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> STEEL_HAMMER = REGISTRY.register("steel_hammer", () -> new BaseHammerItem(IngotcraftTiers.STEEL_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_HAMMER = REGISTRY.register("bronze_hammer", () -> new BaseHammerItem(IngotcraftTiers.BRONZE_HAMMER, new Item.Properties()));

    private static DeferredItem<Item> block(DeferredBlock<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
