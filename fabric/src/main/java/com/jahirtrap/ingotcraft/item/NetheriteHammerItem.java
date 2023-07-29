package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftMod.TAB_INGOTCRAFT;

public class NetheriteHammerItem extends PickaxeItem implements RepairableItem {
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
        }, 1, -3f, new Item.Properties().tab(TAB_INGOTCRAFT).fireResistant());
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
