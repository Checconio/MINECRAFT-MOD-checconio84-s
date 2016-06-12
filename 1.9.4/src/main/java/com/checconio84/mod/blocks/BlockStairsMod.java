package com.checconio84.mod.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStairs.EnumHalf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStairsMod extends BlockStairs
{   
    public BlockStairsMod(IBlockState modelState)
    {
        super(modelState);
    }
    
    public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        if ( state.isOpaqueCube() )
            return false;

        EnumHalf half = state.getValue(HALF);
        EnumFacing side = state.getValue(FACING);
        return false;
    }
}