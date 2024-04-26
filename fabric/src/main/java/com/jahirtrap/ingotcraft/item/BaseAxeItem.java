package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public class BaseAxeItem extends AxeItem {
    public BaseAxeItem(Tier tier, Properties properties) {
        super(tier, 6f, -3.1f, properties.tab(TAB_INGOTCRAFT));
    }
}
