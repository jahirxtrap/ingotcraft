package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class IngotcraftModTab {

    private static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IngotcraftMod.MODID);

    public static final Supplier<CreativeModeTab> TAB_INGOTCRAFT = TAB_REGISTER.register("tab_ingotcraft", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(IngotcraftModItems.NETHERITE_HAMMER.get()))
            .displayItems((features, event) -> {
                event.accept(IngotcraftModItems.RAW_STEEL);
                event.accept(IngotcraftModItems.RAW_BRONZE);
                event.accept(IngotcraftModItems.RAW_LEAD);
                event.accept(IngotcraftModItems.RAW_SILVER);
                event.accept(IngotcraftModItems.RAW_TIN);
                event.accept(IngotcraftModItems.RAW_STEEL_BLOCK);
                event.accept(IngotcraftModItems.RAW_BRONZE_BLOCK);
                event.accept(IngotcraftModItems.RAW_LEAD_BLOCK);
                event.accept(IngotcraftModItems.RAW_SILVER_BLOCK);
                event.accept(IngotcraftModItems.RAW_TIN_BLOCK);
                event.accept(IngotcraftModItems.STEEL_INGOT);
                event.accept(IngotcraftModItems.BRONZE_INGOT);
                event.accept(IngotcraftModItems.LEAD_INGOT);
                event.accept(IngotcraftModItems.SILVER_INGOT);
                event.accept(IngotcraftModItems.TIN_INGOT);
                event.accept(IngotcraftModItems.STEEL_BLOCK);
                event.accept(IngotcraftModItems.BRONZE_BLOCK);
                event.accept(IngotcraftModItems.LEAD_BLOCK);
                event.accept(IngotcraftModItems.SILVER_BLOCK);
                event.accept(IngotcraftModItems.TIN_BLOCK);
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
                event.accept(IngotcraftModItems.STONE_HAMMER);
                event.accept(IngotcraftModItems.IRON_HAMMER);
                event.accept(IngotcraftModItems.GOLDEN_HAMMER);
                event.accept(IngotcraftModItems.DIAMOND_HAMMER);
                event.accept(IngotcraftModItems.NETHERITE_HAMMER);
                event.accept(IngotcraftModItems.ENDERITE_HAMMER);
                event.accept(IngotcraftModItems.STEEL_HAMMER);
                event.accept(IngotcraftModItems.BRONZE_HAMMER);
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build());

    public static void init(IEventBus bus) {
        TAB_REGISTER.register(bus);
    }

}
