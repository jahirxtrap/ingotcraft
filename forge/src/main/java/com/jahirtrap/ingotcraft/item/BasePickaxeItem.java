package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;

public class BasePickaxeItem extends PickaxeItem {
    public BasePickaxeItem(Tier tier, Properties properties) {
        super(tier, 1, -2.8f, properties);
    }
}
