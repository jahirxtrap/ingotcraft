package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftMod.TAB_INGOTCRAFT;

public class BronzeShovelItem extends ShovelItem {
    public BronzeShovelItem() {
        super(new Tier() {
            public int getUses() {
                return 350;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 2.5f;
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
        }, 1, -3f, new Item.Properties().tab(TAB_INGOTCRAFT));
    }
}
