package com.checconio84.mod.init;

import static com.checconio84.mod.Checconio84.*;
import static com.checconio84.mod.References.*;

import com.checconio84.mod.blocks.BlockCarpetMod;
import com.checconio84.mod.blocks.BlockColoredMod;
import com.checconio84.mod.blocks.BlockFloorLampMod;
import com.checconio84.mod.blocks.BlockMod;
import com.checconio84.mod.blocks.BlockOreMod.BlockUraniumOreMod;
import com.checconio84.mod.blocks.BlockStairsMod;
import com.checconio84.mod.items.ItemBlockFloorLampMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemCloth;

public class BlocksMod
{
    public static Block lightWool, lightCarpet;
    public static Block uraniumOre, uraniumBlock;
    public static Block obsidianStairs, stoneStairs, mossyCobbleStoneStairs, glassStairs;
    public static Block floorLamp;
    
    public static void init()
    {
        uraniumOre = new BlockUraniumOreMod(3).setHardness(3.0F).setResistance(5.0F).setBlockName("uraniumOre").setCreativeTab(tabBlock).setBlockTextureName(MOD_ID + ":uraniumOre");
        uraniumBlock = new BlockMod(Material.iron, 3).setHardness(5.0F).setResistance(10.0F).setBlockName("uraniumBlock").setCreativeTab(tabBlock).setBlockTextureName(MOD_ID + ":uraniumBlock");
        obsidianStairs = new BlockStairsMod(Blocks.obsidian, 0).setHardness(50.0F).setResistance(2000.0F).setBlockName("obsidianStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        stoneStairs = new BlockStairsMod(Blocks.stone, 0).setHardness(1.5F).setResistance(10.0F).setBlockName("stoneStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        mossyCobbleStoneStairs = new BlockStairsMod(Blocks.mossy_cobblestone, 0).setHardness(2.0F).setResistance(10.0F).setBlockName("mossyCobbleStoneStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        glassStairs = new BlockStairsMod(Blocks.glass, 0).setHardness(0.3F).setBlockName("glassStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        lightWool = new BlockColoredMod(Material.cloth).setHardness(0.8F).setBlockName("lightWool").setCreativeTab(tabBlock).setBlockTextureName("wool_colored").setLightLevel(1.0F);
        lightCarpet = new BlockCarpetMod().setHardness(0.1F).setBlockName("lightCarpet").setCreativeTab(tabBlock).setBlockTextureName("wool_colored").setLightLevel(1.0F);
        floorLamp = new BlockFloorLampMod(Material.iron).setHardness(4.0F).setResistance(10.0F).setBlockName("floorLamp").setCreativeTab(tabBlock).setBlockTextureName(MOD_ID + ":floorLamp").setLightLevel(1.0F);
    }
    
    public static void register()
    {
        GameRegistry.registerBlock(uraniumOre, uraniumOre.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(uraniumBlock, uraniumBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(obsidianStairs, obsidianStairs.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(stoneStairs, stoneStairs.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(mossyCobbleStoneStairs, mossyCobbleStoneStairs.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(glassStairs, glassStairs.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lightWool, ItemCloth.class, lightWool.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(lightCarpet, ItemCloth.class, lightCarpet.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(floorLamp, ItemBlockFloorLampMod.class, floorLamp.getUnlocalizedName().substring(5));
    }
}