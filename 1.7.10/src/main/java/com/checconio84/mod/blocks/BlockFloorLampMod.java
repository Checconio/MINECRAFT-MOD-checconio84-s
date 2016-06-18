package com.checconio84.mod.blocks;

import java.util.List;
import java.util.Random;

import com.checconio84.mod.References;
import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.proxy.ClientProxy;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockFloorLampMod extends Block
{
    public static String[] metaData = new String[] {"floorLamp1", "floorLamp2", "floorLamp3", "floorLamp4"};
    public IIcon[] iconArray = new IIcon[metaData.length];
    
    public BlockFloorLampMod(Material p_i45394_1_)
    {
        super(p_i45394_1_);
    }
    
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for(int i = 0; i < this.metaData.length; i++)
        {
            this.iconArray[ i] = iconRegister.registerIcon(References.MOD_ID + ":" + this.metaData[i]);
        }
    }
    
    public int onBlockPlaced(World world, int x, int y, int z, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
    {
        world.setBlock(x, y+1, z, BlocksMod.floorLamp, 1, 3);
        world.setBlock(x, y+2, z, BlocksMod.floorLamp, 2, 3);
        world.setBlock(x, y+3, z, BlocksMod.floorLamp, 3, 3);
        return p_149660_9_;
    }
    
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int p_149664_5_)
    {
        if(world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y+1, z) == BlocksMod.floorLamp)
        {
            world.setBlock(x, y+1, z, Blocks.air);
            world.setBlock(x, y+2, z, Blocks.air);
            world.setBlock(x, y+3, z, Blocks.air);
        }
        
        if(world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y-1, z) == BlocksMod.floorLamp)
        {
            world.setBlock(x, y-1, z, Blocks.air);
            world.setBlock(x, y+1, z, Blocks.air);
            world.setBlock(x, y+2, z, Blocks.air);
        }
        
        if(world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y-2, z) == BlocksMod.floorLamp)
        {
            world.setBlock(x, y-2, z, Blocks.air);
            world.setBlock(x, y-1, z, Blocks.air);
            world.setBlock(x, y+1, z, Blocks.air);
        }
        
        if(world.getBlockMetadata(x, y, z) == 0 && world.getBlock(x, y-3, z) == BlocksMod.floorLamp)
        {
            world.setBlock(x, y-3, z, Blocks.air);
            world.setBlock(x, y-2, z, Blocks.air);
            world.setBlock(x, y-1, z, Blocks.air);
        }
    }
    
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
        list.add(new ItemStack(item, 1, 0));
    }
    
    public IIcon getIcon(int side, int metadata)
    {
        return metadata >= 0 && metadata < this.metaData.length ? this.iconArray[metadata] : this.iconArray[0];
    }
    
    public int damageDropped(int metadata)
    {
        return metadata;
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderType()
    {
        return ClientProxy.renderIsbrh;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess state, int x, int y, int z, int side)
    {
        return true;
    }
    
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB axisAlignedBB, List list, Entity entity)
    {
        if(world.getBlockMetadata(x, y, z) == 0)
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.05F, 0.1F, 0.05F, 0.95F, 0.2F, 0.95F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.2F, 0.2F, 0.2F, 0.8F, 0.3F, 0.8F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.8F, 0.7F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.2F, 0.8F, 0.2F, 0.8F, 0.9F, 0.8F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.3F, 0.9F, 0.3F, 0.7F, 1.0F, 0.7F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        
        if(world.getBlockMetadata(x, y, z) == 1)
        {
            this.setBlockBounds(0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.4F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        }
        
        if(world.getBlockMetadata(x, y, z) == 2)
        {
            this.setBlockBounds(0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.4F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        }
        
        if(world.getBlockMetadata(x, y, z) == 3)
        {
            this.setBlockBounds(0.6F, 0.0F, 0.6F, 0.4F, 0.2F, 0.4F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.3F, 0.2F, 0.3F, 0.7F, 0.3F, 0.7F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.2F, 0.3F, 0.2F, 0.8F, 0.4F, 0.8F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.55F, 0.4F, 0.2F, 0.45F, 0.7F, 0.1F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.55F, 0.4F, 0.9F, 0.45F, 0.7F, 0.8F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.2F, 0.4F, 0.55F, 0.1F, 0.7F, 0.45F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.9F, 0.4F, 0.55F, 0.8F, 0.7F, 0.45F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.55F, 0.7F, 0.3F, 0.45F, 0.8F, 0.2F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.55F, 0.7F, 0.8F, 0.45F, 0.8F, 0.7F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.3F, 0.7F, 0.55F, 0.2F, 0.8F, 0.45F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.8F, 0.7F, 0.55F, 0.7F, 0.8F, 0.45F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.7F, 0.8F, 0.7F, 0.3F, 0.9F, 0.3F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0.6F, 0.9F, 0.6F, 0.4F, 1.0F, 0.4F);
            super.addCollisionBoxesToList(world, x, y, z, axisAlignedBB, list, entity);
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        }
    }

    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        super.updateTick(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);

        if (p_149674_1_.getBlockMetadata(p_149674_2_, p_149674_3_, p_149674_4_) == 3)
        {
            this.onBlockAdded(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_);
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
        double d0 = (double)((float)p_149734_2_ + 0.8F);
        double d1 = (double)((float)p_149734_3_ + 0.4F);
        double d2 = (double)((float)p_149734_4_ + 0.5F);
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;

        if (l == 3)
        {
            p_149734_1_.spawnParticle("smoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            p_149734_1_.spawnParticle("flame", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        }
    }
}