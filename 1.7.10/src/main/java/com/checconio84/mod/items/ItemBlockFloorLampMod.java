package com.checconio84.mod.items;

import com.checconio84.mod.blocks.BlockFloorLampMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockFloorLampMod extends ItemBlock
{
    public ItemBlockFloorLampMod(Block p_i45328_1_)
    {
        super(p_i45328_1_);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }
    
    public int getMetadata(int metadata)
    {
        return metadata;
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int metadata)
    {
        return this.field_150939_a.getIcon(2, metadata);
    }
    
    public String getUnlocalizedName(ItemStack stack)
    {
        int metadata = stack.getItemDamage();
        if(metadata < 0 || metadata >= BlockFloorLampMod.metaData.length)
        {
            metadata = 0;
        }
        return super.getUnlocalizedName() + "." + BlockFloorLampMod.metaData[metadata];
    }
}