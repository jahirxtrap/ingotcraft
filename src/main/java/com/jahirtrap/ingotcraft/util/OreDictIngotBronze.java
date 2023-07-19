package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.item.ItemBronzeIngot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictIngotBronze extends ElementsIngotCraft.ModElement {
    public OreDictIngotBronze(ElementsIngotCraft instance) {
        super(instance, 103);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ingotBronze", new ItemStack(ItemBronzeIngot.block, 1));
    }
}
