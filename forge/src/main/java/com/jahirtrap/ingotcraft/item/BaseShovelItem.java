package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;

public class BaseShovelItem extends ShovelItem {
    public BaseShovelItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 1.5f, -3f)));
    }
}
