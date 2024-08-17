package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.block.BaseBlock;
import com.jahirtrap.ingotcraft.item.BaseArmorItem;
import com.jahirtrap.ingotcraft.item.BaseItem;
import com.jahirtrap.ingotcraft.item.BasePickHammerItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;
import static com.jahirtrap.ingotcraft.init.ModTab.TAB_INGOTCRAFT;

public class ModContent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registry.BLOCK_REGISTRY, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registry.ITEM_REGISTRY, MODID);

    public static final RegistryObject<Item> RAW_STEEL = registerItem("raw_steel", BaseItem::new);
    public static final RegistryObject<Item> RAW_BRONZE = registerItem("raw_bronze", BaseItem::new);
    public static final RegistryObject<Item> RAW_LEAD = registerItem("raw_lead", BaseItem::new);
    public static final RegistryObject<Item> RAW_SILVER = registerItem("raw_silver", BaseItem::new);
    public static final RegistryObject<Item> RAW_TIN = registerItem("raw_tin", BaseItem::new);
    public static final RegistryObject<Block> RAW_STEEL_BLOCK = registerBlock("raw_steel_block", () -> new BaseBlock(Material.STONE, SoundType.STONE), new Item.Properties());
    public static final RegistryObject<Block> RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", () -> new BaseBlock(Material.STONE, SoundType.STONE), new Item.Properties());
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block", () -> new BaseBlock(Material.STONE, SoundType.STONE), new Item.Properties());
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block", () -> new BaseBlock(Material.STONE, SoundType.STONE), new Item.Properties());
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new BaseBlock(Material.STONE, SoundType.STONE), new Item.Properties());
    public static final RegistryObject<Item> STEEL_INGOT = registerItem("steel_ingot", BaseItem::new);
    public static final RegistryObject<Item> BRONZE_INGOT = registerItem("bronze_ingot", BaseItem::new);
    public static final RegistryObject<Item> LEAD_INGOT = registerItem("lead_ingot", BaseItem::new);
    public static final RegistryObject<Item> SILVER_INGOT = registerItem("silver_ingot", BaseItem::new);
    public static final RegistryObject<Item> TIN_INGOT = registerItem("tin_ingot", BaseItem::new);
    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock("steel_block", () -> new BaseBlock(Material.METAL, SoundType.METAL), new Item.Properties());
    public static final RegistryObject<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new BaseBlock(Material.METAL, SoundType.METAL), new Item.Properties());
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block", () -> new BaseBlock(Material.METAL, SoundType.COPPER), new Item.Properties());
    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block", () -> new BaseBlock(Material.METAL, SoundType.METAL), new Item.Properties());
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block", () -> new BaseBlock(Material.METAL, SoundType.METAL), new Item.Properties());
    public static final RegistryObject<Item> STEEL_NUGGET = registerItem("steel_nugget", BaseItem::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = registerItem("bronze_nugget", BaseItem::new);
    public static final RegistryObject<Item> LEAD_NUGGET = registerItem("lead_nugget", BaseItem::new);
    public static final RegistryObject<Item> SILVER_NUGGET = registerItem("silver_nugget", BaseItem::new);
    public static final RegistryObject<Item> TIN_NUGGET = registerItem("tin_nugget", BaseItem::new);
    public static final RegistryObject<Item> COPPER_NUGGET = registerItem("copper_nugget", BaseItem::new);
    public static final List<RegistryObject<Item>> STEEL_TOOLS = registerTools("steel", ModTiers.STEEL, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<RegistryObject<Item>> BRONZE_TOOLS = registerTools("bronze", ModTiers.BRONZE, new float[]{6f, -3f, -2f, -1f}, new Item.Properties());
    public static final List<RegistryObject<Item>> STEEL_ARMOR = registerArmor(ModMaterials.STEEL, new Item.Properties());
    public static final List<RegistryObject<Item>> BRONZE_ARMOR = registerArmor(ModMaterials.BRONZE, new Item.Properties());
    public static final RegistryObject<Item> STONE_PICK_HAMMER = registerItem("stone_pick_hammer", () -> new BasePickHammerItem(ModTiers.STONE_PICK_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> IRON_PICK_HAMMER = registerItem("iron_pick_hammer", () -> new BasePickHammerItem(ModTiers.IRON_PICK_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_PICK_HAMMER = registerItem("golden_pick_hammer", () -> new BasePickHammerItem(ModTiers.GOLD_PICK_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PICK_HAMMER = registerItem("diamond_pick_hammer", () -> new BasePickHammerItem(ModTiers.DIAMOND_PICK_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PICK_HAMMER = registerItem("netherite_pick_hammer", () -> new BasePickHammerItem(ModTiers.NETHERITE_PICK_HAMMER, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> ENDERITE_PICK_HAMMER = registerItem("enderite_pick_hammer", () -> new BasePickHammerItem(ModTiers.ENDERITE_PICK_HAMMER, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> STEEL_PICK_HAMMER = registerItem("steel_pick_hammer", () -> new BasePickHammerItem(ModTiers.STEEL_PICK_HAMMER, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICK_HAMMER = registerItem("bronze_pick_hammer", () -> new BasePickHammerItem(ModTiers.BRONZE_PICK_HAMMER, new Item.Properties()));

    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties properties) {
        var blockReg = registerBlock(name, supplier);
        registerItem(name, () -> new BlockItem(blockReg.get(), properties.tab(TAB_INGOTCRAFT)));
        return blockReg;
    }

    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    public static RegistryObject<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    private static List<RegistryObject<Item>> registerTools(String name, Tier tier, float[] attr, Item.Properties properties) {
        return List.of(
                registerItem(name + "_sword", () -> new SwordItem(tier, 3, -2.4f, properties.tab(TAB_INGOTCRAFT))),
                registerItem(name + "_pickaxe", () -> new PickaxeItem(tier, 1, -2.8f, properties.tab(TAB_INGOTCRAFT))),
                registerItem(name + "_axe", () -> new AxeItem(tier, attr[0], attr[1], properties.tab(TAB_INGOTCRAFT))),
                registerItem(name + "_shovel", () -> new ShovelItem(tier, 1.5f, -3f, properties.tab(TAB_INGOTCRAFT))),
                registerItem(name + "_hoe", () -> new HoeItem(tier, (int) attr[2], attr[3], properties.tab(TAB_INGOTCRAFT)))
        );
    }

    private static List<RegistryObject<Item>> registerArmor(ArmorMaterial material, Item.Properties properties) {
        String name = material.getName().substring(material.getName().indexOf(ResourceLocation.NAMESPACE_SEPARATOR) + 1);
        return List.of(
                registerItem(name + "_helmet", () -> new BaseArmorItem(material, EquipmentSlot.HEAD, properties)),
                registerItem(name + "_chestplate", () -> new BaseArmorItem(material, EquipmentSlot.CHEST, properties)),
                registerItem(name + "_leggings", () -> new BaseArmorItem(material, EquipmentSlot.LEGS, properties)),
                registerItem(name + "_boots", () -> new BaseArmorItem(material, EquipmentSlot.FEET, properties))
        );
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
