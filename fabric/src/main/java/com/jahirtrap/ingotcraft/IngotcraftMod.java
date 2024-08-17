package com.jahirtrap.ingotcraft;

import com.jahirtrap.ingotcraft.init.ModContent;
import com.jahirtrap.ingotcraft.init.ModMaterials;
import com.jahirtrap.ingotcraft.init.ModTab;
import net.fabricmc.api.ModInitializer;

public class IngotcraftMod implements ModInitializer {

    public static final String MODID = "ingotcraft";

    @Override
    public void onInitialize() {
        ModMaterials.init();
        ModContent.init();
        ModTab.init();
    }
}
