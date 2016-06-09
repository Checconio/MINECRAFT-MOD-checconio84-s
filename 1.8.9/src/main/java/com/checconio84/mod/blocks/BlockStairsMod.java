package com.checconio84.mod.blocks;

import com.checconio84.mod.init.BlocksMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStairs.EnumHalf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStairsMod extends BlockStairs
{   
    public BlockStairsMod(IBlockState modelState)
    {
        super(modelState);
    }
    
    public boolean doesSideBlockRendering(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        if ( isOpaqueCube() )
            return false;
        
        IBlockState iblockstate = world.getBlockState(pos);
        EnumHalf half = iblockstate.getValue(HALF);
        EnumFacing side = iblockstate.getValue(FACING);
        return false;
    }
}