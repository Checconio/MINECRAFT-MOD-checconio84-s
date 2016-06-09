package com.checconio84.mod.items;

import com.checconio84.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMod extends Item
{
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
        if(itemStackIn.getItem() == ItemsMod.marioStars)
        {
            playerIn.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 600, 10));
            playerIn.addPotionEffect(new PotionEffect(Potion.jump.getId(), 600, 10));
            --itemStackIn.stackSize;
        }
        return itemStackIn;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return stack.getItem() == ItemsMod.marioStars;
    }
    
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getCurrentEquippedItem();
            
            if(equipped == stack)
            {
                if(stack.getItem() == ItemsMod.uraniumPowder || stack.getItem() == ItemsMod.uraniumIngot)
                {
                    player.addPotionEffect(new PotionEffect(Potion.poison.getId(), 200, 0));
                }
            }
        }
    }
}