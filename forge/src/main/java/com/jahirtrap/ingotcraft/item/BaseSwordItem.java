package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.init.ModTab.TAB_INGOTCRAFT;

public class BaseSwordItem extends SwordItem {
    public BaseSwordItem(Tier tier, Properties properties) {
        super(tier, 3, -2.4f, properties.tab(TAB_INGOTCRAFT));
    }
}
