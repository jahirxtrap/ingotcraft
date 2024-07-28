package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.ModItems;
import com.jahirtrap.ingotcraft.init.ModTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(IngotcraftMod.MODID)
public class IngotcraftMod {

    public static final String MODID = "ingotcraft";

    public IngotcraftMod(IEventBus bus) {
        ModItems.init(bus);
        ModTab.init(bus);
    }
}
