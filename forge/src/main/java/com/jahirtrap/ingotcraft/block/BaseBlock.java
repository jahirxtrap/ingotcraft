package com.jahirtrap.ingotcraft.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class BaseBlock extends Block {
    public BaseBlock(Material material, SoundType soundType, float hardness, float resistance) {
        super(BlockBehaviour.Properties.of(material).sound(soundType).strength(hardness, resistance).requiresCorrectToolForDrops()
                .lightLevel($ -> 0));
    }
}
