package com.checconio84.mod.items;

import com.checconio84.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPickaxeMod extends ItemPickaxe
{
    public ItemPickaxeMod(ToolMaterial p_i45347_1_)
    {
        super(p_i45347_1_);
    }
    
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getHeldItemMainhand();
            
            if(equipped == stack)
            {
                if(stack.getItem() == ItemsMod.uraniumPickaxe)
                {
                    player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 0));
                }
            }
        }
    }
}