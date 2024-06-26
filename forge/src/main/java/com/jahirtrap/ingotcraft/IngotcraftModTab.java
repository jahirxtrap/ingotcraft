package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class IngotcraftModTab {

    private static final DeferredRegister<CreativeModeTab> TAB_REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IngotcraftMod.MODID);

    public static final RegistryObject<CreativeModeTab> TAB_INGOTCRAFT = TAB_REGISTER.register("tab_ingotcraft", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(IngotcraftModItems.NETHERITE_HAMMER.get()))
            .displayItems((features, event) -> {
                event.accept(IngotcraftModItems.RAW_STEEL.get());
                event.accept(IngotcraftModItems.RAW_BRONZE.get());
                event.accept(IngotcraftModItems.RAW_LEAD.get());
                event.accept(IngotcraftModItems.RAW_SILVER.get());
                event.accept(IngotcraftModItems.RAW_TIN.get());
                event.accept(IngotcraftModItems.RAW_STEEL_BLOCK.get());
                event.accept(IngotcraftModItems.RAW_BRONZE_BLOCK.get());
                event.accept(IngotcraftModItems.RAW_LEAD_BLOCK.get());
                event.accept(IngotcraftModItems.RAW_SILVER_BLOCK.get());
                event.accept(IngotcraftModItems.RAW_TIN_BLOCK.get());
                event.accept(IngotcraftModItems.STEEL_INGOT.get());
                event.accept(IngotcraftModItems.BRONZE_INGOT.get());
                event.accept(IngotcraftModItems.LEAD_INGOT.get());
                event.accept(IngotcraftModItems.SILVER_INGOT.get());
                event.accept(IngotcraftModItems.TIN_INGOT.get());
                event.accept(IngotcraftModItems.STEEL_BLOCK.get());
                event.accept(IngotcraftModItems.BRONZE_BLOCK.get());
                event.accept(IngotcraftModItems.LEAD_BLOCK.get());
                event.accept(IngotcraftModItems.SILVER_BLOCK.get());
                event.accept(IngotcraftModItems.TIN_BLOCK.get());
                event.accept(IngotcraftModItems.STEEL_NUGGET.get());
                event.accept(IngotcraftModItems.BRONZE_NUGGET.get());
                event.accept(IngotcraftModItems.LEAD_NUGGET.get());
                event.accept(IngotcraftModItems.SILVER_NUGGET.get());
                event.accept(IngotcraftModItems.TIN_NUGGET.get());
                event.accept(IngotcraftModItems.COPPER_NUGGET.get());
                event.accept(IngotcraftModItems.STEEL_SWORD.get());
                event.accept(IngotcraftModItems.STEEL_PICKAXE.get());
                event.accept(IngotcraftModItems.STEEL_AXE.get());
                event.accept(IngotcraftModItems.STEEL_SHOVEL.get());
                event.accept(IngotcraftModItems.STEEL_HOE.get());
                event.accept(IngotcraftModItems.BRONZE_SWORD.get());
                event.accept(IngotcraftModItems.BRONZE_PICKAXE.get());
                event.accept(IngotcraftModItems.BRONZE_AXE.get());
                event.accept(IngotcraftModItems.BRONZE_SHOVEL.get());
                event.accept(IngotcraftModItems.BRONZE_HOE.get());
                event.accept(IngotcraftModItems.STEEL_HELMET.get());
                event.accept(IngotcraftModItems.STEEL_CHESTPLATE.get());
                event.accept(IngotcraftModItems.STEEL_LEGGINGS.get());
                event.accept(IngotcraftModItems.STEEL_BOOTS.get());
                event.accept(IngotcraftModItems.BRONZE_HELMET.get());
                event.accept(IngotcraftModItems.BRONZE_CHESTPLATE.get());
                event.accept(IngotcraftModItems.BRONZE_LEGGINGS.get());
                event.accept(IngotcraftModItems.BRONZE_BOOTS.get());
                event.accept(IngotcraftModItems.INVISIBLE_HELMET.get());
                event.accept(IngotcraftModItems.INVISIBLE_CHESTPLATE.get());
                event.accept(IngotcraftModItems.INVISIBLE_LEGGINGS.get());
                event.accept(IngotcraftModItems.INVISIBLE_BOOTS.get());
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_HELMET.get());
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_CHESTPLATE.get());
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_LEGGINGS.get());
                event.accept(IngotcraftModItems.REINFORCED_INVISIBLE_BOOTS.get());
                event.accept(IngotcraftModItems.STONE_HAMMER.get());
                event.accept(IngotcraftModItems.IRON_HAMMER.get());
                event.accept(IngotcraftModItems.GOLDEN_HAMMER.get());
                event.accept(IngotcraftModItems.DIAMOND_HAMMER.get());
                event.accept(IngotcraftModItems.NETHERITE_HAMMER.get());
                event.accept(IngotcraftModItems.ENDERITE_HAMMER.get());
                event.accept(IngotcraftModItems.STEEL_HAMMER.get());
                event.accept(IngotcraftModItems.BRONZE_HAMMER.get());
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build());

    public static void init(IEventBus bus) {
        TAB_REGISTER.register(bus);
    }

}
