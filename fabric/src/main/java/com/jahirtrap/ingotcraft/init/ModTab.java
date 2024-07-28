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
            .icon(() -> new ItemStack(ModItems.NETHERITE_PICK_HAMMER))
            .displayItems((features, event) -> {
                event.accept(ModItems.RAW_STEEL);
                event.accept(ModItems.RAW_BRONZE);
                event.accept(ModItems.RAW_LEAD);
                event.accept(ModItems.RAW_SILVER);
                event.accept(ModItems.RAW_TIN);
                event.accept(ModItems.RAW_STEEL_BLOCK);
                event.accept(ModItems.RAW_BRONZE_BLOCK);
                event.accept(ModItems.RAW_LEAD_BLOCK);
                event.accept(ModItems.RAW_SILVER_BLOCK);
                event.accept(ModItems.RAW_TIN_BLOCK);
                event.accept(ModItems.STEEL_INGOT);
                event.accept(ModItems.BRONZE_INGOT);
                event.accept(ModItems.LEAD_INGOT);
                event.accept(ModItems.SILVER_INGOT);
                event.accept(ModItems.TIN_INGOT);
                event.accept(ModItems.STEEL_BLOCK);
                event.accept(ModItems.BRONZE_BLOCK);
                event.accept(ModItems.LEAD_BLOCK);
                event.accept(ModItems.SILVER_BLOCK);
                event.accept(ModItems.TIN_BLOCK);
                event.accept(ModItems.STEEL_NUGGET);
                event.accept(ModItems.BRONZE_NUGGET);
                event.accept(ModItems.LEAD_NUGGET);
                event.accept(ModItems.SILVER_NUGGET);
                event.accept(ModItems.TIN_NUGGET);
                event.accept(ModItems.COPPER_NUGGET);
                event.accept(ModItems.STEEL_SWORD);
                event.accept(ModItems.STEEL_PICKAXE);
                event.accept(ModItems.STEEL_AXE);
                event.accept(ModItems.STEEL_SHOVEL);
                event.accept(ModItems.STEEL_HOE);
                event.accept(ModItems.BRONZE_SWORD);
                event.accept(ModItems.BRONZE_PICKAXE);
                event.accept(ModItems.BRONZE_AXE);
                event.accept(ModItems.BRONZE_SHOVEL);
                event.accept(ModItems.BRONZE_HOE);
                event.accept(ModItems.STEEL_HELMET);
                event.accept(ModItems.STEEL_CHESTPLATE);
                event.accept(ModItems.STEEL_LEGGINGS);
                event.accept(ModItems.STEEL_BOOTS);
                event.accept(ModItems.BRONZE_HELMET);
                event.accept(ModItems.BRONZE_CHESTPLATE);
                event.accept(ModItems.BRONZE_LEGGINGS);
                event.accept(ModItems.BRONZE_BOOTS);
                event.accept(ModItems.STONE_PICK_HAMMER);
                event.accept(ModItems.IRON_PICK_HAMMER);
                event.accept(ModItems.GOLDEN_PICK_HAMMER);
                event.accept(ModItems.DIAMOND_PICK_HAMMER);
                event.accept(ModItems.NETHERITE_PICK_HAMMER);
                event.accept(ModItems.ENDERITE_PICK_HAMMER);
                event.accept(ModItems.STEEL_PICK_HAMMER);
                event.accept(ModItems.BRONZE_PICK_HAMMER);
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "tab_ingotcraft"), TAB_INGOTCRAFT);
    }
}
