package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsIngotCraft.ModElement.Tag
public class ItemReinforcedInvisible extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:reinforced_invisible_helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("ingotcraft:reinforced_invisible_body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("ingotcraft:reinforced_invisible_legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("ingotcraft:reinforced_invisible_boots")
    public static final Item boots = null;

    public ItemReinforcedInvisible(ElementsIngotCraft instance) {
        super(instance, 32);
    }

    @Override
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("REINFORCED_INVISIBLE_", "ingotcraft:invisible", 31, new int[]{3, 6, 8, 3}, 10,
                net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
                2f);
        elements.items.add(() -> (new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
            public EnumRarity getRarity(ItemStack itemstack) {
                return itemstack.isItemEnchanted() ? EnumRarity.EPIC : EnumRarity.RARE;
            }
        }).setUnlocalizedName("reinforced_invisible_helmet").setRegistryName("reinforced_invisible_helmet").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> (new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST) {
            public EnumRarity getRarity(ItemStack itemstack) {
                return itemstack.isItemEnchanted() ? EnumRarity.EPIC : EnumRarity.RARE;
            }
        }).setUnlocalizedName("reinforced_invisible_body").setRegistryName("reinforced_invisible_body").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> (new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
            public EnumRarity getRarity(ItemStack itemstack) {
                return itemstack.isItemEnchanted() ? EnumRarity.EPIC : EnumRarity.RARE;
            }
        }).setUnlocalizedName("reinforced_invisible_legs").setRegistryName("reinforced_invisible_legs").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> (new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET) {
            public EnumRarity getRarity(ItemStack itemstack) {
                return itemstack.isItemEnchanted() ? EnumRarity.EPIC : EnumRarity.RARE;
            }
        }).setUnlocalizedName("reinforced_invisible_boots").setRegistryName("reinforced_invisible_boots").setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("ingotcraft:reinforced_invisible_helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("ingotcraft:reinforced_invisible_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("ingotcraft:reinforced_invisible_legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("ingotcraft:reinforced_invisible_boots", "inventory"));
    }
}
