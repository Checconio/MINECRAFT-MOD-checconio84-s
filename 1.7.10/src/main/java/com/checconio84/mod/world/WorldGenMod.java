package com.checconio84.mod.world;

import java.util.Random;

import com.checconio84.mod.biomes.BiomeChecco;
import com.checconio84.mod.blocks.BlockMod;
import com.checconio84.mod.init.BlocksMod;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenMod implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId)
        {
            case -1:
                GenerateNether(world, chunkX * 16, chunkZ * 16, random);
                break;
                
            case 0:
                GenerateOverWorld(world, chunkX * 16, chunkZ * 16, random);
                break;
                
            case 1:
                GenerateEnd(world, chunkX * 16, chunkZ * 16, random);
                break;
        }
    }
    
    private void addOre(Block block, Block blockSpawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minV, int maxV, int spawnChance)
    {
        for(int i = 0; i < spawnChance; i++)
        {
            int chunkSize = 16;
            int Xpos = posX + random.nextInt(chunkSize);
            int Ypos = minY + random.nextInt(maxY - minY);
            int Zpos = posZ + random.nextInt(chunkSize);
            
            new WorldGenMinable(block, maxV, blockSpawn).generate(world, random, Xpos, Ypos, Zpos);
        }
    }

    private void GenerateNether(World world, int i, int j, Random random)
    {
        
    }

    private void GenerateOverWorld(World world, int i, int j, Random random)
    {
        addOre(BlocksMod.uraniumOre, Blocks.stone, random, world, i, j, 0, 20, 1, 2, 3);
        
        if(world.getBiomeGenForCoords(i, j).equals(BiomeGenBase.megaTaiga))
        {
            addOre(BlocksMod.uraniumOre, Blocks.grass, random, world, i, j, 50, 140, 3, 5, 100);
        }
    }

    private void GenerateEnd(World world, int i, int j, Random random)
    {
        
    }
}