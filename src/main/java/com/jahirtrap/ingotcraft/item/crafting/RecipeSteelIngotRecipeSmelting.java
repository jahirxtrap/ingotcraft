package com.jahirtrap.ingotcraft.item.crafting;

import com.jahirtrap.ingotcraft.item.ItemSteelIngot;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsIngotCraft.ModElement.Tag
public class RecipeSteelIngotRecipeSmelting extends ElementsIngotCraft.ModElement {
    public RecipeSteelIngotRecipeSmelting(ElementsIngotCraft instance) {
        super(instance, 97);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        GameRegistry.addSmelting(new ItemStack(Items.IRON_INGOT, 1), new ItemStack(ItemSteelIngot.block, 1), 1F);
    }
}
