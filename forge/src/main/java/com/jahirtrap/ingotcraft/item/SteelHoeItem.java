package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModTab;
import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelHoeItem extends HoeItem {
    public SteelHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 501;
            }

            public float getSpeed() {
                return 6.5f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IngotcraftModItems.STEEL_INGOT.get()));
            }
        }, 0, -1f, new Item.Properties().tab(IngotcraftModTab.TAB_INGOT_CRAFT));
    }
}
