package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOT_CRAFT;

public class BaseItem extends Item {
    public BaseItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).tab(TAB_INGOT_CRAFT));
    }
}
