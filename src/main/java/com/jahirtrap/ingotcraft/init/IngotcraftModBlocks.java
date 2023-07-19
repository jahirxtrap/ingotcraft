package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IngotcraftModBlocks {
    private static final List<Block> REGISTRY = new ArrayList<>();
    public static final Block RAW_STEEL_BLOCK = register(new RawSteelBlock());
    public static final Block RAW_BRONZE_BLOCK = register(new RawBronzeBlock());
    public static final Block RAW_LEAD_BLOCK = register(new RawLeadBlock());
    public static final Block RAW_SILVER_BLOCK = register(new RawSilverBlock());
    public static final Block RAW_TIN_BLOCK = register(new RawTinBlock());
    public static final Block STEEL_BLOCK = register(new SteelBlock());
    public static final Block BRONZE_BLOCK = register(new BronzeBlock());
    public static final Block LEAD_BLOCK = register(new LeadBlock());
    public static final Block SILVER_BLOCK = register(new SilverBlock());
    public static final Block TIN_BLOCK = register(new TinBlock());

    private static Block register(Block block) {
        REGISTRY.add(block);
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
    }
}
