package com.jahirtrap.ingotcraft.item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.Ingredient;

import static com.jahirtrap.ingotcraft.IngotcraftMod.TAB_INGOTCRAFT;

public abstract class ReinforcedInvisibleItem extends ArmorItem {
    public ReinforcedInvisibleItem(EquipmentSlot slot, Item.Properties properties) {
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

            @Environment(EnvType.CLIENT)
            @Override
            public String getName() {
                return "reinforced_invisible";
            }

            @Override
            public float getToughness() {
                return 2f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, properties);
    }

    public static class Helmet extends ReinforcedInvisibleItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(TAB_INGOTCRAFT).rarity(Rarity.RARE));
        }
    }

    public static class Chestplate extends ReinforcedInvisibleItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(TAB_INGOTCRAFT).rarity(Rarity.RARE));
        }
    }

    public static class Leggings extends ReinforcedInvisibleItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(TAB_INGOTCRAFT).rarity(Rarity.RARE));
        }
    }

    public static class Boots extends ReinforcedInvisibleItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(TAB_INGOTCRAFT).rarity(Rarity.RARE));
        }
    }
}
