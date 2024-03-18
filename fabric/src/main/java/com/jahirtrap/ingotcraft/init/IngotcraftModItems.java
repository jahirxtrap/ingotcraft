package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;
import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOT_CRAFT;

public class IngotcraftModItems {
    public static final Item RAW_STEEL = RegistryObject("raw_steel", new BaseItem());
    public static final Item RAW_BRONZE = RegistryObject("raw_bronze", new BaseItem());
    public static final Item RAW_LEAD = RegistryObject("raw_lead", new BaseItem());
    public static final Item RAW_SILVER = RegistryObject("raw_silver", new BaseItem());
    public static final Item RAW_TIN = RegistryObject("raw_tin", new BaseItem());
    public static final Item RAW_STEEL_BLOCK = block("raw_steel_block", IngotcraftModBlocks.RAW_STEEL_BLOCK);
    public static final Item RAW_BRONZE_BLOCK = block("raw_bronze_block", IngotcraftModBlocks.RAW_BRONZE_BLOCK);
    public static final Item RAW_LEAD_BLOCK = block("raw_lead_block", IngotcraftModBlocks.RAW_LEAD_BLOCK);
    public static final Item RAW_SILVER_BLOCK = block("raw_silver_block", IngotcraftModBlocks.RAW_SILVER_BLOCK);
    public static final Item RAW_TIN_BLOCK = block("raw_tin_block", IngotcraftModBlocks.RAW_TIN_BLOCK);
    public static final Item STEEL_INGOT = RegistryObject("steel_ingot", new BaseItem());
    public static final Item BRONZE_INGOT = RegistryObject("bronze_ingot", new BaseItem());
    public static final Item LEAD_INGOT = RegistryObject("lead_ingot", new BaseItem());
    public static final Item SILVER_INGOT = RegistryObject("silver_ingot", new BaseItem());
    public static final Item TIN_INGOT = RegistryObject("tin_ingot", new BaseItem());
    public static final Item STEEL_BLOCK = block("steel_block", IngotcraftModBlocks.STEEL_BLOCK);
    public static final Item BRONZE_BLOCK = block("bronze_block", IngotcraftModBlocks.BRONZE_BLOCK);
    public static final Item LEAD_BLOCK = block("lead_block", IngotcraftModBlocks.LEAD_BLOCK);
    public static final Item SILVER_BLOCK = block("silver_block", IngotcraftModBlocks.SILVER_BLOCK);
    public static final Item TIN_BLOCK = block("tin_block", IngotcraftModBlocks.TIN_BLOCK);
    public static final Item STEEL_NUGGET = RegistryObject("steel_nugget", new BaseItem());
    public static final Item BRONZE_NUGGET = RegistryObject("bronze_nugget", new BaseItem());
    public static final Item LEAD_NUGGET = RegistryObject("lead_nugget", new BaseItem());
    public static final Item SILVER_NUGGET = RegistryObject("silver_nugget", new BaseItem());
    public static final Item TIN_NUGGET = RegistryObject("tin_nugget", new BaseItem());
    public static final Item COPPER_NUGGET = RegistryObject("copper_nugget", new BaseItem());
    public static final Item STEEL_SWORD = RegistryObject("steel_sword", new SteelSwordItem());
    public static final Item STEEL_PICKAXE = RegistryObject("steel_pickaxe", new SteelPickaxeItem());
    public static final Item STEEL_AXE = RegistryObject("steel_axe", new SteelAxeItem());
    public static final Item STEEL_SHOVEL = RegistryObject("steel_shovel", new SteelShovelItem());
    public static final Item STEEL_HOE = RegistryObject("steel_hoe", new SteelHoeItem());
    public static final Item BRONZE_SWORD = RegistryObject("bronze_sword", new BronzeSwordItem());
    public static final Item BRONZE_PICKAXE = RegistryObject("bronze_pickaxe", new BronzePickaxeItem());
    public static final Item BRONZE_AXE = RegistryObject("bronze_axe", new BronzeAxeItem());
    public static final Item BRONZE_SHOVEL = RegistryObject("bronze_shovel", new BronzeShovelItem());
    public static final Item BRONZE_HOE = RegistryObject("bronze_hoe", new BronzeHoeItem());
    public static final Item STEEL_HELMET = RegistryObject("steel_helmet", new SteelArmor.Helmet());
    public static final Item STEEL_CHESTPLATE = RegistryObject("steel_chestplate", new SteelArmor.Chestplate());
    public static final Item STEEL_LEGGINGS = RegistryObject("steel_leggings", new SteelArmor.Leggings());
    public static final Item STEEL_BOOTS = RegistryObject("steel_boots", new SteelArmor.Boots());
    public static final Item BRONZE_HELMET = RegistryObject("bronze_helmet", new BronzeArmor.Helmet());
    public static final Item BRONZE_CHESTPLATE = RegistryObject("bronze_chestplate", new BronzeArmor.Chestplate());
    public static final Item BRONZE_LEGGINGS = RegistryObject("bronze_leggings", new BronzeArmor.Leggings());
    public static final Item BRONZE_BOOTS = RegistryObject("bronze_boots", new BronzeArmor.Boots());
    public static final Item INVISIBLE_HELMET = RegistryObject("invisible_helmet", new InvisibleArmor.Helmet());
    public static final Item INVISIBLE_CHESTPLATE = RegistryObject("invisible_chestplate", new InvisibleArmor.Chestplate());
    public static final Item INVISIBLE_LEGGINGS = RegistryObject("invisible_leggings", new InvisibleArmor.Leggings());
    public static final Item INVISIBLE_BOOTS = RegistryObject("invisible_boots", new InvisibleArmor.Boots());
    public static final Item REINFORCED_INVISIBLE_HELMET = RegistryObject("reinforced_invisible_helmet", new ReinforcedInvisibleArmor.Helmet());
    public static final Item REINFORCED_INVISIBLE_CHESTPLATE = RegistryObject("reinforced_invisible_chestplate", new ReinforcedInvisibleArmor.Chestplate());
    public static final Item REINFORCED_INVISIBLE_LEGGINGS = RegistryObject("reinforced_invisible_leggings", new ReinforcedInvisibleArmor.Leggings());
    public static final Item REINFORCED_INVISIBLE_BOOTS = RegistryObject("reinforced_invisible_boots", new ReinforcedInvisibleArmor.Boots());
    public static final Item STONE_HAMMER = RegistryObject("stone_hammer", new StoneHammerItem());
    public static final Item IRON_HAMMER = RegistryObject("iron_hammer", new IronHammerItem());
    public static final Item GOLDEN_HAMMER = RegistryObject("golden_hammer", new GoldenHammerItem());
    public static final Item DIAMOND_HAMMER = RegistryObject("diamond_hammer", new DiamondHammerItem());
    public static final Item NETHERITE_HAMMER = RegistryObject("netherite_hammer", new NetheriteHammerItem());
    public static final Item ENDERITE_HAMMER = RegistryObject("enderite_hammer", new EnderiteHammerItem());
    public static final Item STEEL_HAMMER = RegistryObject("steel_hammer", new SteelHammerItem());
    public static final Item BRONZE_HAMMER = RegistryObject("bronze_hammer", new BronzeHammerItem());

    public static void init() {
    }

    public static Item RegistryObject(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MODID, name), item);
    }

    public static Item block(String name, Block block) {
        return Registry.register(Registry.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new Item.Properties().tab(TAB_INGOT_CRAFT)));
    }
}
