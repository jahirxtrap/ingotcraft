package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.block.BlockTinBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictBlockTin extends ElementsIngotCraft.ModElement {
    public OreDictBlockTin(ElementsIngotCraft instance) {
        super(instance, 101);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("blockTin", new ItemStack(BlockTinBlock.block, 1));
    }
}
