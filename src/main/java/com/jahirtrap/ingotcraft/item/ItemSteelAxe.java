package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Set;

@ElementsIngotCraft.ModElement.Tag
public class ItemSteelAxe extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:steel_axe")
    public static final Item block = null;

    public ItemSteelAxe(ElementsIngotCraft instance) {
        super(instance, 6);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemToolCustom() {
            public Set<String> getToolClasses(ItemStack stack) {
                HashMap<String, Integer> ret = new HashMap<String, Integer>();
                ret.put("axe", 3);
                return ret.keySet();
            }
        }.setUnlocalizedName("steel_axe").setRegistryName("steel_axe").setCreativeTab(TabIngotCraft.tab));
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ingotcraft:steel_axe", "inventory"));
    }

    private static class ItemToolCustom extends ItemTool {
        private static final Set<Block> effective_items_set = com.google.common.collect.Sets
                .newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
                        Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);

        protected ItemToolCustom() {
            super(EnumHelper.addToolMaterial("STEEL_AXE", 2, 501, 6.5f, 8f, 14), effective_items_set);
            this.attackDamage = 8f;
            this.attackSpeed = -3.1f;
        }

        @Override
        public float getDestroySpeed(ItemStack stack, IBlockState state) {
            Material material = state.getMaterial();
            return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
                    ? super.getDestroySpeed(stack, state)
                    : this.efficiency;
        }
    }
}
