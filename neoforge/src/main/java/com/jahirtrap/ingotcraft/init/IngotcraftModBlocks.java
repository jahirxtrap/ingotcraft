package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.BaseBlock;
import com.jahirtrap.ingotcraft.block.BaseRawBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class IngotcraftModBlocks {
    public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<Block> RAW_STEEL_BLOCK = REGISTRY.register("raw_steel_block", BaseRawBlock::new);
    public static final DeferredBlock<Block> RAW_BRONZE_BLOCK = REGISTRY.register("raw_bronze_block", BaseRawBlock::new);
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = REGISTRY.register("raw_lead_block", BaseRawBlock::new);
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = REGISTRY.register("raw_silver_block", BaseRawBlock::new);
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", BaseRawBlock::new);
    public static final DeferredBlock<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL));
    public static final DeferredBlock<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL));
    public static final DeferredBlock<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new BaseBlock(MapColor.METAL, SoundType.COPPER));
    public static final DeferredBlock<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL));
    public static final DeferredBlock<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL));
}
