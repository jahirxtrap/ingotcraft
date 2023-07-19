package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemCopperNugget;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictNuggetCopper extends ElementsIngotCraft.ModElement {
    public OreDictNuggetCopper(ElementsIngotCraft instance) {
        super(instance, 139);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("nuggetCopper", new ItemStack(ItemCopperNugget.block, 1));
    }
}
