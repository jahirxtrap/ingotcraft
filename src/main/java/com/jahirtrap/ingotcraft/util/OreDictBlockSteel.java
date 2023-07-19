package com.jahirtrap.ingotcraft.util;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.block.BlockSteelBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@ElementsIngotCraft.ModElement.Tag
public class OreDictBlockSteel extends ElementsIngotCraft.ModElement {
    public OreDictBlockSteel(ElementsIngotCraft instance) {
        super(instance, 98);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        OreDictionary.registerOre("blockSteel", new ItemStack(BlockSteelBlock.block, 1));
    }
}
