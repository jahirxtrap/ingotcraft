package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemSteelNugget;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictNuggetSteel extends ElementsIngotCraft.ModElement {
    public OreDictNuggetSteel(ElementsIngotCraft instance) {
        super(instance, 135);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("nuggetSteel", new ItemStack(ItemSteelNugget.block, 1));
    }
}
