package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class LeadIngotItem extends Item {
    public LeadIngotItem() {
        super(new Item.Properties().tab(IngotcraftModTab.TAB_INGOT_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }
}
