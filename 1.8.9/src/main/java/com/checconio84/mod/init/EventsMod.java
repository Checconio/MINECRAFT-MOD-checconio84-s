package com.checconio84.mod.init;

import com.checconio84.mod.events.DropsBlocksMod;

import net.minecraftforge.common.MinecraftForge;

public class EventsMod
{
    public static void init()
    {
        MinecraftForge.EVENT_BUS.register(new DropsBlocksMod());
    }
}