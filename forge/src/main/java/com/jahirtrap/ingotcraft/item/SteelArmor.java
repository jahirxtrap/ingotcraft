package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftModTab.TAB_INGOT_CRAFT;

public abstract class SteelArmor extends ArmorItem {
    public SteelArmor(EquipmentSlot slot) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
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
                return SoundEvents.ARMOR_EQUIP_IRON;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IngotcraftModItems.STEEL_INGOT.get()));
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
        }, slot, new Item.Properties().tab(TAB_INGOT_CRAFT));
    }

    public static class Helmet extends SteelArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD);
        }
    }

    public static class Chestplate extends SteelArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST);
        }
    }

    public static class Leggings extends SteelArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS);
        }
    }

    public static class Boots extends SteelArmor {
        public Boots() {
            super(EquipmentSlot.FEET);
        }
    }
}
