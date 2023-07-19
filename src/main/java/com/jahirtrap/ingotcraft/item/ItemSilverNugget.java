package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.creativetab.TabIngotCraft;
import com.jahirtrap.ingotcraft.ElementsIngotCraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsIngotCraft.ModElement.Tag
public class ItemSilverNugget extends ElementsIngotCraft.ModElement {
    @GameRegistry.ObjectHolder("ingotcraft:silver_nugget")
    public static final Item block = null;

    public ItemSilverNugget(ElementsIngotCraft instance) {
        super(instance, 29);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new ItemCustom());
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("ingotcraft:silver_nugget", "inventory"));
    }

    public static class ItemCustom extends Item {
        public ItemCustom() {
            setMaxDamage(0);
            maxStackSize = 64;
            setUnlocalizedName("silver_nugget");
            setRegistryName("silver_nugget");
            setCreativeTab(TabIngotCraft.tab);
        }

        @Override
        public int getItemEnchantability() {
            return 0;
        }

        @Override
        public int getMaxItemUseDuration(ItemStack itemstack) {
            return 0;
        }

        @Override
        public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
            return 1F;
        }
    }
}
