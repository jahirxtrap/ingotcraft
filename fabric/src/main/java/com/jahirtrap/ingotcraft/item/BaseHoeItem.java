package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public class BaseHoeItem extends HoeItem {
    public BaseHoeItem(Tier tier, Properties properties) {
        super(tier, -2, -1f, properties.tab(TAB_INGOTCRAFT));
    }
}
