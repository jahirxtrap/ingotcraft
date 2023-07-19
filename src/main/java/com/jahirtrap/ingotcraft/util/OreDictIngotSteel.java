package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemSteelIngot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictIngotSteel extends ElementsIngotCraft.ModElement {
    public OreDictIngotSteel(ElementsIngotCraft instance) {
        super(instance, 104);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ingotSteel", new ItemStack(ItemSteelIngot.block, 1));
    }
}
