package com.jahirtrap.ingotcraft.init;

import com.jahirtrap.ingotcraft.IngotcraftMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IngotcraftMod.MODID);

    public static final Supplier<CreativeModeTab> TAB_INGOTCRAFT = TABS.register("tab_ingotcraft", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_PICK_HAMMER.get()))
            .displayItems((features, event) -> {
                for (DeferredHolder<Item, ? extends Item> item : ModContent.ITEMS.getEntries())
                    event.accept(item.get());
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build());

    public static void init(IEventBus bus) {
        TABS.register(bus);
    }
}
