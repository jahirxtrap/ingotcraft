package com.jahirtrap.ingotcraft.init.mixin;

import com.jahirtrap.ingotcraft.util.RepairableItem;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RepairItemRecipe;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RepairItemRecipe.class)
public abstract class RepairItemRecipeMixin {

    @Inject(method = "assemble*", at = @At("HEAD"), cancellable = true)
    private void assemble(CraftingContainer craftingContainer, Provider provider, CallbackInfoReturnable<ItemStack> cir) {
        for (int i = 0; i < craftingContainer.getContainerSize(); ++i) {
            if (craftingContainer.getItem(i).getItem() instanceof RepairableItem repairableItem && !repairableItem.isRepairable())
                cir.setReturnValue(ItemStack.EMPTY);
        }
    }
}
