package com.checconio84.mod.items;

import com.checconio84.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSwordMod extends ItemSword
{
    public ItemSwordMod(ToolMaterial p_i45356_1_)
    {
        super(p_i45356_1_);
    }
    
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getHeldItemMainhand();
            
            if(equipped == stack)
            {
                if(stack.getItem() == ItemsMod.uraniumSword)
                {
                    player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 0));
                }
            }
        }
    }
}