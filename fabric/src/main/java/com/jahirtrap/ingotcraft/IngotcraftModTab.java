package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModBlocks;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class IngotcraftModTab {

    private static final CreativeModeTab TAB_INGOTCRAFT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(IngotcraftModItems.NETHERITE_HAMMER))
            .displayItems((features, event) -> {
                event.accept(IngotcraftModItems.RAW_STEEL);
                event.accept(IngotcraftModItems.RAW_BRONZE);
                event.accept(IngotcraftModItems.RAW_LEAD);
                event.accept(IngotcraftModItems.RAW_SILVER);
                event.accept(IngotcraftModItems.RAW_TIN);
                event.accept(IngotcraftModBlocks.RAW_STEEL_BLOCK);
                event.accept(IngotcraftModBlocks.RAW_BRONZE_BLOCK);
                event.accept(IngotcraftModBlocks.RAW_LEAD_BLOCK);
                event.accept(IngotcraftModBlocks.RAW_SILVER_BLOCK);
                event.accept(IngotcraftModBlocks.RAW_TIN_BLOCK);
                event.accept(IngotcraftModItems.STEEL_INGOT);
                event.accept(IngotcraftModItems.BRONZE_INGOT);
                event.accept(IngotcraftModItems.LEAD_INGOT);
                event.accept(IngotcraftModItems.SILVER_INGOT);
                event.accept(IngotcraftModItems.TIN_INGOT);
                event.accept(IngotcraftModBlocks.STEEL_BLOCK);
                event.accept(IngotcraftModBlocks.BRONZE_BLOCK);
                event.accept(IngotcraftModBlocks.LEAD_BLOCK);
                event.accept(IngotcraftModBlocks.SILVER_BLOCK);
                event.accept(IngotcraftModBlocks.TIN_BLOCK);
                event.accept(IngotcraftModItems.STEEL_NUGGET);
                event.accept(IngotcraftModItems.BRONZE_NUGGET);
                event.accept(IngotcraftModItems.LEAD_NUGGET);
                event.accept(IngotcraftModItems.SILVER_NUGGET);
                event.accept(IngotcraftModItems.TIN_NUGGET);
                event.accept(IngotcraftModItems.COPPER_NUGGET);
                event.accept(IngotcraftModItems.STEEL_SWORD);
                event.accept(IngotcraftModItems.STEEL_PICKAXE);
                event.accept(IngotcraftModItems.STEEL_AXE);
                event.accept(IngotcraftModItems.STEEL_SHOVEL);
                event.accept(IngotcraftModItems.STEEL_HOE);
                event.accept(IngotcraftModItems.BRONZE_SWORD);
                event.accept(IngotcraftModItems.BRONZE_PICKAXE);
                event.accept(IngotcraftModItems.BRONZE_AXE);
                event.accept(IngotcraftModItems.BRONZE_SHOVEL);
                event.accept(IngotcraftModItems.BRONZE_HOE);
                event.accept(IngotcraftModItems.STEEL_HELMET);
                event.accept(IngotcraftModItems.STEEL_CHESTPLATE);
                event.accept(IngotcraftModItems.STEEL_LEGGINGS);
                event.accept(IngotcraftModItems.STEEL_BOOTS);
                event.accept(IngotcraftModItems.BRONZE_HELMET);
                event.accept(IngotcraftModItems.BRONZE_CHESTPLATE);
                event.accept(IngotcraftModItems.BRONZE_LEGGINGS);
                event.accept(IngotcraftModItems.BRONZE_BOOTS);
                event.accept(IngotcraftModItems.INVISIBLE_HELMET);
                event.accept(IngotcraftModItems.INVISIBLE_CHESTPLATE);
                event.accept(IngotcraftModItems.INVISIBLE_LEGGINGS);
                event.accept(IngotcraftModItems.INVISIBLE_BOOTS);
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_HELMET);
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_CHESTPLATE);
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_LEGGINGS);
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_BOOTS);
                event.accept(IngotcraftModItems.STONE_HAMMER);
                event.accept(IngotcraftModItems.IRON_HAMMER);
                event.accept(IngotcraftModItems.GOLDEN_HAMMER);
                event.accept(IngotcraftModItems.DIAMOND_HAMMER);
                event.accept(IngotcraftModItems.NETHERITE_HAMMER);
                event.accept(IngotcraftModItems.ENDERITE_HAMMER);
                event.accept(IngotcraftModItems.STEEL_HAMMER);
                event.accept(IngotcraftModItems.BRONZE_HAMMER);
            })
            .title(Component.translatable("itemGroup.tabingot_craft"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(IngotcraftMod.MODID, "tabingot_craft"), TAB_INGOTCRAFT);
    }

}
