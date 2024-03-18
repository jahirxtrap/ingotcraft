package com.jahirtrap.ingotcraft.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class ReinforcedInvisibleArmor extends ArmorItem {
    public ReinforcedInvisibleArmor(Type type) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForType(Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 30;
            }

            @Override
            public int getDefenseForType(Type type) {
                return new int[]{3, 6, 8, 3}[type.getSlot().getIndex()];
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
                return "ingotcraft:invisible";
            }

            @Override
            public float getToughness() {
                return 2f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, type, new Item.Properties().rarity(Rarity.RARE));
    }

    public static class Helmet extends ReinforcedInvisibleArmor {
        public Helmet() {
            super(Type.HELMET);
        }
    }

    public static class Chestplate extends ReinforcedInvisibleArmor {
        public Chestplate() {
            super(Type.CHESTPLATE);
        }
    }

    public static class Leggings extends ReinforcedInvisibleArmor {
        public Leggings() {
            super(Type.LEGGINGS);
        }
    }

    public static class Boots extends ReinforcedInvisibleArmor {
        public Boots() {
            super(Type.BOOTS);
        }
    }
}
