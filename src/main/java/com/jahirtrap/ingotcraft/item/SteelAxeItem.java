package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class SteelAxeItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:steel_axe")
    public static final Item block = null;

    public SteelAxeItem(IngotcraftModElements instance) {
        super(instance, 6);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new AxeItem(new IItemTier() {
            public int getUses() {
                return 501;
            }

            public float getSpeed() {
                return 6.5f;
            }

            public float getAttackDamageBonus() {
                return 7f;
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
        }, 1, -3.1f, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
        }.setRegistryName("steel_axe"));
    }
}
