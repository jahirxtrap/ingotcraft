package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class BronzeHammerItem extends PickaxeItem {
    public BronzeHammerItem() {
        super(new Tier() {
            public int getUses() {
                return 350;
            }

            public float getSpeed() {
                return 8f;
            }

            public float getAttackDamageBonus() {
                return 8f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 16;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IngotcraftModItems.BRONZE_INGOT.get()));
            }
        }, 1, -3f, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT));
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }
}
