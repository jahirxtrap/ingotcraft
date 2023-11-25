package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModBlocks;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IngotcraftMod.MODID)
public class IngotcraftMod {

    public static final String MODID = "ingotcraft";

    public IngotcraftMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        IngotcraftModBlocks.REGISTRY.register(bus);
        IngotcraftModItems.REGISTRY.register(bus);
        IngotcraftModTab.init();
    }
}
