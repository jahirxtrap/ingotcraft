package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.block.BlockLeadBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictBlockLead extends ElementsIngotCraft.ModElement {
    public OreDictBlockLead(ElementsIngotCraft instance) {
        super(instance, 99);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("blockLead", new ItemStack(BlockLeadBlock.block, 1));
    }
}
