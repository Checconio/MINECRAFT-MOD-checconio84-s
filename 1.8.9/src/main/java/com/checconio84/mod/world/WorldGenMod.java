package com.checconio84.mod.world;

import java.util.Random;

import com.checconio84.mod.init.BlocksMod;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenMod implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.getDimensionId())
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
            
            IBlockState state = block.getDefaultState();
            BlockPos blockPos = new BlockPos(Xpos, Ypos, Zpos);
            
            new WorldGenMinable(state, maxV, BlockHelper.forBlock(blockSpawn)).generate(world, random, blockPos);
        }
    }

    private void GenerateNether(World world, int i, int j, Random random)
    {
        
    }

    private void GenerateOverWorld(World world, int i, int j, Random random)
    {
        BlockPos pos = new BlockPos(i, 0, j);
        addOre(BlocksMod.uraniumOre, Blocks.stone, random, world, i, j, 0, 20, 1, 2, 3);
        
        if(world.getBiomeGenForCoords(pos).equals(BiomeGenBase.megaTaiga))
        {
            addOre(BlocksMod.uraniumOre, Blocks.grass, random, world, i, j, 50, 140, 3, 5, 100);
        }
    }

    private void GenerateEnd(World world, int i, int j, Random random)
    {
        
    }
}