package com.checconio84.mod.init;

import com.checconio84.mod.blocks.BlockMod;
import com.checconio84.mod.blocks.BlockOreMod;
import com.checconio84.mod.blocks.BlockStairsMod;

import static com.checconio84.mod.Checconio84.*;
import static com.checconio84.mod.References.*;
import static com.checconio84.mod.blocks.BlockOreMod.*;

import com.checconio84.mod.blocks.BlockColoredMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlocksMod
{
    public static Block uraniumOre, uraniumBlock;
    public static Block obsidianStairs, brickStairs, stoneStairs, mossyCobbleStoneStairs;
    
    public static void init()
    {
        uraniumOre = new BlockUraniumOreMod(3).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("uraniumOre").setCreativeTab(tabBlock);
        uraniumBlock = new BlockMod(Material.iron, 3).setHardness(5.0F).setResistance(10.0F).setUnlocalizedName("uraniumBlock").setCreativeTab(tabBlock);
        obsidianStairs = new BlockStairsMod(Blocks.obsidian.getDefaultState()).setHardness(50.0F).setResistance(2000.0F).setUnlocalizedName("obsidianStairs").setCreativeTab(tabBlock);
        stoneStairs = new BlockStairsMod(Blocks.stone.getDefaultState()).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("stoneStairs").setCreativeTab(tabBlock);
        mossyCobbleStoneStairs = new BlockStairsMod(Blocks.mossy_cobblestone.getDefaultState()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName("mossyCobbleStoneStairs").setCreativeTab(tabBlock);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(uraniumOre, uraniumOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(uraniumBlock, uraniumBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(obsidianStairs, obsidianStairs.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(stoneStairs, stoneStairs.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(mossyCobbleStoneStairs, mossyCobbleStoneStairs.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
        registerRender(uraniumOre);
        registerRender(uraniumBlock);
        registerRender(obsidianStairs);
        registerRender(stoneStairs);
        registerRender(mossyCobbleStoneStairs);
    }
    
    private static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}