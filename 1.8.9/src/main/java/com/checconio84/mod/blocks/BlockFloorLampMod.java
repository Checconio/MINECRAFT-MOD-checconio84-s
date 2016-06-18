package com.checconio84.mod.blocks;

import java.util.List;
import java.util.Random;

import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.items.ItemBlockFloorLampMod.IItemBlockFloorLampMod;
import com.checconio84.mod.proxy.ClientProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockFloorLampMod extends Block implements IItemBlockFloorLampMod
{
    public static final PropertyEnum metadata = PropertyEnum.create("metadata", BlockFloorLampMod.EnumType.class);
    
    public BlockFloorLampMod(Material materialIn)
    {
        super(materialIn);
        this.setDefaultState(this.blockState.getBaseState().withProperty(metadata, EnumType.floorLamp1));
    }
    
    @Override
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {metadata});
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return getDefaultState().withProperty(metadata, meta == 0 ? EnumType.floorLamp1 : (meta == 1 ? EnumType.floorLamp2 : (meta == 2 ? EnumType.floorLamp3 : (meta == 3 ? EnumType.floorLamp4 : meta))));
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        EnumType type = (EnumType) state.getValue(metadata);
        return type.getID();
    }
    
    @Override
    public int damageDropped(IBlockState state)
    {
        return getMetaFromState(state);
    }
    
    @Override
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(itemIn, 1, 0));
    }
    
    @Override
    public String getSpecialName(ItemStack stack)
    {
        return stack.getItemDamage() == 0 ? "floorLamp1" : (stack.getItemDamage() == 1 ? "floorLamp2" : (stack.getItemDamage() == 2 ? "floorLamp3" : (stack.getItemDamage() == 3 ? "floorLamp4" : "")));
    }
    
    @Override
    public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }
    
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean isFullCube()
    {
        return false;
    }
    
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        worldIn.setBlockState(new BlockPos(x, y+1, z), BlocksMod.floorLamp.getStateFromMeta(1));
        worldIn.setBlockState(new BlockPos(x, y+2, z), BlocksMod.floorLamp.getStateFromMeta(2));
        worldIn.setBlockState(new BlockPos(x, y+3, z), BlocksMod.floorLamp.getStateFromMeta(3));
        return this.getStateFromMeta(meta);
    }
    
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(worldIn.getBlockState(new BlockPos(x, y+1, z)) == BlocksMod.floorLamp.getStateFromMeta(1))
        {
            worldIn.setBlockState(new BlockPos(x, y+1, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+2, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+3, z), Blocks.air.getDefaultState());
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y-1, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            worldIn.setBlockState(new BlockPos(x, y-1, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+1, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+2, z), Blocks.air.getDefaultState());
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y-2, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            worldIn.setBlockState(new BlockPos(x, y-2, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y-1, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+1, z), Blocks.air.getDefaultState());
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y-3, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            worldIn.setBlockState(new BlockPos(x, y-3, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y-2, z), Blocks.air.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y-1, z), Blocks.air.getDefaultState());
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        double d0 = (double)pos.getX() + 0.75D;
        double d1 = (double)pos.getY() + 0.2D;
        double d2 = (double)pos.getZ() + 0.5D;
        double d3 = 0.22D;
        double d4 = 0.27D;

        if (worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(3))
        {
            worldIn.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
            worldIn.spawnParticle(EnumParticleTypes.FLAME, d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
        }
    }
    
    public void addCollisionBoxesToList(World worldIn, BlockPos pos, IBlockState state, AxisAlignedBB mask, List<AxisAlignedBB> list, Entity collidingEntity)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.05F, 0.1F, 0.05F, 0.95F, 0.2F, 0.95F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.2F, 0.2F, 0.2F, 0.8F, 0.3F, 0.8F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.8F, 0.7F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.2F, 0.8F, 0.2F, 0.8F, 0.9F, 0.8F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.3F, 0.9F, 0.3F, 0.7F, 1.0F, 0.7F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(1))
        {
            this.setBlockBounds(0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.4F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(2))
        {
            this.setBlockBounds(0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.4F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(3))
        {
            this.setBlockBounds(0.6F, 0.0F, 0.6F, 0.4F, 0.2F, 0.4F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.3F, 0.2F, 0.3F, 0.7F, 0.3F, 0.7F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.2F, 0.3F, 0.2F, 0.8F, 0.4F, 0.8F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.55F, 0.4F, 0.2F, 0.45F, 0.7F, 0.1F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.55F, 0.4F, 0.9F, 0.45F, 0.7F, 0.8F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.2F, 0.4F, 0.55F, 0.1F, 0.7F, 0.45F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.9F, 0.4F, 0.55F, 0.8F, 0.7F, 0.45F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.55F, 0.7F, 0.3F, 0.45F, 0.8F, 0.2F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.55F, 0.7F, 0.8F, 0.45F, 0.8F, 0.7F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.3F, 0.7F, 0.55F, 0.2F, 0.8F, 0.45F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.8F, 0.7F, 0.55F, 0.7F, 0.8F, 0.45F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.7F, 0.8F, 0.7F, 0.3F, 0.9F, 0.3F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0.6F, 0.9F, 0.6F, 0.4F, 1.0F, 0.4F);
            super.addCollisionBoxesToList(worldIn, new BlockPos(x, y, z), state, mask, list, collidingEntity);
            this.setBlockBounds(0F, 0F, 0F, 1F, 1F, 1F);
        }
    }
    
    public enum EnumType implements IStringSerializable
    {
        floorLamp1(0, "floorLamp1"),
        floorLamp2(1, "floorLamp2"),
        floorLamp3(2, "floorLamp3"),
        floorLamp4(3, "floorLamp4");

        private int ID;
        private String name;
        
        private EnumType(int ID, String name)
        {
            this.ID = ID;
            this.name = name;
        }
        
        @Override
        public String getName()
        {
            return name;
        }

        public int getID()
        {
            return ID;
        }
        
        @Override
        public String toString()
        {
            return getName();
        }
    }
}