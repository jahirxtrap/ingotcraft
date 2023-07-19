package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class SteelItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:steel_helmet")
    public static final Item helmet = null;
    @ObjectHolder("ingotcraft:steel_chestplate")
    public static final Item body = null;
    @ObjectHolder("ingotcraft:steel_leggings")
    public static final Item legs = null;
    @ObjectHolder("ingotcraft:steel_boots")
    public static final Item boots = null;

    public SteelItem(IngotcraftModElements instance) {
        super(instance, 9);
    }

    @Override
    public void initElements() {
        IArmorMaterial armormaterial = new IArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlotType slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlotType slot) {
                return new int[]{2, 5, 6, 2}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public net.minecraft.util.SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(SteelIngotItem.block));
            }

            @OnlyIn(Dist.CLIENT)
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
        };
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/steel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("steel_helmet"));
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/steel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("steel_chestplate"));
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/steel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("steel_leggings"));
        elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
            @Override
            public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
                return "ingotcraft:textures/models/armor/steel_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
            }
        }.setRegistryName("steel_boots"));
    }

}
