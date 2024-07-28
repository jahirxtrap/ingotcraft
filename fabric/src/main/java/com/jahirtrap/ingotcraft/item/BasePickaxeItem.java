package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

import static com.jahirtrap.ingotcraft.init.ModTab.TAB_INGOTCRAFT;

public class BasePickaxeItem extends PickaxeItem {
    public BasePickaxeItem(Tier tier, Properties properties) {
        super(tier, 1, -2.8f, properties.tab(TAB_INGOTCRAFT));
    }
}
