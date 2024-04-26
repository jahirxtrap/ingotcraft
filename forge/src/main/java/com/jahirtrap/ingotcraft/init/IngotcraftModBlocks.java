package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.BaseBlock;
import com.jahirtrap.ingotcraft.block.BaseRawBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class IngotcraftModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final RegistryObject<Block> RAW_STEEL_BLOCK = REGISTRY.register("raw_steel_block", BaseRawBlock::new);
    public static final RegistryObject<Block> RAW_BRONZE_BLOCK = REGISTRY.register("raw_bronze_block", BaseRawBlock::new);
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = REGISTRY.register("raw_lead_block", BaseRawBlock::new);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = REGISTRY.register("raw_silver_block", BaseRawBlock::new);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", BaseRawBlock::new);
    public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new BaseBlock(Material.METAL, SoundType.METAL));
    public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BaseBlock(Material.METAL, SoundType.METAL));
    public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new BaseBlock(Material.METAL, SoundType.COPPER));
    public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new BaseBlock(Material.METAL, SoundType.METAL));
    public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new BaseBlock(Material.METAL, SoundType.METAL));
}
