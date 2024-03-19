package com.jahirtrap.ingotcraft.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public abstract class ReinforcedInvisibleArmor extends ArmorItem {
    public ReinforcedInvisibleArmor(EquipmentSlot slot) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{3, 6, 8, 3}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_GENERIC;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            @Override
            public String getName() {
                return "ingotcraft_invisible";
            }

            @Override
            public float getToughness() {
                return 2f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, new Item.Properties().rarity(Rarity.RARE).tab(TAB_INGOTCRAFT));
    }

    public static class Helmet extends ReinforcedInvisibleArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD);
        }
    }

    public static class Chestplate extends ReinforcedInvisibleArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST);
        }
    }

    public static class Leggings extends ReinforcedInvisibleArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS);
        }
    }

    public static class Boots extends ReinforcedInvisibleArmor {
        public Boots() {
            super(EquipmentSlot.FEET);
        }
    }
}
