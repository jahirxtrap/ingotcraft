package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.BaseBlock;
import com.jahirtrap.ingotcraft.item.BaseArmorItem;
import com.jahirtrap.ingotcraft.item.BasePickHammerItem;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModContent {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> RAW_STEEL = registerItem("raw_steel", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BRONZE = registerItem("raw_bronze", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = registerItem("raw_lead", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = registerItem("raw_silver", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = registerItem("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredBlock<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block", () -> new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final DeferredBlock<Block> RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", () -> new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", () -> new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new BaseBlock(MapColor.STONE, SoundType.STONE), new Item.Properties());
    public static final DeferredItem<Item> STEEL_INGOT = registerItem("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = registerItem("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = registerItem("lead_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = registerItem("silver_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = registerItem("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block", () -> new BaseBlock(MapColor.METAL, SoundType.COPPER), new Item.Properties());
    public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block", () -> new BaseBlock(MapColor.METAL, SoundType.METAL), new Item.Properties());
    public static final DeferredItem<Item> STEEL_NUGGET = registerItem("steel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = registerItem("bronze_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_NUGGET = registerItem("lead_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_NUGGET = registerItem("silver_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = registerItem("tin_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NUGGET = registerItem("copper_nugget", () -> new Item(new Item.Properties()));
    public static final List<DeferredItem<Item>> STEEL_TOOLS = registerTools("steel", ModTiers.STEEL, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<DeferredItem<Item>> BRONZE_TOOLS = registerTools("bronze", ModTiers.BRONZE, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<DeferredItem<Item>> STEEL_ARMOR = registerArmor(ModMaterials.STEEL, 25, new Item.Properties());
    public static final List<DeferredItem<Item>> BRONZE_ARMOR = registerArmor(ModMaterials.BRONZE, 15, new Item.Properties());
    public static final DeferredItem<Item> STONE_PICK_HAMMER = registerItem("stone_pick_hammer", () -> new BasePickHammerItem(ModTiers.STONE_PICK_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> IRON_PICK_HAMMER = registerItem("iron_pick_hammer", () -> new BasePickHammerItem(ModTiers.IRON_PICK_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_PICK_HAMMER = registerItem("golden_pick_hammer", () -> new BasePickHammerItem(ModTiers.GOLD_PICK_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> DIAMOND_PICK_HAMMER = registerItem("diamond_pick_hammer", () -> new BasePickHammerItem(ModTiers.DIAMOND_PICK_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_PICK_HAMMER = registerItem("netherite_pick_hammer", () -> new BasePickHammerItem(ModTiers.NETHERITE_PICK_HAMMER, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> ENDERITE_PICK_HAMMER = registerItem("enderite_pick_hammer", () -> new BasePickHammerItem(ModTiers.ENDERITE_PICK_HAMMER, new Item.Properties().fireResistant()));
    public static final DeferredItem<Item> STEEL_PICK_HAMMER = registerItem("steel_pick_hammer", () -> new BasePickHammerItem(ModTiers.STEEL_PICK_HAMMER, new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_PICK_HAMMER = registerItem("bronze_pick_hammer", () -> new BasePickHammerItem(ModTiers.BRONZE_PICK_HAMMER, new Item.Properties()));

    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties properties) {
        var blockReg = registerBlock(name, supplier);
        registerItem(name, () -> new BlockItem(blockReg.get(), properties));
        return blockReg;
    }

    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    public static DeferredItem<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    private static List<DeferredItem<Item>> registerTools(String name, Tier tier, float[] attr, Item.Properties properties) {
        return List.of(
                registerItem(name + "_sword", () -> new SwordItem(tier, properties.attributes(SwordItem.createAttributes(tier, 3, -2.4f)))),
                registerItem(name + "_pickaxe", () -> new PickaxeItem(tier, properties.attributes(PickaxeItem.createAttributes(tier, 1f, -2.8f)))),
                registerItem(name + "_axe", () -> new AxeItem(tier, properties.attributes(AxeItem.createAttributes(tier, attr[0], attr[1])))),
                registerItem(name + "_shovel", () -> new ShovelItem(tier, properties.attributes(ShovelItem.createAttributes(tier, 1.5f, -3f)))),
                registerItem(name + "_hoe", () -> new HoeItem(tier, properties.attributes(HoeItem.createAttributes(tier, attr[2], attr[3]))))
        );
    }

    private static List<DeferredItem<Item>> registerArmor(Holder<ArmorMaterial> material, int durabilityMultiplier, Item.Properties properties) {
        String name = material.getRegisteredName().substring(material.getRegisteredName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
        return List.of(
                registerItem(name + "_helmet", () -> new BaseArmorItem(material, Type.HELMET, durabilityMultiplier, properties)),
                registerItem(name + "_chestplate", () -> new BaseArmorItem(material, Type.CHESTPLATE, durabilityMultiplier, properties)),
                registerItem(name + "_leggings", () -> new BaseArmorItem(material, Type.LEGGINGS, durabilityMultiplier, properties)),
                registerItem(name + "_boots", () -> new BaseArmorItem(material, Type.BOOTS, durabilityMultiplier, properties))
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
