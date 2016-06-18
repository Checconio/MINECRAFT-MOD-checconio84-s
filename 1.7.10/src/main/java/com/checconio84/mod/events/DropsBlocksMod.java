package com.checconio84.mod.events;

import com.checconio84.mod.init.BlocksMod;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

public class DropsBlocksMod
{
    @SubscribeEvent
    public void BlockDestroyed(HarvestDropsEvent event)
    {
        if(event.block == BlocksMod.floorLamp)
        {
            event.drops.clear();
            event.drops.add(new ItemStack(BlocksMod.floorLamp, 1, 0));
        }
    }
}