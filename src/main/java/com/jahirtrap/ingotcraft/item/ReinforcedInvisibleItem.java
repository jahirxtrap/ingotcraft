package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class ReinforcedInvisibleItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:reinforced_invisible_helmet")
    public static final Item helmet = null;
    @ObjectHolder("ingotcraft:reinforced_invisible_chestplate")
    public static final Item body = null;
    @ObjectHolder("ingotcraft:reinforced_invisible_leggings")
    public static final Item legs = null;
    @ObjectHolder("ingotcraft:reinforced_invisible_boots")
    public static final Item boots = null;

    public ReinforcedInvisibleItem(IngotcraftModElements instance) {
        super(instance, 32);
    }

    @Override
    public void initElements() {
        IArmorMaterial armormaterial = new IArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlotType slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 31;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlotType slot) {
                return new int[]{3, 6, 8, 3}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public net.minecraft.util.SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            @OnlyIn(Dist.CLIENT)
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
        };
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().tab(IngotCraftItemGroup.tab).rarity(Rarity.RARE)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/invisible_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("reinforced_invisible_helmet"));
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().tab(IngotCraftItemGroup.tab).rarity(Rarity.RARE)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/invisible_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("reinforced_invisible_chestplate"));
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().tab(IngotCraftItemGroup.tab).rarity(Rarity.RARE)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/invisible_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("reinforced_invisible_leggings"));
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().tab(IngotCraftItemGroup.tab).rarity(Rarity.RARE)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/invisible_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("reinforced_invisible_boots"));
    }

}
