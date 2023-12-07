package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

public class SilverNuggetItem extends Item {
    public SilverNuggetItem() {
        super(new Item.Properties().tab(IngotcraftModTab.TAB_INGOT_CRAFT).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }
}
