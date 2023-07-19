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
public class ItemBronze extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:bronze_helmet")
    public static final Item helmet = null;
    @GameRegistry.ObjectHolder("ingotcraft:bronze_body")
    public static final Item body = null;
    @GameRegistry.ObjectHolder("ingotcraft:bronze_legs")
    public static final Item legs = null;
    @GameRegistry.ObjectHolder("ingotcraft:bronze_boots")
    public static final Item boots = null;

    public ItemBronze(ElementsIngotCraft instance) {
        super(instance, 18);
    }

    @Override
    public void initElements() {
        ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("BRONZE_", "ingotcraft:bronze", 15, new int[]{2, 5, 6, 2}, 16,
                net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_gold")), 0f);
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("bronze_helmet")
                .setRegistryName("bronze_helmet").setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("bronze_body").setRegistryName("bronze_body")
                .setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("bronze_legs").setRegistryName("bronze_legs")
                .setCreativeTab(TabIngotCraft.tab));
        elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("bronze_boots").setRegistryName("bronze_boots")
                .setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("ingotcraft:bronze_helmet", "inventory"));
        ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("ingotcraft:bronze_body", "inventory"));
        ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("ingotcraft:bronze_legs", "inventory"));
        ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("ingotcraft:bronze_boots", "inventory"));
    }
}
