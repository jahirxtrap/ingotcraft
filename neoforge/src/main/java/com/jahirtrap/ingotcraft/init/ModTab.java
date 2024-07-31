package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTab {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IngotcraftMod.MODID);

    public static final Supplier<CreativeModeTab> TAB_INGOTCRAFT = TABS.register("tab_ingotcraft", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_PICK_HAMMER.get()))
            .displayItems((features, event) -> {
                event.accept(ModContent.RAW_STEEL.get());
                event.accept(ModContent.RAW_BRONZE.get());
                event.accept(ModContent.RAW_LEAD.get());
                event.accept(ModContent.RAW_SILVER.get());
                event.accept(ModContent.RAW_TIN.get());
                event.accept(ModContent.RAW_STEEL_BLOCK.get());
                event.accept(ModContent.RAW_BRONZE_BLOCK.get());
                event.accept(ModContent.RAW_LEAD_BLOCK.get());
                event.accept(ModContent.RAW_SILVER_BLOCK.get());
                event.accept(ModContent.RAW_TIN_BLOCK.get());
                event.accept(ModContent.STEEL_INGOT.get());
                event.accept(ModContent.BRONZE_INGOT.get());
                event.accept(ModContent.LEAD_INGOT.get());
                event.accept(ModContent.SILVER_INGOT.get());
                event.accept(ModContent.TIN_INGOT.get());
                event.accept(ModContent.STEEL_BLOCK.get());
                event.accept(ModContent.BRONZE_BLOCK.get());
                event.accept(ModContent.LEAD_BLOCK.get());
                event.accept(ModContent.SILVER_BLOCK.get());
                event.accept(ModContent.TIN_BLOCK.get());
                event.accept(ModContent.STEEL_NUGGET.get());
                event.accept(ModContent.BRONZE_NUGGET.get());
                event.accept(ModContent.LEAD_NUGGET.get());
                event.accept(ModContent.SILVER_NUGGET.get());
                event.accept(ModContent.TIN_NUGGET.get());
                event.accept(ModContent.COPPER_NUGGET.get());
                event.accept(ModContent.STEEL_SWORD.get());
                event.accept(ModContent.STEEL_PICKAXE.get());
                event.accept(ModContent.STEEL_AXE.get());
                event.accept(ModContent.STEEL_SHOVEL.get());
                event.accept(ModContent.STEEL_HOE.get());
                event.accept(ModContent.BRONZE_SWORD.get());
                event.accept(ModContent.BRONZE_PICKAXE.get());
                event.accept(ModContent.BRONZE_AXE.get());
                event.accept(ModContent.BRONZE_SHOVEL.get());
                event.accept(ModContent.BRONZE_HOE.get());
                event.accept(ModContent.STEEL_HELMET.get());
                event.accept(ModContent.STEEL_CHESTPLATE.get());
                event.accept(ModContent.STEEL_LEGGINGS.get());
                event.accept(ModContent.STEEL_BOOTS.get());
                event.accept(ModContent.BRONZE_HELMET.get());
                event.accept(ModContent.BRONZE_CHESTPLATE.get());
                event.accept(ModContent.BRONZE_LEGGINGS.get());
                event.accept(ModContent.BRONZE_BOOTS.get());
                event.accept(ModContent.STONE_PICK_HAMMER.get());
                event.accept(ModContent.IRON_PICK_HAMMER.get());
                event.accept(ModContent.GOLDEN_PICK_HAMMER.get());
                event.accept(ModContent.DIAMOND_PICK_HAMMER.get());
                event.accept(ModContent.NETHERITE_PICK_HAMMER.get());
                event.accept(ModContent.ENDERITE_PICK_HAMMER.get());
                event.accept(ModContent.STEEL_PICK_HAMMER.get());
                event.accept(ModContent.BRONZE_PICK_HAMMER.get());
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}
