package com.checconio84.mod.proxy;

import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.init.ItemsMod;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        BlocksMod.registerRenders();
        ItemsMod.registerRenders();
    }
}