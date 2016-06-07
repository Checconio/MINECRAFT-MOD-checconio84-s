package com.checconio84.mod.init;


import com.checconio84.mod.biomes.BiomeChecco;

import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import scala.util.Random;

public class BiomesMod
{  
    public static void init()
    {
        Random random = new Random();
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(new BiomeChecco(100), 10 + random.nextInt(20)));
    }
}