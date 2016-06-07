package com.checconio84.mod.biomes;

import java.util.Random;

import org.omg.CORBA.SystemException;

import com.checconio84.mod.init.BiomesMod;
import com.checconio84.mod.init.BlocksMod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeChecco extends BiomeGenBase
{

    public BiomeChecco(int p_i1971_1_)
    {
        super(p_i1971_1_);
        this.topBlock = Blocks.grass;
        this.fillerBlock = Blocks.clay;
        this.biomeName = "BiomeChecco";
        this.addDefaultFlowers();
        this.getBiomeGrassColor(0, 148, 255);
        this.theBiomeDecorator.generateLakes = true;
        this.waterColorMultiplier = 0x00F0FF;
        this.enableRain = false;
        this.enableSnow = false;
    }
}