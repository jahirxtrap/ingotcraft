package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Set;

@ElementsIngotCraft.ModElement.Tag
public class ItemBronzeHoe extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:bronze_hoe")
    public static final Item block = null;

    public ItemBronzeHoe(ElementsIngotCraft instance) {
        super(instance, 17);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("BRONZE_HOE", 2, 350, 7f, 2f, 16)) {
            public Set<String> getToolClasses(ItemStack stack) {
                HashMap<String, Integer> ret = new HashMap<String, Integer>();
                ret.put("hoe", 2);
                return ret.keySet();
            }
        }.setUnlocalizedName("bronze_hoe").setRegistryName("bronze_hoe").setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ingotcraft:bronze_hoe", "inventory"));
    }
}
