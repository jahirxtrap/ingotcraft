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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Function;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModContent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MODID);

    public static final RegistryObject<Item> RAW_STEEL = registerItem("raw_steel", Item::new, new Item.Properties());
    public static final RegistryObject<Item> RAW_BRONZE = registerItem("raw_bronze", Item::new, new Item.Properties());
    public static final RegistryObject<Item> RAW_LEAD = registerItem("raw_lead", Item::new, new Item.Properties());
    public static final RegistryObject<Item> RAW_SILVER = registerItem("raw_silver", Item::new, new Item.Properties());
    public static final RegistryObject<Item> RAW_TIN = registerItem("raw_tin", Item::new, new Item.Properties());
    public static RegistryObject<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final RegistryObject<Item> STEEL_INGOT = registerItem("steel_ingot", Item::new, new Item.Properties());
    public static final RegistryObject<Item> BRONZE_INGOT = registerItem("bronze_ingot", Item::new, new Item.Properties());
    public static final RegistryObject<Item> LEAD_INGOT = registerItem("lead_ingot", Item::new, new Item.Properties());
    public static final RegistryObject<Item> SILVER_INGOT = registerItem("silver_ingot", Item::new, new Item.Properties());
    public static final RegistryObject<Item> TIN_INGOT = registerItem("tin_ingot", Item::new, new Item.Properties());
    public static RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).sound(SoundType.COPPER).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", Block::new, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final RegistryObject<Item> STEEL_NUGGET = registerItem("steel_nugget", Item::new, new Item.Properties());
    public static final RegistryObject<Item> BRONZE_NUGGET = registerItem("bronze_nugget", Item::new, new Item.Properties());
    public static final RegistryObject<Item> LEAD_NUGGET = registerItem("lead_nugget", Item::new, new Item.Properties());
    public static final RegistryObject<Item> SILVER_NUGGET = registerItem("silver_nugget", Item::new, new Item.Properties());
    public static final RegistryObject<Item> TIN_NUGGET = registerItem("tin_nugget", Item::new, new Item.Properties());
    public static final RegistryObject<Item> COPPER_NUGGET = registerItem("copper_nugget", Item::new, new Item.Properties());
    public static final List<RegistryObject<Item>> STEEL_TOOLS = registerTools("steel", ModMaterials.Tool.STEEL, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<RegistryObject<Item>> BRONZE_TOOLS = registerTools("bronze", ModMaterials.Tool.BRONZE, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<RegistryObject<Item>> STEEL_ARMOR = registerArmor(ModMaterials.Armor.STEEL, new Item.Properties());
    public static final List<RegistryObject<Item>> BRONZE_ARMOR = registerArmor(ModMaterials.Armor.BRONZE, new Item.Properties());
    public static final RegistryObject<Item> STONE_PICK_HAMMER = registerItem("stone_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.STONE_PICK_HAMMER, p), new Item.Properties());
    public static final RegistryObject<Item> IRON_PICK_HAMMER = registerItem("iron_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.IRON_PICK_HAMMER, p), new Item.Properties());
    public static final RegistryObject<Item> GOLDEN_PICK_HAMMER = registerItem("golden_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.GOLD_PICK_HAMMER, p), new Item.Properties());
    public static final RegistryObject<Item> DIAMOND_PICK_HAMMER = registerItem("diamond_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.DIAMOND_PICK_HAMMER, p), new Item.Properties());
    public static final RegistryObject<Item> NETHERITE_PICK_HAMMER = registerItem("netherite_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.NETHERITE_PICK_HAMMER, p), new Item.Properties().fireResistant());
    public static final RegistryObject<Item> ENDERITE_PICK_HAMMER = registerItem("enderite_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.ENDERITE_PICK_HAMMER, p), new Item.Properties().fireResistant());
    public static final RegistryObject<Item> STEEL_PICK_HAMMER = registerItem("steel_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.STEEL_PICK_HAMMER, p), new Item.Properties());
    public static final RegistryObject<Item> BRONZE_PICK_HAMMER = registerItem("bronze_pick_hammer", (p) -> new BasePickHammerItem(ModMaterials.Tool.BRONZE_PICK_HAMMER, p), new Item.Properties());

    private static RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg.get(), p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    private static RegistryObject<Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return BLOCKS.register(name, () -> function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static RegistryObject<Item> registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        return ITEMS.register(name, () -> function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static List<RegistryObject<Item>> registerTools(String name, ToolMaterial material, float[] attr, Item.Properties itemProp) {
        return List.of(
                registerItem(name + "_sword", (p) -> new SwordItem(material, 3f, -2.4f, p), itemProp),
                registerItem(name + "_pickaxe", (p) -> new PickaxeItem(material, 1f, -2.8f, p), itemProp),
                registerItem(name + "_axe", (p) -> new AxeItem(material, attr[0], attr[1], p), itemProp),
                registerItem(name + "_shovel", (p) -> new ShovelItem(material, 1.5f, -3f, p), itemProp),
                registerItem(name + "_hoe", (p) -> new HoeItem(material, attr[2], attr[3], p), itemProp)
        );
    }

    private static List<RegistryObject<Item>> registerArmor(ArmorMaterial material, Item.Properties itemProp) {
        String name = material.assetId().location().getPath();
        return List.of(
                registerItem(name + "_helmet", (p) -> new ArmorItem(material, ArmorType.HELMET, p), itemProp),
                registerItem(name + "_chestplate", (p) -> new ArmorItem(material, ArmorType.CHESTPLATE, p), itemProp),
                registerItem(name + "_leggings", (p) -> new ArmorItem(material, ArmorType.LEGGINGS, p), itemProp),
                registerItem(name + "_boots", (p) -> new ArmorItem(material, ArmorType.BOOTS, p), itemProp)
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
