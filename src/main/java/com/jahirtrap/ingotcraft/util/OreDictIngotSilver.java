package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemSilverIngot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictIngotSilver extends ElementsIngotCraft.ModElement {
    public OreDictIngotSilver(ElementsIngotCraft instance) {
        super(instance, 106);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ingotSilver", new ItemStack(ItemSilverIngot.block, 1));
    }
}
