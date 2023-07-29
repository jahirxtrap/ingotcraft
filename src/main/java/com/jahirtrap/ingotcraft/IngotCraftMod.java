package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModBlocks;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IngotcraftMod.MODID)
public class IngotcraftMod {

    public static final String MODID = "ingotcraft";

    public IngotcraftMod() {
        IngotcraftModTabs.load();

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        IngotcraftModBlocks.REGISTRY.register(bus);
        IngotcraftModItems.REGISTRY.register(bus);
    }
}
