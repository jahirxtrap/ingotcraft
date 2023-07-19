package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.block.BlockCopperBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictBlockCopper extends ElementsIngotCraft.ModElement {
    public OreDictBlockCopper(ElementsIngotCraft instance) {
        super(instance, 108);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("blockCopper", new ItemStack(BlockCopperBlock.block, 1));
    }
}
