package com.jahirtrap.ingotcraft.creativetab;

import com.jahirtrap.ingotcraft.item.ItemSteelIngot;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsIngotCraft.ModElement.Tag
public class TabIngotCraft extends ElementsIngotCraft.ModElement {
    public static CreativeTabs tab;

    public TabIngotCraft(ElementsIngotCraft instance) {
        super(instance, 39);
    }

    @Override
    public void initElements() {
        tab = new CreativeTabs("tabingot_craft") {
            @SideOnly(Side.CLIENT)
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(ItemSteelIngot.block, 1);
            }

            @SideOnly(Side.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
