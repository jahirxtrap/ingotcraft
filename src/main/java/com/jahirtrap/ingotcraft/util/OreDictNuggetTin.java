package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemTinNugget;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictNuggetTin extends ElementsIngotCraft.ModElement {
    public OreDictNuggetTin(ElementsIngotCraft instance) {
        super(instance, 138);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("nuggetTin", new ItemStack(ItemTinNugget.block, 1));
    }
}
