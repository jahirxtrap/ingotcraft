package com.jahirtrap.ingotcraft.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class BaseBlock extends Block {
    public BaseBlock(MapColor mapColor, SoundType soundType) {
        super(Properties.of().mapColor(mapColor).sound(soundType).strength(5f, 6f).requiresCorrectToolForDrops()
                .lightLevel($ -> 0));
    }
}
