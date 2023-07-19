package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IngotcraftModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IngotcraftMod.MODID);
    public static final RegistryObject<Item> STEEL_SWORD = REGISTRY.register("steel_sword", () -> new SteelSwordItem());
    public static final RegistryObject<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", () -> new SteelPickaxeItem());
    public static final RegistryObject<Item> STEEL_AXE = REGISTRY.register("steel_axe", () -> new SteelAxeItem());
    public static final RegistryObject<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", () -> new SteelShovelItem());
    public static final RegistryObject<Item> STEEL_HOE = REGISTRY.register("steel_hoe", () -> new SteelHoeItem());
    public static final RegistryObject<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", () -> new BronzeSwordItem());
    public static final RegistryObject<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", () -> new BronzePickaxeItem());
    public static final RegistryObject<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", () -> new BronzeAxeItem());
    public static final RegistryObject<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", () -> new BronzeShovelItem());
    public static final RegistryObject<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", () -> new BronzeHoeItem());
    public static final RegistryObject<Item> RAW_STEEL = REGISTRY.register("raw_steel", () -> new RawSteelItem());
    public static final RegistryObject<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", () -> new RawBronzeItem());
    public static final RegistryObject<Item> RAW_LEAD = REGISTRY.register("raw_lead", () -> new RawLeadItem());
    public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
    public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());
    public static final RegistryObject<Item> RAW_STEEL_BLOCK = block(IngotcraftModBlocks.RAW_STEEL_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> RAW_BRONZE_BLOCK = block(IngotcraftModBlocks.RAW_BRONZE_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> RAW_LEAD_BLOCK = block(IngotcraftModBlocks.RAW_LEAD_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> RAW_SILVER_BLOCK = block(IngotcraftModBlocks.RAW_SILVER_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> RAW_TIN_BLOCK = block(IngotcraftModBlocks.RAW_TIN_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
    public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
    public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
    public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
    public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new TinIngotItem());
    public static final RegistryObject<Item> STEEL_BLOCK = block(IngotcraftModBlocks.STEEL_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> BRONZE_BLOCK = block(IngotcraftModBlocks.BRONZE_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> LEAD_BLOCK = block(IngotcraftModBlocks.LEAD_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> SILVER_BLOCK = block(IngotcraftModBlocks.SILVER_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> TIN_BLOCK = block(IngotcraftModBlocks.TIN_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final RegistryObject<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", () -> new SteelNuggetItem());
    public static final RegistryObject<Item> BRONZE_NUGGET = REGISTRY.register("bronze_nugget", () -> new BronzeNuggetItem());
    public static final RegistryObject<Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", () -> new LeadNuggetItem());
    public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
    public static final RegistryObject<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", () -> new TinNuggetItem());
    public static final RegistryObject<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", () -> new CopperNuggetItem());
    public static final RegistryObject<Item> STEEL_HELMET = REGISTRY.register("steel_helmet", () -> new SteelItem.Helmet());
    public static final RegistryObject<Item> STEEL_CHESTPLATE = REGISTRY.register("steel_chestplate", () -> new SteelItem.Chestplate());
    public static final RegistryObject<Item> STEEL_LEGGINGS = REGISTRY.register("steel_leggings", () -> new SteelItem.Leggings());
    public static final RegistryObject<Item> STEEL_BOOTS = REGISTRY.register("steel_boots", () -> new SteelItem.Boots());
    public static final RegistryObject<Item> BRONZE_HELMET = REGISTRY.register("bronze_helmet", () -> new BronzeItem.Helmet());
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = REGISTRY.register("bronze_chestplate", () -> new BronzeItem.Chestplate());
    public static final RegistryObject<Item> BRONZE_LEGGINGS = REGISTRY.register("bronze_leggings", () -> new BronzeItem.Leggings());
    public static final RegistryObject<Item> BRONZE_BOOTS = REGISTRY.register("bronze_boots", () -> new BronzeItem.Boots());
    public static final RegistryObject<Item> INVISIBLE_HELMET = REGISTRY.register("invisible_helmet", () -> new InvisibleItem.Helmet());
    public static final RegistryObject<Item> INVISIBLE_CHESTPLATE = REGISTRY.register("invisible_chestplate", () -> new InvisibleItem.Chestplate());
    public static final RegistryObject<Item> INVISIBLE_LEGGINGS = REGISTRY.register("invisible_leggings", () -> new InvisibleItem.Leggings());
    public static final RegistryObject<Item> INVISIBLE_BOOTS = REGISTRY.register("invisible_boots", () -> new InvisibleItem.Boots());
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_HELMET = REGISTRY.register("reinforced_invisible_helmet",
            () -> new ReinforcedInvisibleItem.Helmet());
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_CHESTPLATE = REGISTRY.register("reinforced_invisible_chestplate",
            () -> new ReinforcedInvisibleItem.Chestplate());
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_LEGGINGS = REGISTRY.register("reinforced_invisible_leggings",
            () -> new ReinforcedInvisibleItem.Leggings());
    public static final RegistryObject<Item> REINFORCED_INVISIBLE_BOOTS = REGISTRY.register("reinforced_invisible_boots",
            () -> new ReinforcedInvisibleItem.Boots());
    public static final RegistryObject<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", () -> new IronHammerItem());
    public static final RegistryObject<Item> GOLDEN_HAMMER = REGISTRY.register("golden_hammer", () -> new GoldenHammerItem());
    public static final RegistryObject<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", () -> new DiamondHammerItem());
    public static final RegistryObject<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", () -> new NetheriteHammerItem());
    public static final RegistryObject<Item> STEEL_HAMMER = REGISTRY.register("steel_hammer", () -> new SteelHammerItem());
    public static final RegistryObject<Item> BRONZE_HAMMER = REGISTRY.register("bronze_hammer", () -> new BronzeHammerItem());

    private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
}
