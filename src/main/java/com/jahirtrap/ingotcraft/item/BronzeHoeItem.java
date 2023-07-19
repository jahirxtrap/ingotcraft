package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class BronzeHoeItem extends HoeItem {
    public BronzeHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 350;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 16;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IngotcraftModItems.BRONZE_INGOT));
            }
        }, 0, -1f, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT));
        setRegistryName("bronze_hoe");
    }
}
