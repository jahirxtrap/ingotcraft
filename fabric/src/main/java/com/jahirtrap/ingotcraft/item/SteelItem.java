package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftMod.TAB_INGOTCRAFT;

public abstract class SteelItem extends ArmorItem {
    public SteelItem(EquipmentSlot slot, Item.Properties properties) {
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
                return Ingredient.of(
                        new ItemStack(IngotcraftModItems.STEEL_INGOT)
                );
            }

            @Environment(EnvType.CLIENT)
            @Override
            public String getName() {
                return "steel";
            }

            @Override
            public float getToughness() {
                return 1f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, properties);
    }

    public static class Helmet extends SteelItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(TAB_INGOTCRAFT));
        }
    }

    public static class Chestplate extends SteelItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(TAB_INGOTCRAFT));
        }
    }

    public static class Leggings extends SteelItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(TAB_INGOTCRAFT));
        }
    }

    public static class Boots extends SteelItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(TAB_INGOTCRAFT));
        }
    }
}
