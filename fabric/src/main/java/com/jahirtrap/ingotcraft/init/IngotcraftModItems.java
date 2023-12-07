package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class IngotcraftModItems {
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
    public static final Item RAW_STEEL = RegistryObject("raw_steel", new RawSteelItem());
    public static final Item RAW_BRONZE = RegistryObject("raw_bronze", new RawBronzeItem());
    public static final Item RAW_LEAD = RegistryObject("raw_lead", new RawLeadItem());
    public static final Item RAW_SILVER = RegistryObject("raw_silver", new RawSilverItem());
    public static final Item RAW_TIN = RegistryObject("raw_tin", new RawTinItem());
    public static final Item STEEL_INGOT = RegistryObject("steel_ingot", new SteelIngotItem());
    public static final Item BRONZE_INGOT = RegistryObject("bronze_ingot", new BronzeIngotItem());
    public static final Item LEAD_INGOT = RegistryObject("lead_ingot", new LeadIngotItem());
    public static final Item SILVER_INGOT = RegistryObject("silver_ingot", new SilverIngotItem());
    public static final Item TIN_INGOT = RegistryObject("tin_ingot", new TinIngotItem());
    public static final Item STEEL_NUGGET = RegistryObject("steel_nugget", new SteelNuggetItem());
    public static final Item BRONZE_NUGGET = RegistryObject("bronze_nugget", new BronzeNuggetItem());
    public static final Item LEAD_NUGGET = RegistryObject("lead_nugget", new LeadNuggetItem());
    public static final Item SILVER_NUGGET = RegistryObject("silver_nugget", new SilverNuggetItem());
    public static final Item TIN_NUGGET = RegistryObject("tin_nugget", new TinNuggetItem());
    public static final Item COPPER_NUGGET = RegistryObject("copper_nugget", new CopperNuggetItem());
    public static final Item STEEL_HELMET = RegistryObject("steel_helmet", new SteelItem.Helmet());
    public static final Item STEEL_CHESTPLATE = RegistryObject("steel_chestplate", new SteelItem.Chestplate());
    public static final Item STEEL_LEGGINGS = RegistryObject("steel_leggings", new SteelItem.Leggings());
    public static final Item STEEL_BOOTS = RegistryObject("steel_boots", new SteelItem.Boots());
    public static final Item BRONZE_HELMET = RegistryObject("bronze_helmet", new BronzeItem.Helmet());
    public static final Item BRONZE_CHESTPLATE = RegistryObject("bronze_chestplate", new BronzeItem.Chestplate());
    public static final Item BRONZE_LEGGINGS = RegistryObject("bronze_leggings", new BronzeItem.Leggings());
    public static final Item BRONZE_BOOTS = RegistryObject("bronze_boots", new BronzeItem.Boots());
    public static final Item INVISIBLE_HELMET = RegistryObject("invisible_helmet", new InvisibleItem.Helmet());
    public static final Item INVISIBLE_CHESTPLATE = RegistryObject("invisible_chestplate", new InvisibleItem.Chestplate());
    public static final Item INVISIBLE_LEGGINGS = RegistryObject("invisible_leggings", new InvisibleItem.Leggings());
    public static final Item INVISIBLE_BOOTS = RegistryObject("invisible_boots", new InvisibleItem.Boots());
    public static final Item REINFORCED_INVISIBLE_HELMET = RegistryObject("reinforced_invisible_helmet", new ReinforcedInvisibleItem.Helmet());
    public static final Item REINFORCED_INVISIBLE_CHESTPLATE = RegistryObject("reinforced_invisible_chestplate", new ReinforcedInvisibleItem.Chestplate());
    public static final Item REINFORCED_INVISIBLE_LEGGINGS = RegistryObject("reinforced_invisible_leggings", new ReinforcedInvisibleItem.Leggings());
    public static final Item REINFORCED_INVISIBLE_BOOTS = RegistryObject("reinforced_invisible_boots", new ReinforcedInvisibleItem.Boots());
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
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), item);
    }
}
