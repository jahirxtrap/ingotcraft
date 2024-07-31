package com.jahirtrap.ingotcraft.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModTab {
    private static final CreativeModeTab TAB_INGOTCRAFT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_PICK_HAMMER))
            .displayItems((features, event) -> {
                event.accept(ModContent.RAW_STEEL);
                event.accept(ModContent.RAW_BRONZE);
                event.accept(ModContent.RAW_LEAD);
                event.accept(ModContent.RAW_SILVER);
                event.accept(ModContent.RAW_TIN);
                event.accept(ModContent.RAW_STEEL_BLOCK);
                event.accept(ModContent.RAW_BRONZE_BLOCK);
                event.accept(ModContent.RAW_LEAD_BLOCK);
                event.accept(ModContent.RAW_SILVER_BLOCK);
                event.accept(ModContent.RAW_TIN_BLOCK);
                event.accept(ModContent.STEEL_INGOT);
                event.accept(ModContent.BRONZE_INGOT);
                event.accept(ModContent.LEAD_INGOT);
                event.accept(ModContent.SILVER_INGOT);
                event.accept(ModContent.TIN_INGOT);
                event.accept(ModContent.STEEL_BLOCK);
                event.accept(ModContent.BRONZE_BLOCK);
                event.accept(ModContent.LEAD_BLOCK);
                event.accept(ModContent.SILVER_BLOCK);
                event.accept(ModContent.TIN_BLOCK);
                event.accept(ModContent.STEEL_NUGGET);
                event.accept(ModContent.BRONZE_NUGGET);
                event.accept(ModContent.LEAD_NUGGET);
                event.accept(ModContent.SILVER_NUGGET);
                event.accept(ModContent.TIN_NUGGET);
                event.accept(ModContent.COPPER_NUGGET);
                event.accept(ModContent.STEEL_SWORD);
                event.accept(ModContent.STEEL_PICKAXE);
                event.accept(ModContent.STEEL_AXE);
                event.accept(ModContent.STEEL_SHOVEL);
                event.accept(ModContent.STEEL_HOE);
                event.accept(ModContent.BRONZE_SWORD);
                event.accept(ModContent.BRONZE_PICKAXE);
                event.accept(ModContent.BRONZE_AXE);
                event.accept(ModContent.BRONZE_SHOVEL);
                event.accept(ModContent.BRONZE_HOE);
                event.accept(ModContent.STEEL_HELMET);
                event.accept(ModContent.STEEL_CHESTPLATE);
                event.accept(ModContent.STEEL_LEGGINGS);
                event.accept(ModContent.STEEL_BOOTS);
                event.accept(ModContent.BRONZE_HELMET);
                event.accept(ModContent.BRONZE_CHESTPLATE);
                event.accept(ModContent.BRONZE_LEGGINGS);
                event.accept(ModContent.BRONZE_BOOTS);
                event.accept(ModContent.STONE_PICK_HAMMER);
                event.accept(ModContent.IRON_PICK_HAMMER);
                event.accept(ModContent.GOLDEN_PICK_HAMMER);
                event.accept(ModContent.DIAMOND_PICK_HAMMER);
                event.accept(ModContent.NETHERITE_PICK_HAMMER);
                event.accept(ModContent.ENDERITE_PICK_HAMMER);
                event.accept(ModContent.STEEL_PICK_HAMMER);
                event.accept(ModContent.BRONZE_PICK_HAMMER);
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MODID, "tab_ingotcraft"), TAB_INGOTCRAFT);
    }
}
