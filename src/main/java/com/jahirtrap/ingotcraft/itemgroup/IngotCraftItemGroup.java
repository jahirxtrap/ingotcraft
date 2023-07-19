package com.jahirtrap.ingotcraft.itemgroup;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.item.SteelIngotItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@IngotcraftModElements.ModElement.Tag
public class IngotCraftItemGroup extends IngotcraftModElements.ModElement {
    public static ItemGroup tab;

    public IngotCraftItemGroup(IngotcraftModElements instance) {
        super(instance, 39);
    }

    @Override
    public void initElements() {
        tab = new ItemGroup("tabingot_craft") {
            @OnlyIn(Dist.CLIENT)
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(SteelIngotItem.block);
            }

            @OnlyIn(Dist.CLIENT)
            public boolean hasSearchBar() {
                return false;
            }
        };
    }
}
