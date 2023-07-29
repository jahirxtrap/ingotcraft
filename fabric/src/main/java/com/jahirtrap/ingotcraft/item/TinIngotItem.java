package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

import static com.jahirtrap.ingotcraft.IngotcraftMod.TAB_INGOTCRAFT;

public class TinIngotItem extends Item {
    public TinIngotItem() {
        super(new Item.Properties().tab(TAB_INGOTCRAFT).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }
}
