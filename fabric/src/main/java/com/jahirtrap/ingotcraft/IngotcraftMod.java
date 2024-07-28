package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.ModItems;
import com.jahirtrap.ingotcraft.init.ModTab;
import net.fabricmc.api.ModInitializer;

public class IngotcraftMod implements ModInitializer {

    public static final String MODID = "ingotcraft";

    @Override
    public void onInitialize() {
        ModItems.init();
        ModTab.init();
    }
}
