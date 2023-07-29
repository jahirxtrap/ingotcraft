package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModBlocks;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IngotcraftMod.MODID)
public class IngotcraftMod {

    public static final String MODID = "ingotcraft";

    public static CreativeModeTab MODTAB;

    public IngotcraftMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::registerCreativeTab);
        bus.addListener(IngotcraftModTab::buildContents);
        IngotcraftModBlocks.REGISTRY.register(bus);
        IngotcraftModItems.REGISTRY.register(bus);
    }

    void registerCreativeTab(CreativeModeTabEvent.Register event) {
        MODTAB = event.registerCreativeModeTab(new ResourceLocation(MODID, "tabingot_craft"), builder -> builder.icon(() -> new ItemStack(IngotcraftModItems.STEEL_INGOT.get()))
                .title(Component.translatable("itemGroup.tabingot_craft"))
                .build());
    }
}
