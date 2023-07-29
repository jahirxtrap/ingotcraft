package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class SteelItem extends ArmorItem {
    public SteelItem(Type type, Item.Properties properties) {
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
        }, type, properties);
    }

    public static class Helmet extends SteelItem {
        public Helmet() {
            super(Type.HELMET, new Item.Properties());
        }
    }

    public static class Chestplate extends SteelItem {
        public Chestplate() {
            super(Type.CHESTPLATE, new Item.Properties());
        }
    }

    public static class Leggings extends SteelItem {
        public Leggings() {
            super(Type.LEGGINGS, new Item.Properties());
        }
    }

    public static class Boots extends SteelItem {
        public Boots() {
            super(Type.BOOTS, new Item.Properties());
        }
    }
}
