package com.checconio84.mod.items;

import com.checconio84.mod.References;
import com.checconio84.mod.init.ItemsMod;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemArmorMod extends ItemArmor
{
    
    public ItemArmorMod(ArmorMaterial materialIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, 0, equipmentSlotIn);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemsMod.uraniumLeggings)
        {
            return References.MOD_ID + ":textures/models/armor/uranium_layer_2.png";
        }
        
        else if(stack.getItem() == ItemsMod.uraniumHelmet || stack.getItem() == ItemsMod.uraniumChestplate || stack.getItem() == ItemsMod.uraniumBoots)
        {
            return References.MOD_ID + ":textures/models/armor/uranium_layer_1.png";
        }
        
        else if(stack.getItem() == ItemsMod.uraniumLeggingsDisinfected)
        {
            return References.MOD_ID + ":textures/models/armor/uraniumDisinfected_layer_2.png";
        }
        
        else if(stack.getItem() == ItemsMod.uraniumHelmetDisinfected || stack.getItem() == ItemsMod.uraniumChestplateDisinfected || stack.getItem() == ItemsMod.uraniumBootsDisinfected)
        {
            return References.MOD_ID + ":textures/models/armor/uraniumDisinfected_layer_1.png";
        }
        return null;
    }
    
    public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
    {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);
        {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equipped = player.getHeldItemMainhand();
            
            if(equipped == stack)
            {
                if(stack.getItem() == ItemsMod.uraniumHelmet || stack.getItem() == ItemsMod.uraniumLeggings || stack.getItem() == ItemsMod.uraniumChestplate || stack.getItem() == ItemsMod.uraniumBoots)
                {
                    player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 0));
                }
            }
        }
    }
    
    public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
    {
        super.onArmorTick(world, player, stack);
        {
            if(stack.getItem() == ItemsMod.uraniumHelmet || stack.getItem() == ItemsMod.uraniumLeggings || stack.getItem() == ItemsMod.uraniumChestplate || stack.getItem() == ItemsMod.uraniumBoots)
            {
                player.addPotionEffect(new PotionEffect(Potion.getPotionById(19), 200, 0));
            }
        }
    }
}