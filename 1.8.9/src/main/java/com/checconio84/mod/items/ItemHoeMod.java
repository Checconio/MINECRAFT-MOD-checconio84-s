package com.checconio84.mod.items;

import com.checconio84.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHoeMod extends ItemHoe
{
    public ItemHoeMod(ToolMaterial p_i45343_1_)
    {
        super(p_i45343_1_);
    }
    
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            
            if(equipped == stack)
            {
                if(stack.getItem() == ItemsMod.uraniumHoe)
                {
                    player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 200, 0));
                }
            }
        }
    }
}