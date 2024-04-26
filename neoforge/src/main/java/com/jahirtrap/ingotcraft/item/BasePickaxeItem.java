package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class BasePickaxeItem extends PickaxeItem {
    public BasePickaxeItem(Tier tier, Properties properties) {
        super(tier, properties.attributes(createAttributes(tier, 1f, -2.8f)));
    }
}
