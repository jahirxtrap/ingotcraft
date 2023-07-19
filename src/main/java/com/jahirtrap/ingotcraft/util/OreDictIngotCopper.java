package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemCopperIngot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictIngotCopper extends ElementsIngotCraft.ModElement {
    public OreDictIngotCopper(ElementsIngotCraft instance) {
        super(instance, 102);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ingotCopper", new ItemStack(ItemCopperIngot.block, 1));
    }
}
