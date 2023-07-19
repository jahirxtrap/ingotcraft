package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.block.BlockSilverBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictBlockSilver extends ElementsIngotCraft.ModElement {
    public OreDictBlockSilver(ElementsIngotCraft instance) {
        super(instance, 100);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("blockSilver", new ItemStack(BlockSilverBlock.block, 1));
    }
}
