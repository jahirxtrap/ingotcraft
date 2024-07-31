package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.BaseBlock;
import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModContent {
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new Item.Properties()));
    public static final Item RAW_BRONZE = registerItem("raw_bronze", new Item(new Item.Properties()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new Item.Properties()));
    public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Properties()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new Item.Properties()));
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block", new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final Block RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block", new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block", new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Properties()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new Item.Properties()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new Item.Properties()));
    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Properties()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new Item.Properties()));
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final Block LEAD_BLOCK = registerBlock("lead_block", new BaseBlock(MapColor.METAL, SoundType.COPPER), new Item.Properties());
    public static final Block SILVER_BLOCK = registerBlock("silver_block", new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final Block TIN_BLOCK = registerBlock("tin_block", new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new Item.Properties()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new Item.Properties()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new Item.Properties()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new Item.Properties()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new Item.Properties()));
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new Item.Properties()));
    public static final Item STEEL_SWORD = registerItem("steel_sword", new BaseSwordItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new BasePickaxeItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_AXE = registerItem("steel_axe", new BaseAxeItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new BaseShovelItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new BaseHoeItem(ModTiers.STEEL, new Item.Properties()));
    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new BaseSwordItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new BasePickaxeItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new BaseAxeItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new BaseShovelItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new BaseHoeItem(ModTiers.BRONZE, new Item.Properties()));
    public static final Item STEEL_HELMET = registerItem("steel_helmet", new BaseArmorItem(ModMaterials.STEEL, Type.HELMET, new Item.Properties()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate", new BaseArmorItem(ModMaterials.STEEL, Type.CHESTPLATE, new Item.Properties()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings", new BaseArmorItem(ModMaterials.STEEL, Type.LEGGINGS, new Item.Properties()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots", new BaseArmorItem(ModMaterials.STEEL, Type.BOOTS, new Item.Properties()));
    public static final Item BRONZE_HELMET = registerItem("bronze_helmet", new BaseArmorItem(ModMaterials.BRONZE, Type.HELMET, new Item.Properties()));
    public static final Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate", new BaseArmorItem(ModMaterials.BRONZE, Type.CHESTPLATE, new Item.Properties()));
    public static final Item BRONZE_LEGGINGS = registerItem("bronze_leggings", new BaseArmorItem(ModMaterials.BRONZE, Type.LEGGINGS, new Item.Properties()));
    public static final Item BRONZE_BOOTS = registerItem("bronze_boots", new BaseArmorItem(ModMaterials.BRONZE, Type.BOOTS, new Item.Properties()));
    public static final Item STONE_PICK_HAMMER = registerItem("stone_pick_hammer", new BasePickHammerItem(ModTiers.STONE_PICK_HAMMER, new Item.Properties()));
    public static final Item IRON_PICK_HAMMER = registerItem("iron_pick_hammer", new BasePickHammerItem(ModTiers.IRON_PICK_HAMMER, new Item.Properties()));
    public static final Item GOLDEN_PICK_HAMMER = registerItem("golden_pick_hammer", new BasePickHammerItem(ModTiers.GOLD_PICK_HAMMER, new Item.Properties()));
    public static final Item DIAMOND_PICK_HAMMER = registerItem("diamond_pick_hammer", new BasePickHammerItem(ModTiers.DIAMOND_PICK_HAMMER, new Item.Properties()));
    public static final Item NETHERITE_PICK_HAMMER = registerItem("netherite_pick_hammer", new BasePickHammerItem(ModTiers.NETHERITE_PICK_HAMMER, new Item.Properties().fireResistant()));
    public static final Item ENDERITE_PICK_HAMMER = registerItem("enderite_pick_hammer", new BasePickHammerItem(ModTiers.ENDERITE_PICK_HAMMER, new Item.Properties().fireResistant()));
    public static final Item STEEL_PICK_HAMMER = registerItem("steel_pick_hammer", new BasePickHammerItem(ModTiers.STEEL_PICK_HAMMER, new Item.Properties()));
    public static final Item BRONZE_PICK_HAMMER = registerItem("bronze_pick_hammer", new BasePickHammerItem(ModTiers.BRONZE_PICK_HAMMER, new Item.Properties()));

    public static Block registerBlock(String name, Block block, Item.Properties properties) {
        registerItem(name, new BlockItem(block, properties));
        return registerBlock(name, block);
    }

    public static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), item);
    }

    public static void init() {
    }
}
