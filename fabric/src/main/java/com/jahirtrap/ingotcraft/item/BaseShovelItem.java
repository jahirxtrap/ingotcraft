package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public class BaseShovelItem extends ShovelItem {
    public BaseShovelItem(int uses, float speed, float damage, int level, int enchantment, Ingredient repair, Properties properties) {
        super(new Tier() {
            public int getUses() {
                return uses;
            }

            public float getSpeed() {
                return speed;
            }

            public float getAttackDamageBonus() {
                return damage;
            }

            public int getLevel() {
                return level;
            }

            public int getEnchantmentValue() {
                return enchantment;
            }

            public Ingredient getRepairIngredient() {
                return repair;
            }
        }, 1, -3f, properties.tab(TAB_INGOTCRAFT));
    }
}
