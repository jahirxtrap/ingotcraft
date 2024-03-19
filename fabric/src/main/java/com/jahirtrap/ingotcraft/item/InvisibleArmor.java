package com.jahirtrap.ingotcraft.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOTCRAFT;

public abstract class InvisibleArmor extends ArmorItem {
    public InvisibleArmor(EquipmentSlot slot) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{2, 5, 6, 2}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_GENERIC;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Blocks.GLASS));
            }

            @Override
            public String getName() {
                return "ingotcraft_invisible";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, new Item.Properties().tab(TAB_INGOTCRAFT));
    }

    public static class Helmet extends InvisibleArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD);
        }
    }

    public static class Chestplate extends InvisibleArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST);
        }
    }

    public static class Leggings extends InvisibleArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS);
        }
    }

    public static class Boots extends InvisibleArmor {
        public Boots() {
            super(EquipmentSlot.FEET);
        }
    }
}
