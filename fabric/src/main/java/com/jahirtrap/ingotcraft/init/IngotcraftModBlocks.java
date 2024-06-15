package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.BaseBlock;
import com.jahirtrap.ingotcraft.block.BaseRawBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class IngotcraftModBlocks {
    public static final Block RAW_STEEL_BLOCK = RegistryObject("raw_steel_block", new BaseRawBlock());
    public static final Block RAW_BRONZE_BLOCK = RegistryObject("raw_bronze_block", new BaseRawBlock());
    public static final Block RAW_LEAD_BLOCK = RegistryObject("raw_lead_block", new BaseRawBlock());
    public static final Block RAW_SILVER_BLOCK = RegistryObject("raw_silver_block", new BaseRawBlock());
    public static final Block RAW_TIN_BLOCK = RegistryObject("raw_tin_block", new BaseRawBlock());
    public static final Block STEEL_BLOCK = RegistryObject("steel_block", new BaseBlock(MapColor.METAL, SoundType.METAL));
    public static final Block BRONZE_BLOCK = RegistryObject("bronze_block", new BaseBlock(MapColor.METAL, SoundType.METAL));
    public static final Block LEAD_BLOCK = RegistryObject("lead_block", new BaseBlock(MapColor.METAL, SoundType.COPPER));
    public static final Block SILVER_BLOCK = RegistryObject("silver_block", new BaseBlock(MapColor.METAL, SoundType.METAL));
    public static final Block TIN_BLOCK = RegistryObject("tin_block", new BaseBlock(MapColor.METAL, SoundType.METAL));

    public static void init() {
    }

    public static Block RegistryObject(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name), block);
    }
}
