package com.jahirtrap.ingotcraft.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public interface Items {
        TagKey<Item> STEEL_INGOTS = create(new ResourceLocation("c:steel_ingots"));
        TagKey<Item> BRONZE_INGOTS = create(new ResourceLocation("c:bronze_ingots"));
        TagKey<Item> ZURITE_INGOTS = create(new ResourceLocation("c:zurite_ingots"));
        TagKey<Item> ENDERITE_INGOTS = create(new ResourceLocation("c:enderite_ingots"));

        private static TagKey<Item> create(ResourceLocation name) {
            return TagKey.create(Registry.ITEM_REGISTRY, name);
        }
    }
}
