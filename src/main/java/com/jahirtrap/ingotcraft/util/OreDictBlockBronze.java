package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.block.BlockBronzeBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictBlockBronze extends ElementsIngotCraft.ModElement {
    public OreDictBlockBronze(ElementsIngotCraft instance) {
        super(instance, 109);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("blockBronze", new ItemStack(BlockBronzeBlock.block, 1));
    }
}
