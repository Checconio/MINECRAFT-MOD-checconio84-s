package com.checconio84.mod.world;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldRegisterMod
{
    public static void mainRegsitry()
    {
        registerWorldGen(new WorldGenMod(), 0);
    }

    private static void registerWorldGen(IWorldGenerator iGenerator, int weightProbability)
    {
        GameRegistry.registerWorldGenerator(iGenerator, weightProbability);
    }
}