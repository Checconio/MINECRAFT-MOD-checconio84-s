package com.checconio84.mod.events;

import com.checconio84.mod.init.BlocksMod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropsBlocksMod
{
    @SubscribeEvent
    public void BlockDestroyed(HarvestDropsEvent event)
    {
        if(event.getState().getBlock() == BlocksMod.floorLamp)
        {
            event.getDrops().clear();
            event.getDrops().add(new ItemStack(BlocksMod.floorLamp, 1, 0));
        }
    }
}