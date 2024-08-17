package com.jahirtrap.ingotcraft.init;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModTab {
    private static void register(CreativeModeTabEvent.Register register) {
        CreativeModeTab TAB_INGOTCRAFT = register.registerCreativeModeTab(new ResourceLocation(MODID, "tab_ingotcraft"), builder -> builder.icon(() -> new ItemStack(ModContent.NETHERITE_PICK_HAMMER.get()))
                .displayItems((features, event) -> {
                    for (RegistryObject<Item> item : ModContent.ITEMS.getEntries())
                        event.accept(item.get());
                })
                .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
                .build());
    }

    public static void init(IEventBus bus) {
        bus.addListener(ModTab::register);
    }
}