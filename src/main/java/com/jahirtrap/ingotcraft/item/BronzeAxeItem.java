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
public class BronzeAxeItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:bronze_axe")
    public static final Item block = null;

    public BronzeAxeItem(IngotcraftModElements instance) {
        super(instance, 15);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new AxeItem(new IItemTier() {
            public int getUses() {
                return 350;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 7f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 16;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(BronzeIngotItem.block));
            }
        }, 1, -3.1f, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
        }.setRegistryName("bronze_axe"));
    }
}
