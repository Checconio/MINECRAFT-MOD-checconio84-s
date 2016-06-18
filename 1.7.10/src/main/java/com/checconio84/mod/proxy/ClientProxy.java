package com.checconio84.mod.proxy;

import com.checconio84.mod.renders.blocks.RenderBlockFloorLamp;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    public static int renderIsbrh;
    
    @Override
    public void registerRenders()
    {
        renderIsbrh = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler(new RenderBlockFloorLamp());
    }
}