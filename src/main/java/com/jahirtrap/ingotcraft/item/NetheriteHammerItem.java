package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public class NetheriteHammerItem extends PickaxeItem {
    public NetheriteHammerItem() {
        super(new Tier() {
            public int getUses() {
                return 2031;
            }

            public float getSpeed() {
                return 10f;
            }

            public float getAttackDamageBonus() {
                return 10f;
            }

            public int getLevel() {
                return 4;
            }

            public int getEnchantmentValue() {
                return 15;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
            }
        }, 1, -3f, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).fireResistant());
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
