package com.jahirtrap.ingotcraft.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class BaseBlock extends Block {
    public BaseBlock(MapColor mapColor, SoundType soundType, float hardness, float resistance) {
        super(BlockBehaviour.Properties.of().mapColor(mapColor).sound(soundType).strength(hardness, resistance).requiresCorrectToolForDrops()
                .lightLevel($ -> 0));
    }
}
