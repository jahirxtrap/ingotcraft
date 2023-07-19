package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class SteelSwordItem extends SwordItem {
    public SteelSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 501;
            }

            public float getSpeed() {
                return 6.5f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IngotcraftModItems.STEEL_INGOT));
            }
        }, 3, -2.4f, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT));
        setRegistryName("steel_sword");
    }
}
