package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class TinIngotItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:tin_ingot")
    public static final Item block = null;

    public TinIngotItem(IngotcraftModElements instance) {
        super(instance, 22);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            super(new Item.Properties().tab(IngotCraftItemGroup.tab).stacksTo(64).rarity(Rarity.COMMON));
            setRegistryName("tin_ingot");
        }

        @Override
        public int getEnchantmentValue() {
            return 0;
        }

        @Override
        public int getUseDuration(ItemStack itemstack) {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
            return 1F;
        }
    }
}
