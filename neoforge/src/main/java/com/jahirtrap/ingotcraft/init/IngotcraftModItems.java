package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IngotcraftModItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(IngotcraftMod.MODID);
    public static final DeferredItem<Item> RAW_STEEL = REGISTRY.register("raw_steel", BaseItem::new);
    public static final DeferredItem<Item> RAW_BRONZE = REGISTRY.register("raw_bronze", BaseItem::new);
    public static final DeferredItem<Item> RAW_LEAD = REGISTRY.register("raw_lead", BaseItem::new);
    public static final DeferredItem<Item> RAW_SILVER = REGISTRY.register("raw_silver", BaseItem::new);
    public static final DeferredItem<Item> RAW_TIN = REGISTRY.register("raw_tin", BaseItem::new);
    public static final DeferredItem<Item> RAW_STEEL_BLOCK = block(IngotcraftModBlocks.RAW_STEEL_BLOCK);
    public static final DeferredItem<Item> RAW_BRONZE_BLOCK = block(IngotcraftModBlocks.RAW_BRONZE_BLOCK);
    public static final DeferredItem<Item> RAW_LEAD_BLOCK = block(IngotcraftModBlocks.RAW_LEAD_BLOCK);
    public static final DeferredItem<Item> RAW_SILVER_BLOCK = block(IngotcraftModBlocks.RAW_SILVER_BLOCK);
    public static final DeferredItem<Item> RAW_TIN_BLOCK = block(IngotcraftModBlocks.RAW_TIN_BLOCK);
    public static final DeferredItem<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", BaseItem::new);
    public static final DeferredItem<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", BaseItem::new);
    public static final DeferredItem<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", BaseItem::new);
    public static final DeferredItem<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", BaseItem::new);
    public static final DeferredItem<Item> TIN_INGOT = REGISTRY.register("tin_ingot", BaseItem::new);
    public static final DeferredItem<Item> STEEL_BLOCK = block(IngotcraftModBlocks.STEEL_BLOCK);
    public static final DeferredItem<Item> BRONZE_BLOCK = block(IngotcraftModBlocks.BRONZE_BLOCK);
    public static final DeferredItem<Item> LEAD_BLOCK = block(IngotcraftModBlocks.LEAD_BLOCK);
    public static final DeferredItem<Item> SILVER_BLOCK = block(IngotcraftModBlocks.SILVER_BLOCK);
    public static final DeferredItem<Item> TIN_BLOCK = block(IngotcraftModBlocks.TIN_BLOCK);
    public static final DeferredItem<Item> STEEL_NUGGET = REGISTRY.register("steel_nugget", BaseItem::new);
    public static final DeferredItem<Item> BRONZE_NUGGET = REGISTRY.register("bronze_nugget", BaseItem::new);
    public static final DeferredItem<Item> LEAD_NUGGET = REGISTRY.register("lead_nugget", BaseItem::new);
    public static final DeferredItem<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", BaseItem::new);
    public static final DeferredItem<Item> TIN_NUGGET = REGISTRY.register("tin_nugget", BaseItem::new);
    public static final DeferredItem<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", BaseItem::new);
    public static final DeferredItem<Item> STEEL_SWORD = REGISTRY.register("steel_sword", SteelSwordItem::new);
    public static final DeferredItem<Item> STEEL_PICKAXE = REGISTRY.register("steel_pickaxe", SteelPickaxeItem::new);
    public static final DeferredItem<Item> STEEL_AXE = REGISTRY.register("steel_axe", SteelAxeItem::new);
    public static final DeferredItem<Item> STEEL_SHOVEL = REGISTRY.register("steel_shovel", SteelShovelItem::new);
    public static final DeferredItem<Item> STEEL_HOE = REGISTRY.register("steel_hoe", SteelHoeItem::new);
    public static final DeferredItem<Item> BRONZE_SWORD = REGISTRY.register("bronze_sword", BronzeSwordItem::new);
    public static final DeferredItem<Item> BRONZE_PICKAXE = REGISTRY.register("bronze_pickaxe", BronzePickaxeItem::new);
    public static final DeferredItem<Item> BRONZE_AXE = REGISTRY.register("bronze_axe", BronzeAxeItem::new);
    public static final DeferredItem<Item> BRONZE_SHOVEL = REGISTRY.register("bronze_shovel", BronzeShovelItem::new);
    public static final DeferredItem<Item> BRONZE_HOE = REGISTRY.register("bronze_hoe", BronzeHoeItem::new);
    public static final DeferredItem<Item> STEEL_HELMET = REGISTRY.register("steel_helmet", SteelArmor.Helmet::new);
    public static final DeferredItem<Item> STEEL_CHESTPLATE = REGISTRY.register("steel_chestplate", SteelArmor.Chestplate::new);
    public static final DeferredItem<Item> STEEL_LEGGINGS = REGISTRY.register("steel_leggings", SteelArmor.Leggings::new);
    public static final DeferredItem<Item> STEEL_BOOTS = REGISTRY.register("steel_boots", SteelArmor.Boots::new);
    public static final DeferredItem<Item> BRONZE_HELMET = REGISTRY.register("bronze_helmet", BronzeArmor.Helmet::new);
    public static final DeferredItem<Item> BRONZE_CHESTPLATE = REGISTRY.register("bronze_chestplate", BronzeArmor.Chestplate::new);
    public static final DeferredItem<Item> BRONZE_LEGGINGS = REGISTRY.register("bronze_leggings", BronzeArmor.Leggings::new);
    public static final DeferredItem<Item> BRONZE_BOOTS = REGISTRY.register("bronze_boots", BronzeArmor.Boots::new);
    public static final DeferredItem<Item> INVISIBLE_HELMET = REGISTRY.register("invisible_helmet", InvisibleArmor.Helmet::new);
    public static final DeferredItem<Item> INVISIBLE_CHESTPLATE = REGISTRY.register("invisible_chestplate", InvisibleArmor.Chestplate::new);
    public static final DeferredItem<Item> INVISIBLE_LEGGINGS = REGISTRY.register("invisible_leggings", InvisibleArmor.Leggings::new);
    public static final DeferredItem<Item> INVISIBLE_BOOTS = REGISTRY.register("invisible_boots", InvisibleArmor.Boots::new);
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_HELMET = REGISTRY.register("reinforced_invisible_helmet", ReinforcedInvisibleArmor.Helmet::new);
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_CHESTPLATE = REGISTRY.register("reinforced_invisible_chestplate", ReinforcedInvisibleArmor.Chestplate::new);
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_LEGGINGS = REGISTRY.register("reinforced_invisible_leggings", ReinforcedInvisibleArmor.Leggings::new);
    public static final DeferredItem<Item> REINFORCED_INVISIBLE_BOOTS = REGISTRY.register("reinforced_invisible_boots", ReinforcedInvisibleArmor.Boots::new);
    public static final DeferredItem<Item> STONE_HAMMER = REGISTRY.register("stone_hammer", StoneHammerItem::new);
    public static final DeferredItem<Item> IRON_HAMMER = REGISTRY.register("iron_hammer", IronHammerItem::new);
    public static final DeferredItem<Item> GOLDEN_HAMMER = REGISTRY.register("golden_hammer", GoldenHammerItem::new);
    public static final DeferredItem<Item> DIAMOND_HAMMER = REGISTRY.register("diamond_hammer", DiamondHammerItem::new);
    public static final DeferredItem<Item> NETHERITE_HAMMER = REGISTRY.register("netherite_hammer", NetheriteHammerItem::new);
    public static final DeferredItem<Item> ENDERITE_HAMMER = REGISTRY.register("enderite_hammer", EnderiteHammerItem::new);
    public static final DeferredItem<Item> STEEL_HAMMER = REGISTRY.register("steel_hammer", SteelHammerItem::new);
    public static final DeferredItem<Item> BRONZE_HAMMER = REGISTRY.register("bronze_hammer", BronzeHammerItem::new);

    private static DeferredItem<Item> block(DeferredBlock<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
