package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemTinIngot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictIngotTin extends ElementsIngotCraft.ModElement {
    public OreDictIngotTin(ElementsIngotCraft instance) {
        super(instance, 107);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ingotTin", new ItemStack(ItemTinIngot.block, 1));
    }
}
