package com.checconio84.mod.blocks;

import java.util.Random;

import com.checconio84.mod.init.ItemsMod;

import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

public class BlockOreMod extends BlockOre
{
    public BlockOreMod(int level)
    {
        this.setHarvestLevel("pickaxe", level);
    }
    
    public static class BlockUraniumOreMod extends BlockOre
    {
        public BlockUraniumOreMod(int level)
        {
            this.setHarvestLevel("pickaxe", level);
        }
        
        public int quantityDropped(Random p_149745_1_)
        {
            return 5 - p_149745_1_.nextInt(2);
        }

        public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
        {
            return ItemsMod.uraniumPowder;
        }
    }
}