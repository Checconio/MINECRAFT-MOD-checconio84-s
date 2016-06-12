package com.checconio84.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMod extends Block
{
    public BlockMod(Material p_i45394_1_, int level)
    {
        super(p_i45394_1_);
        this.setHarvestLevel("pickaxe", level);
    }
}