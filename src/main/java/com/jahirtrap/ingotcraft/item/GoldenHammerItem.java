package com.jahirtrap.ingotcraft.item;

import com.jahirtrap.ingotcraft.IngotcraftModElements;
import com.jahirtrap.ingotcraft.itemgroup.IngotCraftItemGroup;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

@IngotcraftModElements.ModElement.Tag
public class GoldenHammerItem extends IngotcraftModElements.ModElement {
    @ObjectHolder("ingotcraft:golden_hammer")
    public static final Item block = null;

    public GoldenHammerItem(IngotcraftModElements instance) {
        super(instance, 34);
    }

    @Override
    public void initElements() {
        elements.items.add(() -> new PickaxeItem(new IItemTier() {
            public int getUses() {
                return 160;
            }

            public float getSpeed() {
                return 13f;
            }

            public float getAttackDamageBonus() {
                return 6f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 22;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
            }
        }, 1, -3f, new Item.Properties().tab(IngotCraftItemGroup.tab)) {
            @Override
            public boolean hasCraftingRemainingItem() {
                return true;
            }

            @Override
            public ItemStack getContainerItem(ItemStack itemstack) {
                ItemStack retval = new ItemStack(this);
                retval.setDamageValue(itemstack.getDamageValue() + 1);
                if (retval.getDamageValue() >= retval.getMaxDamage()) {
                    return ItemStack.EMPTY;
                }
                return retval;
            }

            @Override
            public boolean isRepairable(ItemStack itemstack) {
                return false;
            }
        }.setRegistryName("golden_hammer"));
    }
}
