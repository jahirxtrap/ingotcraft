package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class LeadNuggetItem extends Item {
    public LeadNuggetItem() {
        super(new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
        setRegistryName("lead_nugget");
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }
}
