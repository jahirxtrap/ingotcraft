package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class EnderiteHammerItem extends PickaxeItem {
    public EnderiteHammerItem() {
        super(new Tier() {
            public int getUses() {
                return 4096;
            }

            public float getSpeed() {
                return 16f;
            }

            public float getAttackDamageBonus() {
                return 11f;
            }

            public int getLevel() {
                return 4;
            }

            public int getEnchantmentValue() {
                return 17;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        }, 1, -3f, new Properties().tab(IngotcraftModTab.TAB_INGOT_CRAFT).fireResistant());
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
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
