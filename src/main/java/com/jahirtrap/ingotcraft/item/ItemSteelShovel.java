package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
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
public class ItemSteelShovel extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:steel_shovel")
    public static final Item block = null;

    public ItemSteelShovel(ElementsIngotCraft instance) {
        super(instance, 7);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("STEEL_SHOVEL", 2, 501, 6.5f, 2f, 14)) {
            {
                this.attackSpeed = -3f;
            }

            public Set<String> getToolClasses(ItemStack stack) {
                HashMap<String, Integer> ret = new HashMap<String, Integer>();
                ret.put("spade", 2);
                return ret.keySet();
            }
        }.setUnlocalizedName("steel_shovel").setRegistryName("steel_shovel").setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ingotcraft:steel_shovel", "inventory"));
    }
}
