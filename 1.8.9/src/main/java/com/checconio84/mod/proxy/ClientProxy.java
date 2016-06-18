package com.checconio84.mod.proxy;

import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.init.ItemsMod;
import com.checconio84.mod.renders.blocks.RenderBlockFloorLamp;

import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        BlocksMod.registerRenders();
        ItemsMod.registerRenders();
    }
}