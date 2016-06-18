package com.checconio84.mod.events;

import java.util.Random;

import com.checconio84.mod.init.BlocksMod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropsBlocksMod
{
    @SubscribeEvent
    public void BlockDestroyed(HarvestDropsEvent event)
    {
        if(event.state.getBlock() == BlocksMod.floorLamp)
        {
            event.drops.clear();
            event.drops.add(new ItemStack(BlocksMod.floorLamp, 1, 0));
        }
    }
}