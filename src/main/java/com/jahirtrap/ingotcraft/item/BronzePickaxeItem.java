package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class BronzePickaxeItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:bronze_pickaxe")
    public static final Item block = null;

    public BronzePickaxeItem(IngotcraftModElements instance) {
        super(instance, 14);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new PickaxeItem(new IItemTier() {
            public int getUses() {
                return 350;
            }

            public float getSpeed() {
                return 7f;
            }

            public float getAttackDamageBonus() {
                return 2f;
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
        }, 1, -2.7999999999999998f, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
        }.setRegistryName("bronze_pickaxe"));
    }
}
