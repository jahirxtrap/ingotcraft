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

public abstract class BronzeArmor extends ArmorItem {
    public BronzeArmor(EquipmentSlot slot) {
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
                return 16;
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_GOLD;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(IngotcraftModItems.BRONZE_INGOT.get()));
            }

            @Override
            public String getName() {
                return "ingotcraft:bronze";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, new Item.Properties().tab(TAB_INGOT_CRAFT));
    }

    public static class Helmet extends BronzeArmor {
        public Helmet() {
            super(EquipmentSlot.HEAD);
        }
    }

    public static class Chestplate extends BronzeArmor {
        public Chestplate() {
            super(EquipmentSlot.CHEST);
        }
    }

    public static class Leggings extends BronzeArmor {
        public Leggings() {
            super(EquipmentSlot.LEGS);
        }
    }

    public static class Boots extends BronzeArmor {
        public Boots() {
            super(EquipmentSlot.FEET);
        }
    }
}
