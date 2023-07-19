package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
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
public class ItemDiamondHammer extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:diamond_hammer")
    public static final Item block = null;

    public ItemDiamondHammer(ElementsIngotCraft instance) {
        super(instance, 35);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("DIAMOND_HAMMER", 3, 1561, 9f, 9f, 10)) {
            {
                this.attackSpeed = -3f;
            }

            public Set<String> getToolClasses(ItemStack stack) {
                HashMap<String, Integer> ret = new HashMap<String, Integer>();
                ret.put("pickaxe", 3);
                return ret.keySet();
            }

            @Override
            public ItemStack getContainerItem(ItemStack stack) {
                ItemStack result = stack.copy();
                result.setItemDamage(stack.getItemDamage() + 1);
                return result;
            }

            @Override
            public boolean hasContainerItem(ItemStack stack) {
                return stack.getItemDamage() < stack.getMaxDamage();
            }
        }.setUnlocalizedName("diamond_hammer").setRegistryName("diamond_hammer").setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ingotcraft:diamond_hammer", "inventory"));
    }
}
