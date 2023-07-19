package com.jahirtrap.ingotcraft.block;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Collections;
import java.util.List;

@IngotcraftModElements.ModElement.Tag
public class SilverBlock extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:silver_block")
    public static final Block block = null;

    public SilverBlock(IngotcraftModElements instance) {
        super(instance, 25);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new CustomBlock());
        elements.items.add(() -> new BlockItem(block, new Item.Properties().tab(IngotCraftItemGroup.tab)).setRegistryName(block.getRegistryName()));
    }

    public static class CustomBlock extends Block {
        public CustomBlock() {
            super(Block.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5f, 6f).lightLevel(s -> 0).harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops());
            setRegistryName("silver_block");
        }

        @Override
        public int getLightBlock(BlockState state, IBlockReader worldIn, BlockPos pos) {
            return 15;
        }

        @Override
        public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
            List<ItemStack> dropsOriginal = super.getDrops(state, builder);
            if (!dropsOriginal.isEmpty())
                return dropsOriginal;
            return Collections.singletonList(new ItemStack(this, 1));
        }
    }
}
