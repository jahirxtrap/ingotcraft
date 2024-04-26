package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BaseSwordItem extends SwordItem {
    public BaseSwordItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 3, -2.4f)));
    }
}
