package com.checconio84.mod.items;

import com.checconio84.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemAxeMod extends ItemAxe
{

    public ItemAxeMod(ToolMaterial material, float damage, float speed)
    {
        super(material, damage, speed);
    }

    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getHeldItemMainhand();
            
            if(equipped == stack)
            {
                if(stack.getItem() == ItemsMod.uraniumAxe)
                {
                    player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 0));
                }
            }
        }
    }
}