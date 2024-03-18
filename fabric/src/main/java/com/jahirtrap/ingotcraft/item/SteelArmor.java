package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class SteelArmor extends ArmorItem {
    public SteelArmor(Type type) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForType(Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 25;
            }

            @Override
            public int getDefenseForType(Type type) {
                return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_IRON;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(
                        new ItemStack(IngotcraftModItems.STEEL_INGOT)
                );
            }

            @Override
            public String getName() {
                return "ingotcraft:steel";
            }

            @Override
            public float getToughness() {
                return 1f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, type, new Item.Properties());
    }

    public static class Helmet extends SteelArmor {
        public Helmet() {
            super(Type.HELMET);
        }
    }

    public static class Chestplate extends SteelArmor {
        public Chestplate() {
            super(Type.CHESTPLATE);
        }
    }

    public static class Leggings extends SteelArmor {
        public Leggings() {
            super(Type.LEGGINGS);
        }
    }

    public static class Boots extends SteelArmor {
        public Boots() {
            super(Type.BOOTS);
        }
    }
}
