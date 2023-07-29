package com.jahirtrap.ingotcraft.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

public abstract class InvisibleItem extends ArmorItem {
    public InvisibleItem(Type type, Item.Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForType(Type type) {
                return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 15;
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
                return SoundEvents.ARMOR_EQUIP_GENERIC;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Blocks.GLASS));
            }

            @Environment(EnvType.CLIENT)
            @Override
            public String getName() {
                return "invisible";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, type, properties);
    }

    public static class Helmet extends InvisibleItem {
        public Helmet() {
            super(Type.HELMET, new Item.Properties());
        }
    }

    public static class Chestplate extends InvisibleItem {
        public Chestplate() {
            super(Type.CHESTPLATE, new Item.Properties());
        }
    }

    public static class Leggings extends InvisibleItem {
        public Leggings() {
            super(Type.LEGGINGS, new Item.Properties());
        }
    }

    public static class Boots extends InvisibleItem {
        public Boots() {
            super(Type.BOOTS, new Item.Properties());
        }
    }
}
