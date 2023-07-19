package com.jahirtrap.ingotcraft.block;

import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsIngotCraft.ModElement.Tag
public class BlockTinBlock extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:tin_block")
    public static final Block block = null;

    public BlockTinBlock(ElementsIngotCraft instance) {
        super(instance, 26);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new BlockCustom().setRegistryName("tin_block"));
        elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("ingotcraft:tin_block", "inventory"));
    }

    public static class BlockCustom extends Block {
        public BlockCustom() {
            super(Material.IRON);
            setUnlocalizedName("tin_block");
            setSoundType(SoundType.METAL);
            setHarvestLevel("pickaxe", 2);
            setHardness(5F);
            setResistance(10F);
            setLightLevel(0F);
            setLightOpacity(15);
            setCreativeTab(TabIngotCraft.tab);
        }

        @Override
        public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
            return false;
        }
    }
}
