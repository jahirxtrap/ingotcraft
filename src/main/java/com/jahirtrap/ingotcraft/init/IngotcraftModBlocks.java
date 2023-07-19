package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import com.jahirtrap.ingotcraft.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IngotcraftModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IngotcraftMod.MODID);
    public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", BronzeBlock::new);
    public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", LeadBlock::new);
    public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", SilverBlock::new);
    public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", TinBlock::new);
    public static final RegistryObject<Block> RAW_STEEL_BLOCK = REGISTRY.register("raw_steel_block", RawSteelBlock::new);
    public static final RegistryObject<Block> RAW_BRONZE_BLOCK = REGISTRY.register("raw_bronze_block", RawBronzeBlock::new);
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = REGISTRY.register("raw_lead_block", RawLeadBlock::new);
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = REGISTRY.register("raw_silver_block", RawSilverBlock::new);
    public static final RegistryObject<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", RawTinBlock::new);
}
