package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class RawLeadItem extends Item {
    public RawLeadItem() {
        super(new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
        setRegistryName("raw_lead");
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }
}
