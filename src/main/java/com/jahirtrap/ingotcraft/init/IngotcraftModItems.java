package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IngotcraftModItems {
    private static final List<Item> REGISTRY = new ArrayList<>();
    public static final Item STEEL_SWORD = register(new SteelSwordItem());
    public static final Item STEEL_PICKAXE = register(new SteelPickaxeItem());
    public static final Item STEEL_AXE = register(new SteelAxeItem());
    public static final Item STEEL_SHOVEL = register(new SteelShovelItem());
    public static final Item STEEL_HOE = register(new SteelHoeItem());
    public static final Item BRONZE_SWORD = register(new BronzeSwordItem());
    public static final Item BRONZE_PICKAXE = register(new BronzePickaxeItem());
    public static final Item BRONZE_AXE = register(new BronzeAxeItem());
    public static final Item BRONZE_SHOVEL = register(new BronzeShovelItem());
    public static final Item BRONZE_HOE = register(new BronzeHoeItem());
    public static final Item RAW_STEEL = register(new RawSteelItem());
    public static final Item RAW_BRONZE = register(new RawBronzeItem());
    public static final Item RAW_LEAD = register(new RawLeadItem());
    public static final Item RAW_SILVER = register(new RawSilverItem());
    public static final Item RAW_TIN = register(new RawTinItem());
    public static final Item RAW_STEEL_BLOCK = register(IngotcraftModBlocks.RAW_STEEL_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item RAW_BRONZE_BLOCK = register(IngotcraftModBlocks.RAW_BRONZE_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item RAW_LEAD_BLOCK = register(IngotcraftModBlocks.RAW_LEAD_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item RAW_SILVER_BLOCK = register(IngotcraftModBlocks.RAW_SILVER_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item RAW_TIN_BLOCK = register(IngotcraftModBlocks.RAW_TIN_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item STEEL_INGOT = register(new SteelIngotItem());
    public static final Item BRONZE_INGOT = register(new BronzeIngotItem());
    public static final Item LEAD_INGOT = register(new LeadIngotItem());
    public static final Item SILVER_INGOT = register(new SilverIngotItem());
    public static final Item TIN_INGOT = register(new TinIngotItem());
    public static final Item STEEL_BLOCK = register(IngotcraftModBlocks.STEEL_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item BRONZE_BLOCK = register(IngotcraftModBlocks.BRONZE_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item LEAD_BLOCK = register(IngotcraftModBlocks.LEAD_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item SILVER_BLOCK = register(IngotcraftModBlocks.SILVER_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item TIN_BLOCK = register(IngotcraftModBlocks.TIN_BLOCK, IngotcraftModTabs.TAB_INGOT_CRAFT);
    public static final Item STEEL_NUGGET = register(new SteelNuggetItem());
    public static final Item BRONZE_NUGGET = register(new BronzeNuggetItem());
    public static final Item LEAD_NUGGET = register(new LeadNuggetItem());
    public static final Item SILVER_NUGGET = register(new SilverNuggetItem());
    public static final Item TIN_NUGGET = register(new TinNuggetItem());
    public static final Item COPPER_NUGGET = register(new CopperNuggetItem());
    public static final Item STEEL_HELMET = register(new SteelItem.Helmet());
    public static final Item STEEL_CHESTPLATE = register(new SteelItem.Chestplate());
    public static final Item STEEL_LEGGINGS = register(new SteelItem.Leggings());
    public static final Item STEEL_BOOTS = register(new SteelItem.Boots());
    public static final Item BRONZE_HELMET = register(new BronzeItem.Helmet());
    public static final Item BRONZE_CHESTPLATE = register(new BronzeItem.Chestplate());
    public static final Item BRONZE_LEGGINGS = register(new BronzeItem.Leggings());
    public static final Item BRONZE_BOOTS = register(new BronzeItem.Boots());
    public static final Item INVISIBLE_HELMET = register(new InvisibleItem.Helmet());
    public static final Item INVISIBLE_CHESTPLATE = register(new InvisibleItem.Chestplate());
    public static final Item INVISIBLE_LEGGINGS = register(new InvisibleItem.Leggings());
    public static final Item INVISIBLE_BOOTS = register(new InvisibleItem.Boots());
    public static final Item REINFORCED_INVISIBLE_HELMET = register(new ReinforcedInvisibleItem.Helmet());
    public static final Item REINFORCED_INVISIBLE_CHESTPLATE = register(new ReinforcedInvisibleItem.Chestplate());
    public static final Item REINFORCED_INVISIBLE_LEGGINGS = register(new ReinforcedInvisibleItem.Leggings());
    public static final Item REINFORCED_INVISIBLE_BOOTS = register(new ReinforcedInvisibleItem.Boots());
    public static final Item IRON_HAMMER = register(new IronHammerItem());
    public static final Item GOLDEN_HAMMER = register(new GoldenHammerItem());
    public static final Item DIAMOND_HAMMER = register(new DiamondHammerItem());
    public static final Item NETHERITE_HAMMER = register(new NetheriteHammerItem());
    public static final Item STEEL_HAMMER = register(new SteelHammerItem());
    public static final Item BRONZE_HAMMER = register(new BronzeHammerItem());

    private static Item register(Item item) {
        REGISTRY.add(item);
        return item;
    }

    private static Item register(Block block, CreativeModeTab tab) {
        return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
    }
}
