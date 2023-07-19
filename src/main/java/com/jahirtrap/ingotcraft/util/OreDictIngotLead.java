package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.item.ItemLeadIngot;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictIngotLead extends ElementsIngotCraft.ModElement {
    public OreDictIngotLead(ElementsIngotCraft instance) {
        super(instance, 105);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("ingotLead", new ItemStack(ItemLeadIngot.block, 1));
    }
}
