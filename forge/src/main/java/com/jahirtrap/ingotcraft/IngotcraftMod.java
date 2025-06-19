package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.ModContent;
import com.jahirtrap.ingotcraft.init.ModTab;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IngotcraftMod.MODID)
public class IngotcraftMod {

    public static final String MODID = "ingotcraft";

    public IngotcraftMod(FMLJavaModLoadingContext context) {
        BusGroup bus = context.getModBusGroup();

        ModContent.init(bus);
        ModTab.init(bus);
    }
}
