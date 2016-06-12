package com.checconio84.mod.biomes;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

public class BiomeChecco extends Biome
{
    public BiomeChecco(BiomeProperties properties)
    {
        super(properties);
        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.CLAY.getDefaultState();
        this.addDefaultFlowers();
        this.getGrassColorAtPos(new BlockPos(0, 148, 255));
        this.theBiomeDecorator.generateLakes = true;
    }
}