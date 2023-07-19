package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemBronzeNugget;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictNuggetBronze extends ElementsIngotCraft.ModElement {
    public OreDictNuggetBronze(ElementsIngotCraft instance) {
        super(instance, 140);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("nuggetBronze", new ItemStack(ItemBronzeNugget.block, 1));
    }
}
