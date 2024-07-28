package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTab {
    private static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IngotcraftMod.MODID);

    public static final RegistryObject<CreativeModeTab> TAB_INGOTCRAFT = TABS.register("tab_ingotcraft", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.NETHERITE_PICK_HAMMER.get()))
            .displayItems((features, event) -> {
                event.accept(ModItems.RAW_STEEL.get());
                event.accept(ModItems.RAW_BRONZE.get());
                event.accept(ModItems.RAW_LEAD.get());
                event.accept(ModItems.RAW_SILVER.get());
                event.accept(ModItems.RAW_TIN.get());
                event.accept(ModItems.RAW_STEEL_BLOCK.get());
                event.accept(ModItems.RAW_BRONZE_BLOCK.get());
                event.accept(ModItems.RAW_LEAD_BLOCK.get());
                event.accept(ModItems.RAW_SILVER_BLOCK.get());
                event.accept(ModItems.RAW_TIN_BLOCK.get());
                event.accept(ModItems.STEEL_INGOT.get());
                event.accept(ModItems.BRONZE_INGOT.get());
                event.accept(ModItems.LEAD_INGOT.get());
                event.accept(ModItems.SILVER_INGOT.get());
                event.accept(ModItems.TIN_INGOT.get());
                event.accept(ModItems.STEEL_BLOCK.get());
                event.accept(ModItems.BRONZE_BLOCK.get());
                event.accept(ModItems.LEAD_BLOCK.get());
                event.accept(ModItems.SILVER_BLOCK.get());
                event.accept(ModItems.TIN_BLOCK.get());
                event.accept(ModItems.STEEL_NUGGET.get());
                event.accept(ModItems.BRONZE_NUGGET.get());
                event.accept(ModItems.LEAD_NUGGET.get());
                event.accept(ModItems.SILVER_NUGGET.get());
                event.accept(ModItems.TIN_NUGGET.get());
                event.accept(ModItems.COPPER_NUGGET.get());
                event.accept(ModItems.STEEL_SWORD.get());
                event.accept(ModItems.STEEL_PICKAXE.get());
                event.accept(ModItems.STEEL_AXE.get());
                event.accept(ModItems.STEEL_SHOVEL.get());
                event.accept(ModItems.STEEL_HOE.get());
                event.accept(ModItems.BRONZE_SWORD.get());
                event.accept(ModItems.BRONZE_PICKAXE.get());
                event.accept(ModItems.BRONZE_AXE.get());
                event.accept(ModItems.BRONZE_SHOVEL.get());
                event.accept(ModItems.BRONZE_HOE.get());
                event.accept(ModItems.STEEL_HELMET.get());
                event.accept(ModItems.STEEL_CHESTPLATE.get());
                event.accept(ModItems.STEEL_LEGGINGS.get());
                event.accept(ModItems.STEEL_BOOTS.get());
                event.accept(ModItems.BRONZE_HELMET.get());
                event.accept(ModItems.BRONZE_CHESTPLATE.get());
                event.accept(ModItems.BRONZE_LEGGINGS.get());
                event.accept(ModItems.BRONZE_BOOTS.get());
                event.accept(ModItems.STONE_PICK_HAMMER.get());
                event.accept(ModItems.IRON_PICK_HAMMER.get());
                event.accept(ModItems.GOLDEN_PICK_HAMMER.get());
                event.accept(ModItems.DIAMOND_PICK_HAMMER.get());
                event.accept(ModItems.NETHERITE_PICK_HAMMER.get());
                event.accept(ModItems.ENDERITE_PICK_HAMMER.get());
                event.accept(ModItems.STEEL_PICK_HAMMER.get());
                event.accept(ModItems.BRONZE_PICK_HAMMER.get());
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}