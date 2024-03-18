package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.IngotcraftModBlocks;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.fabricmc.api.ModInitializer;

public class IngotcraftMod implements ModInitializer {

    public static final String MODID = "ingotcraft";

    @Override
    public void onInitialize() {
        IngotcraftModBlocks.init();
        IngotcraftModItems.init();
        IngotcraftModTab.init();
    }
}
