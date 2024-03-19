package com.jahirtrap.ingotcraft.item;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public class BaseHoeItem extends HoeItem {
    public BaseHoeItem(int uses, float speed, float damage, int level, int enchantment, Ingredient repair, Properties properties) {
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
        }, 0, -1f, properties.tab(TAB_INGOTCRAFT));
    }
}
