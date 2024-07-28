package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;

import static com.jahirtrap.ingotcraft.init.ModTab.TAB_INGOTCRAFT;

public class BaseItem extends Item {
    public BaseItem() {
        super(new Item.Properties().tab(TAB_INGOTCRAFT));
    }
}
