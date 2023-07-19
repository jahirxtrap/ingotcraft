package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsIngotCraft.ModElement.Tag
public class ItemSteel extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:steel_helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("ingotcraft:steel_body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("ingotcraft:steel_legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("ingotcraft:steel_boots")
    public static final Item boots = null;

    public ItemSteel(ElementsIngotCraft instance) {
        super(instance, 9);
    }

    @Override
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("STEEL_", "ingotcraft:steel", 25, new int[]{2, 5, 6, 2}, 9,
                net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_iron")), 1f);
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("steel_helmet").setRegistryName("steel_helmet")
                .setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("steel_body").setRegistryName("steel_body")
                .setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("steel_legs").setRegistryName("steel_legs")
                .setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("steel_boots").setRegistryName("steel_boots")
                .setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("ingotcraft:steel_helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("ingotcraft:steel_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("ingotcraft:steel_legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("ingotcraft:steel_boots", "inventory"));
    }
}
