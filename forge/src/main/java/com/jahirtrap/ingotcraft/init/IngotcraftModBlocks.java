package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import com.jahirtrap.ingotcraft.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IngotcraftModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IngotcraftMod.MODID);
    public static final RegistryObject<Block> RAW_STEEL_BLOCK = REGISTRY.register("raw_steel_block", () -> new RawSteelBlock());
    public static final RegistryObject<Block> RAW_BRONZE_BLOCK = REGISTRY.register("raw_bronze_block", () -> new RawBronzeBlock());
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = REGISTRY.register("raw_lead_block", () -> new RawLeadBlock());
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = REGISTRY.register("raw_silver_block", () -> new RawSilverBlock());
    public static final RegistryObject<Block> RAW_TIN_BLOCK = REGISTRY.register("raw_tin_block", () -> new RawTinBlock());
    public static final RegistryObject<Block> STEEL_BLOCK = REGISTRY.register("steel_block", () -> new SteelBlock());
    public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlock());
    public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlock());
    public static final RegistryObject<Block> SILVER_BLOCK = REGISTRY.register("silver_block", () -> new SilverBlock());
    public static final RegistryObject<Block> TIN_BLOCK = REGISTRY.register("tin_block", () -> new TinBlock());
}
