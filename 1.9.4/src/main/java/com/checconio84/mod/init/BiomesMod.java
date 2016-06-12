package com.checconio84.mod.init;

import java.util.Random;

import com.checconio84.mod.biomes.BiomeChecco;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class BiomesMod
{
    static BiomeChecco biomeChecco = new BiomeChecco(new BiomeProperties("BiomeChecco").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(0.8F).setRainfall(0.4F).setWaterColor(61695).setRainDisabled());
    
    public static void init()
    {
        Random random = new Random();
        Biome.registerBiome(200, "BiomeChecco", biomeChecco);
        BiomeManager.addSpawnBiome(biomeChecco);
        BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(biomeChecco, 10 + random.nextInt(20)));
        BiomeDictionary.registerBiomeType(biomeChecco, Type.PLAINS);
    }
}