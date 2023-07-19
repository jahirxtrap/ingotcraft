package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class SteelHoeItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:steel_hoe")
    public static final Item block = null;

    public SteelHoeItem(IngotcraftModElements instance) {
        super(instance, 8);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new HoeItem(new IItemTier() {
            public int getUses() {
                return 501;
            }

            public float getSpeed() {
                return 6.5f;
            }

            public float getAttackDamageBonus() {
                return 0f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(SteelIngotItem.block));
            }
        }, 0, -1f, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
        }.setRegistryName("steel_hoe"));
    }
}
