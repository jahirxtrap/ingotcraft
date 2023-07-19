package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.init.IngotcraftModTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

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
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
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
        }, slot, properties);
    }

    public static class Helmet extends ReinforcedInvisibleItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_1.png";
        }
    }

    public static class Chestplate extends ReinforcedInvisibleItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_1.png";
        }
    }

    public static class Leggings extends ReinforcedInvisibleItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_2.png";
        }
    }

    public static class Boots extends ReinforcedInvisibleItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(IngotcraftModTabs.TAB_INGOT_CRAFT).rarity(Rarity.RARE));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "ingotcraft:textures/models/armor/invisible_layer_1.png";
        }
    }
}
