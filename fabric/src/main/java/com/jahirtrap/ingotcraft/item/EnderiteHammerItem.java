package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftMod.TAB_INGOTCRAFT;

public class EnderiteHammerItem extends PickaxeItem implements RepairableItem {
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
        }, 1, -3f, new Properties().tab(TAB_INGOTCRAFT).fireResistant());
    }

    @Override
    public boolean hasCraftingRemainingItem() {
        return true;
    }

    @Override
    public ItemStack getRecipeRemainder(ItemStack itemstack) {
        ItemStack retval = new ItemStack(this);
        retval.setDamageValue(itemstack.getDamageValue() + 1);
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        return retval;
    }

    @Override
    public boolean isRepairable() {
        return false;
    }
}
