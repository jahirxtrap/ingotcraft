package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IngotcraftModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IngotcraftMod.MODID);
    public static final RegistryObject<Item> RAW_STEEL = REGISTRY.register("raw_steel", RawSteelItem::new);
    public static final RegistryObject<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", RawBronzeItem::new);
    public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", RawLeadItem::new);
    public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", RawSilverItem::new);
    public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", RawTinItem::new);
    public static final RegistryObject<Item> RAW_STEEL_BLOCK = block(IngotcraftModBlocks.RAW_STEEL_BLOCK);
    public static final RegistryObject<Item> RAW_BRONZE_BLOCK = block(IngotcraftModBlocks.RAW_BRONZE_BLOCK);
    public static final RegistryObject<Item> RAW_LEAD_BLOCK = block(IngotcraftModBlocks.RAW_LEAD_BLOCK);
    public static final RegistryObject<Item> RAW_SILVER_BLOCK = block(IngotcraftModBlocks.RAW_SILVER_BLOCK);
    public static final RegistryObject<Item> RAW_TIN_BLOCK = block(IngotcraftModBlocks.RAW_TIN_BLOCK);
    public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", SteelIngotItem::new);
    public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", SteelSwordItem::new);
    public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", SteelPickaxeItem::new);
    public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", SteelAxeItem::new);
    public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", SteelShovelItem::new);
    public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", SteelHoeItem::new);
    public static final RegistryObject<Item> STEEL_HAMMER = REGISTRY.register("steel_hammer", SteelHammerItem::new);
    public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", BronzeIngotItem::new);
    public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", BronzeSwordItem::new);
    public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", BronzePickaxeItem::new);
    public static final RegistryObject<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", BronzeAxeItem::new);
    public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", BronzeShovelItem::new);
    public static final RegistryObject<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", BronzeHoeItem::new);
    public static final RegistryObject<Item> STEEL_HELMET = REGISTRY.register("steel_helmet", SteelItem.Helmet::new);
    public static final RegistryObject<Item> STEEL_CHESTPLATE = REGISTRY.register("steel_chestplate", SteelItem.Chestplate::new);
    public static final RegistryObject<Item> STEEL_LEGGINGS = REGISTRY.register("steel_leggings", SteelItem.Leggings::new);
    public static final RegistryObject<Item> STEEL_BOOTS = REGISTRY.register("steel_boots", SteelItem.Boots::new);
    public static final RegistryObject<Item> BRONZE_HELMET = REGISTRY.register("bronze_helmet", BronzeItem.Helmet::new);
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = REGISTRY.register("bronze_chestplate", BronzeItem.Chestplate::new);
    public static final RegistryObject<Item> BRONZE_LEGGINGS = REGISTRY.register("bronze_leggings", BronzeItem.Leggings::new);
    public static final RegistryObject<Item> BRONZE_BOOTS = REGISTRY.register("bronze_boots", BronzeItem.Boots::new);
    public static final RegistryObject<Item> BRONZE_HAMMER = REGISTRY.register("bronze_hammer", BronzeHammerItem::new);
    public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", LeadIngotItem::new);
    public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", SilverIngotItem::new);
    public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", TinIngotItem::new);
    public static final RegistryObject<Item> STEEL_BLOCK = block(IngotcraftModBlocks.STEEL_BLOCK);
    public static final RegistryObject<Item> BRONZE_BLOCK = block(IngotcraftModBlocks.BRONZE_BLOCK);
    public static final RegistryObject<Item> LEAD_BLOCK = block(IngotcraftModBlocks.LEAD_BLOCK);
    public static final RegistryObject<Item> SILVER_BLOCK = block(IngotcraftModBlocks.SILVER_BLOCK);
    public static final RegistryObject<Item> TIN_BLOCK = block(IngotcraftModBlocks.TIN_BLOCK);
    public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", SteelNuggetItem::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = REGISTRY.register("bronze_nugget", BronzeNuggetItem::new);
    public static final RegistryObject<Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", LeadNuggetItem::new);
    public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", SilverNuggetItem::new);
    public static final RegistryObject<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", TinNuggetItem::new);
    public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", CopperNuggetItem::new);
    public static final RegistryObject<Item> INVISIBLE_HELMET = REGISTRY.register("invisible_helmet", InvisibleItem.Helmet::new);
    public static final RegistryObject<Item> INVISIBLE_CHESTPLATE = REGISTRY.register("invisible_chestplate", InvisibleItem.Chestplate::new);
    public static final RegistryObject<Item> INVISIBLE_LEGGINGS = REGISTRY.register("invisible_leggings", InvisibleItem.Leggings::new);
    public static final RegistryObject<Item> INVISIBLE_BOOTS = REGISTRY.register("invisible_boots", InvisibleItem.Boots::new);
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_HELMET = REGISTRY.register("reinforced_invisible_helmet",
            ReinforcedInvisibleItem.Helmet::new);
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_CHESTPLATE = REGISTRY.register("reinforced_invisible_chestplate",
            ReinforcedInvisibleItem.Chestplate::new);
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_LEGGINGS = REGISTRY.register("reinforced_invisible_leggings",
            ReinforcedInvisibleItem.Leggings::new);
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_BOOTS = REGISTRY.register("reinforced_invisible_boots",
            ReinforcedInvisibleItem.Boots::new);
    public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", IronHammerItem::new);
    public static final RegistryObject<Item> GOLDEN_HAMMER = REGISTRY.register("golden_hammer", GoldenHammerItem::new);
    public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", DiamondHammerItem::new);
    public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", NetheriteHammerItem::new);

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
