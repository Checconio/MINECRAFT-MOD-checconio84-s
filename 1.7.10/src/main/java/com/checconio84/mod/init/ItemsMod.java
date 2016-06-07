package com.checconio84.mod.init;

import static com.checconio84.mod.Checconio84.*;
import static com.checconio84.mod.References.*;
import static com.checconio84.mod.init.MaterialMod.*;
import com.checconio84.mod.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemsMod
{
    public static Item marioStars;
    public static Item uraniumIngot, uraniumPowder;
    public static Item uraniumSword, uraniumPickaxe, uraniumAxe, uraniumSpade, uraniumHoe;
    public static Item uraniumHelmet, uraniumChestplate, uraniumLeggings, uraniumBoots;
    public static Item uraniumSwordDisinfected, uraniumPickaxeDisinfected, uraniumAxeDisinfected, uraniumSpadeDisinfected, uraniumHoeDisinfected;
    public static Item uraniumHelmetDisinfected, uraniumChestplateDisinfected, uraniumLeggingsDisinfected, uraniumBootsDisinfected;
    
    public static void init()
    {
        marioStars = new ItemMod().setUnlocalizedName("marioStars").setCreativeTab(tabItem).setTextureName(MOD_ID + ":marioStars");
        uraniumIngot = new ItemMod().setUnlocalizedName("uraniumIngot").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumIngot");
        uraniumPowder = new ItemMod().setUnlocalizedName("uraniumPowder").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumPowder");      
        uraniumSword = new ItemSwordMod(URANIUM).setUnlocalizedName("uraniumSword").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumSword");
        uraniumPickaxe = new ItemPickaxeMod(URANIUM).setUnlocalizedName("uraniumPickaxe").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumPickaxe");
        uraniumAxe = new ItemAxeMod(URANIUM).setUnlocalizedName("uraniumAxe").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumAxe");
        uraniumSpade = new ItemSpadeMod(URANIUM).setUnlocalizedName("uraniumSpade").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumSpade");
        uraniumHoe = new ItemHoeMod(URANIUM).setUnlocalizedName("uraniumHoe").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumHoe");
        uraniumHelmet = new ItemArmorMod(URANIUM_ARMOR, 0).setUnlocalizedName("uraniumHelmet").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumHelmet");
        uraniumChestplate = new ItemArmorMod(URANIUM_ARMOR, 1).setUnlocalizedName("uraniumChestplate").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumChestplate");
        uraniumLeggings = new ItemArmorMod(URANIUM_ARMOR, 2).setUnlocalizedName("uraniumLeggings").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumLeggings");
        uraniumBoots = new ItemArmorMod(URANIUM_ARMOR, 3).setUnlocalizedName("uraniumBoots").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumBoots");      
        uraniumSwordDisinfected = new ItemSwordMod(URANIUM).setUnlocalizedName("uraniumSwordDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumSwordDisinfected");
        uraniumPickaxeDisinfected = new ItemPickaxeMod(URANIUM).setUnlocalizedName("uraniumPickaxeDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumPickaxeDisinfected");
        uraniumAxeDisinfected = new ItemAxeMod(URANIUM).setUnlocalizedName("uraniumAxeDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumAxeDisinfected");
        uraniumSpadeDisinfected = new ItemSpadeMod(URANIUM).setUnlocalizedName("uraniumSpadeDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumSpadeDisinfected");
        uraniumHoeDisinfected = new ItemHoeMod(URANIUM).setUnlocalizedName("uraniumHoeDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumHoeDisinfected");
        uraniumHelmetDisinfected = new ItemArmorMod(URANIUM_ARMOR, 0).setUnlocalizedName("uraniumHelmetDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumHelmetDisinfected");
        uraniumChestplateDisinfected = new ItemArmorMod(URANIUM_ARMOR, 1).setUnlocalizedName("uraniumChestplateDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumChestplateDisinfected");
        uraniumLeggingsDisinfected = new ItemArmorMod(URANIUM_ARMOR, 2).setUnlocalizedName("uraniumLeggingsDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumLeggingsDisinfected");
        uraniumBootsDisinfected = new ItemArmorMod(URANIUM_ARMOR, 3).setUnlocalizedName("uraniumBootsDisinfected").setCreativeTab(tabItem).setTextureName(MOD_ID + ":uraniumBootsDisinfected");
    }
    
    public static void register()
    {
        GameRegistry.registerItem(marioStars, marioStars.getUnlocalizedName());
        GameRegistry.registerItem(uraniumIngot, uraniumIngot.getUnlocalizedName());
        GameRegistry.registerItem(uraniumPowder, uraniumPowder.getUnlocalizedName());
        GameRegistry.registerItem(uraniumSword, uraniumSword.getUnlocalizedName());
        GameRegistry.registerItem(uraniumPickaxe, uraniumPickaxe.getUnlocalizedName());
        GameRegistry.registerItem(uraniumAxe, uraniumAxe.getUnlocalizedName());
        GameRegistry.registerItem(uraniumSpade, uraniumSpade.getUnlocalizedName());
        GameRegistry.registerItem(uraniumHoe, uraniumHoe.getUnlocalizedName());
        GameRegistry.registerItem(uraniumHelmet, uraniumHelmet.getUnlocalizedName());
        GameRegistry.registerItem(uraniumChestplate, uraniumChestplate.getUnlocalizedName());
        GameRegistry.registerItem(uraniumLeggings, uraniumLeggings.getUnlocalizedName());
        GameRegistry.registerItem(uraniumBoots, uraniumBoots.getUnlocalizedName());        
        GameRegistry.registerItem(uraniumSwordDisinfected, uraniumSwordDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumPickaxeDisinfected, uraniumPickaxeDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumAxeDisinfected, uraniumAxeDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumSpadeDisinfected, uraniumSpadeDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumHoeDisinfected, uraniumHoeDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumHelmetDisinfected, uraniumHelmetDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumChestplateDisinfected, uraniumChestplateDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumLeggingsDisinfected, uraniumLeggingsDisinfected.getUnlocalizedName());
        GameRegistry.registerItem(uraniumBootsDisinfected, uraniumBootsDisinfected.getUnlocalizedName());
    }
}