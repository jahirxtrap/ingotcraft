package com.jahirtrap.ingotcraft.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static com.jahirtrap.ingotcraft.IngotcraftMod.MODID;

public class ModTab {
    public static final CreativeModeTab TAB_INGOTCRAFT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModContent.NETHERITE_PICK_HAMMER))
            .displayItems((features, event) -> {
                for (Item item : ModContent.ITEMS)
                    event.accept(item);
            })
            .title(Component.translatable("itemGroup.ingotcraft.tab_ingotcraft"))
            .build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "tab_ingotcraft"), TAB_INGOTCRAFT);
    }
}
