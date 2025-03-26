package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.item.BasePickHammerItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Function;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModContent {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> RAW_STEEL = registerItem("raw_steel", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_BRONZE = registerItem("raw_bronze", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_LEAD = registerItem("raw_lead", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_SILVER = registerItem("raw_silver", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_TIN = registerItem("raw_tin", Item::new, new Item.Properties());
    public static DeferredBlock<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final DeferredItem<Item> STEEL_INGOT = registerItem("steel_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BRONZE_INGOT = registerItem("bronze_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LEAD_INGOT = registerItem("lead_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SILVER_INGOT = registerItem("silver_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> TIN_INGOT = registerItem("tin_ingot", Item::new, new Item.Properties());
    public static DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.COPPER).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final DeferredItem<Item> STEEL_NUGGET = registerItem("steel_nugget", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BRONZE_NUGGET = registerItem("bronze_nugget", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LEAD_NUGGET = registerItem("lead_nugget", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SILVER_NUGGET = registerItem("silver_nugget", Item::new, new Item.Properties());
    public static final DeferredItem<Item> TIN_NUGGET = registerItem("tin_nugget", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_NUGGET = registerItem("copper_nugget", Item::new, new Item.Properties());
    public static final List<DeferredItem<Item>> STEEL_TOOLS = registerTools("steel", ModMaterials.Tool.STEEL, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<DeferredItem<Item>> BRONZE_TOOLS = registerTools("bronze", ModMaterials.Tool.BRONZE, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<DeferredItem<Item>> STEEL_ARMOR = registerArmor(ModMaterials.Armor.STEEL, new Item.Properties());
    public static final List<DeferredItem<Item>> BRONZE_ARMOR = registerArmor(ModMaterials.Armor.BRONZE, new Item.Properties());
    public static final DeferredItem<Item> STONE_PICK_HAMMER = registerItem("stone_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.STONE_PICK_HAMMER, p), new Item.Properties());
    public static final DeferredItem<Item> IRON_PICK_HAMMER = registerItem("iron_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.IRON_PICK_HAMMER, p), new Item.Properties());
    public static final DeferredItem<Item> GOLDEN_PICK_HAMMER = registerItem("golden_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.GOLD_PICK_HAMMER, p), new Item.Properties());
    public static final DeferredItem<Item> DIAMOND_PICK_HAMMER = registerItem("diamond_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.DIAMOND_PICK_HAMMER, p), new Item.Properties());
    public static final DeferredItem<Item> NETHERITE_PICK_HAMMER = registerItem("netherite_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.NETHERITE_PICK_HAMMER, p), new Item.Properties().fireResistant());
    public static final DeferredItem<Item> ENDERITE_PICK_HAMMER = registerItem("enderite_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.ENDERITE_PICK_HAMMER, p), new Item.Properties().fireResistant());
    public static final DeferredItem<Item> STEEL_PICK_HAMMER = registerItem("steel_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.STEEL_PICK_HAMMER, p), new Item.Properties());
    public static final DeferredItem<Item> BRONZE_PICK_HAMMER = registerItem("bronze_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.BRONZE_PICK_HAMMER, p), new Item.Properties());
    public static final DeferredItem<Item> ZURITE_PICK_HAMMER = registerItem("zurite_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.ZURITE_PICK_HAMMER, p), new Item.Properties().fireResistant());

    private static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg.get(), p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    private static DeferredBlock<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return BLOCKS.register(name, () -> function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static DeferredItem<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        return ITEMS.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static List<DeferredItem<Item>> registerTools(String name, ToolMaterial material, float[] attr, Item.Properties itemProp) {
        return List.of(
                registerItem(name + "_sword", (p) -> new Item(p.sword(material, 3f, -2.4f)), itemProp),
                registerItem(name + "_pickaxe", (p) -> new Item(p.pickaxe(material, 1f, -2.8f)), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(material, attr[0], attr[1], p), itemProp),
                registerItem(name + "_shovel", (p) -> new ShovelItem(material, 1.5f, -3f, p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(material, attr[2], attr[3], p), itemProp)
        );
    }

    private static List<DeferredItem<Item>> registerArmor(ArmorMaterial material, Item.Properties itemProp) {
        String name = material.assetId().location().getPath();
        return List.of(
                registerItem(name + "_helmet", (p) -> new Item(p.humanoidArmor(material, ArmorType.HELMET)), itemProp),
                registerItem(name + "_chestplate", (p) -> new Item(p.humanoidArmor(material, ArmorType.CHESTPLATE)), itemProp),
                registerItem(name + "_leggings", (p) -> new Item(p.humanoidArmor(material, ArmorType.LEGGINGS)), itemProp),
                registerItem(name + "_boots", (p) -> new Item(p.humanoidArmor(material, ArmorType.BOOTS)), itemProp)
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
