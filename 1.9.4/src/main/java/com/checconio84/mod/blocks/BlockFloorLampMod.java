package com.checconio84.mod.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.items.ItemBlockFloorLampMod.IItemBlockFloorLampMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
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
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {metadata});
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
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
    }
    
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    
    public boolean isNormalCube(IBlockState state)
    {
        return false;
    }
    
    public boolean isVisuallyOpaque()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public float getAmbientOcclusionLightValue(IBlockState state)
    {
        return 1.0F;
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
            worldIn.setBlockState(new BlockPos(x, y+1, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+2, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+3, z), Blocks.AIR.getDefaultState());
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y-1, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            worldIn.setBlockState(new BlockPos(x, y-1, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+1, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+2, z), Blocks.AIR.getDefaultState());
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y-2, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            worldIn.setBlockState(new BlockPos(x, y-2, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y-1, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y+1, z), Blocks.AIR.getDefaultState());
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y-3, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            worldIn.setBlockState(new BlockPos(x, y-3, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y-2, z), Blocks.AIR.getDefaultState());
            worldIn.setBlockState(new BlockPos(x, y-1, z), Blocks.AIR.getDefaultState());
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
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

    @Deprecated
    public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn)
    {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(0))
        {
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1D, 1.0D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.05D, 0.1D, 0.05D, 0.95D, 0.2D, 0.95D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.2D, 0.2D, 0.2D, 0.8D, 0.3D, 0.8D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.3D, 0.3D, 0.3D, 0.7D, 0.8D, 0.7D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.2D, 0.8D, 0.2D, 0.8D, 0.9D, 0.8D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.3D, 0.9D, 0.3D, 0.7D, 1.0D, 0.7D));
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(1))
        {
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.6D, 0.0D, 0.6D, 0.4D, 1.0D, 0.4D));
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(2))
        {
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.6D, 0.0D, 0.6D, 0.4D, 1.0D, 0.4D));
        }
        
        if(worldIn.getBlockState(new BlockPos(x, y, z)) == BlocksMod.floorLamp.getStateFromMeta(3))
        {
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.6D, 0.0D, 0.6D, 0.4D, 0.2D, 0.4D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.3D, 0.2D, 0.3D, 0.7D, 0.3D, 0.7D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.2D, 0.3D, 0.2D, 0.8D, 0.4D, 0.8D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.55D, 0.4D, 0.2D, 0.45D, 0.7D, 0.1D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.55D, 0.4D, 0.9D, 0.45D, 0.7D, 0.8D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.2D, 0.4D, 0.55D, 0.1D, 0.7D, 0.45D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.9D, 0.4D, 0.55D, 0.8D, 0.7D, 0.45D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.55D, 0.7D, 0.3D, 0.45D, 0.8D, 0.2D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.55D, 0.7D, 0.8D, 0.45D, 0.8D, 0.7D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.3D, 0.7D, 0.55D, 0.2D, 0.8D, 0.45D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.8D, 0.7D, 0.55D, 0.7D, 0.8D, 0.45D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.7D, 0.8D, 0.7D, 0.3D, 0.9D, 0.3D));
            this.addCollisionBoxToList(pos, entityBox, collidingBoxes, new AxisAlignedBB(0.6D, 0.9D, 0.6D, 0.4D, 1.0D, 0.4D));
        }
    }
    
    public enum EnumType implements IStringSerializable
    {
        floorLamp1(0, "floorlamp1"),
        floorLamp2(1, "floorlamp2"),
        floorLamp3(2, "floorlamp3"),
        floorLamp4(3, "floorlamp4");

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
            return this.name;
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