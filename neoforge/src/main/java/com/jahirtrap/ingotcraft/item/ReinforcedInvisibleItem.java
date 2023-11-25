package com.jahirtrap.ingotcraft.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class ReinforcedInvisibleItem extends ArmorItem {
    public ReinforcedInvisibleItem(Type type, Item.Properties properties) {
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
                return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("item.armor.equip_generic"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

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
        }, type, properties);
    }

    public static class Helmet extends ReinforcedInvisibleItem {
        public Helmet() {
            super(Type.HELMET, new Item.Properties().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_1.png";
        }
    }

    public static class Chestplate extends ReinforcedInvisibleItem {
        public Chestplate() {
            super(Type.CHESTPLATE, new Item.Properties().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_1.png";
        }
    }

    public static class Leggings extends ReinforcedInvisibleItem {
        public Leggings() {
            super(Type.LEGGINGS, new Item.Properties().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_2.png";
        }
    }

    public static class Boots extends ReinforcedInvisibleItem {
        public Boots() {
            super(Type.BOOTS, new Item.Properties().rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_1.png";
        }
    }
}
