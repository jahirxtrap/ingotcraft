package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
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
public class ItemInvisible extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:invisible_helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("ingotcraft:invisible_body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("ingotcraft:invisible_legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("ingotcraft:invisible_boots")
    public static final Item boots = null;

    public ItemInvisible(ElementsIngotCraft instance) {
        super(instance, 31);
    }

    @Override
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("INVISIBLE_", "ingotcraft:invisible", 15, new int[]{2, 5, 6, 2}, 9,
                net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
                0f);
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("invisible_helmet")
                .setRegistryName("invisible_helmet").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("invisible_body")
                .setRegistryName("invisible_body").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("invisible_legs")
                .setRegistryName("invisible_legs").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("invisible_boots")
                .setRegistryName("invisible_boots").setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("ingotcraft:invisible_helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("ingotcraft:invisible_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("ingotcraft:invisible_legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("ingotcraft:invisible_boots", "inventory"));
    }
}
