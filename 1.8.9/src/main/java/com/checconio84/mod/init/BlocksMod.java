package com.checconio84.mod.init;

import com.checconio84.mod.blocks.BlockMod;
import com.checconio84.mod.blocks.BlockOreMod;
import com.checconio84.mod.blocks.BlockStairsMod;
import com.checconio84.mod.items.ItemBlockFloorLampMod;

import static com.checconio84.mod.Checconio84.*;
import static com.checconio84.mod.References.*;
import static com.checconio84.mod.blocks.BlockOreMod.*;

import com.checconio84.mod.blocks.BlockCarpetMod;
import com.checconio84.mod.blocks.BlockColoredMod;
import com.checconio84.mod.blocks.BlockFloorLampMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCloth;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlocksMod
{
    public static Block lightWool, lightCarpet;
    public static Block uraniumOre, uraniumBlock;
    public static Block obsidianStairs, brickStairs, stoneStairs, mossyCobbleStoneStairs, glassStairs;
    public static Block floorLamp;
    
    public static void init()
    {
        uraniumOre = new BlockUraniumOreMod(3).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("uraniumOre").setCreativeTab(tabBlock);
        uraniumBlock = new BlockMod(Material.iron, 3).setHardness(5.0F).setResistance(10.0F).setUnlocalizedName("uraniumBlock").setCreativeTab(tabBlock);
        obsidianStairs = new BlockStairsMod(Blocks.obsidian.getDefaultState()).setHardness(50.0F).setResistance(2000.0F).setUnlocalizedName("obsidianStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        stoneStairs = new BlockStairsMod(Blocks.stone.getDefaultState()).setHardness(1.5F).setResistance(10.0F).setUnlocalizedName("stoneStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        mossyCobbleStoneStairs = new BlockStairsMod(Blocks.mossy_cobblestone.getDefaultState()).setHardness(2.0F).setResistance(10.0F).setUnlocalizedName("mossyCobbleStoneStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        glassStairs = new BlockStairsMod(Blocks.glass.getDefaultState()).setHardness(0.3F).setUnlocalizedName("glassStairs").setCreativeTab(tabBlock).setLightOpacity(0);
        lightWool = new BlockColoredMod(Material.cloth).setHardness(0.8F).setUnlocalizedName("lightWool").setCreativeTab(tabBlock).setLightLevel(1.0F);
        lightCarpet = new BlockCarpetMod().setHardness(0.1F).setUnlocalizedName("lightCarpet").setCreativeTab(tabBlock).setLightLevel(1.0F).setLightOpacity(0);
        floorLamp = new BlockFloorLampMod(Material.iron).setHardness(4.0F).setResistance(10.0F).setUnlocalizedName("floorLamp").setCreativeTab(tabBlock).setLightLevel(1.0F);
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
    
    public static void registerRenders()
    {
        registerRender(uraniumOre);
        registerRender(uraniumBlock);
        registerRender(obsidianStairs);
        registerRender(stoneStairs);
        registerRender(mossyCobbleStoneStairs);
        registerRender(glassStairs);
        registerRenderM(lightWool, 0, "white_wool");
        registerRenderM(lightWool, 1, "orange_wool");
        registerRenderM(lightWool, 2, "magenta_wool");
        registerRenderM(lightWool, 3, "light_blue_wool");
        registerRenderM(lightWool, 4, "yellow_wool");
        registerRenderM(lightWool, 5, "lime_wool");
        registerRenderM(lightWool, 6, "pink_wool");
        registerRenderM(lightWool, 7, "gray_wool");
        registerRenderM(lightWool, 8, "silver_wool");
        registerRenderM(lightWool, 9, "cyan_wool");
        registerRenderM(lightWool, 10, "purple_wool");
        registerRenderM(lightWool, 11, "blue_wool");
        registerRenderM(lightWool, 12, "brown_wool");
        registerRenderM(lightWool, 13, "green_wool");
        registerRenderM(lightWool, 14, "red_wool");
        registerRenderM(lightWool, 15, "black_wool");
        registerRenderM(lightCarpet, 0, "white_carpet");
        registerRenderM(lightCarpet, 1, "orange_carpet");
        registerRenderM(lightCarpet, 2, "magenta_carpet");
        registerRenderM(lightCarpet, 3, "light_blue_carpet");
        registerRenderM(lightCarpet, 4, "yellow_carpet");
        registerRenderM(lightCarpet, 5, "lime_carpet");
        registerRenderM(lightCarpet, 6, "pink_carpet");
        registerRenderM(lightCarpet, 7, "gray_carpet");
        registerRenderM(lightCarpet, 8, "silver_carpet");
        registerRenderM(lightCarpet, 9, "cyan_carpet");
        registerRenderM(lightCarpet, 10, "purple_carpet");
        registerRenderM(lightCarpet, 11, "blue_carpet");
        registerRenderM(lightCarpet, 12, "brown_carpet");
        registerRenderM(lightCarpet, 13, "green_carpet");
        registerRenderM(lightCarpet, 14, "red_carpet");
        registerRenderM(lightCarpet, 15, "black_carpet");
        registerRenderC(floorLamp, 0, "floorLamp1");
        registerRenderC(floorLamp, 1, "floorLamp2");
        registerRenderC(floorLamp, 2, "floorLamp3");
        registerRenderC(floorLamp, 3, "floorLamp4");
        ModelBakery.addVariantName(Item.getItemFromBlock(floorLamp), "checconio:floorLamp1", "checconio:floorLamp2", "checconio:floorLamp3", "checconio:floorLamp4");
    }
    
    private static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    
    private static void registerRenderM(Block block, int metadata, String name)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(name, "inventory"));
    }
    
    private static void registerRenderC(Block block, int metadata, String name)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, metadata, new ModelResourceLocation(MOD_ID + ":" + name, "inventory"));
    }
}