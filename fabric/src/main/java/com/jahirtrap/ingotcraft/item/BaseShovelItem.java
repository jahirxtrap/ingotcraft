package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.init.ModTab.TAB_INGOTCRAFT;

public class BaseShovelItem extends ShovelItem {
    public BaseShovelItem(Tier tier, Properties properties) {
        super(tier, 1.5f, -3f, properties.tab(TAB_INGOTCRAFT));
    }
}
