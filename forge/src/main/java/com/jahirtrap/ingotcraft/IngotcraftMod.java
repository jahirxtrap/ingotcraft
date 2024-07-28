package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.ModItems;
import com.jahirtrap.ingotcraft.init.ModTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IngotcraftMod.MODID)
public class IngotcraftMod {

    public static final String MODID = "ingotcraft";

    public IngotcraftMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.init(bus);
        ModTab.init();
    }
}
