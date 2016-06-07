package com.checconio84.mod.init;

import static com.checconio84.mod.Checconio84.*;
import static com.checconio84.mod.References.*;
import static com.checconio84.mod.init.MaterialMod.*;
import static com.checconio84.mod.init.MaterialMod.*;

import com.checconio84.mod.items.ItemArmorMod;
import com.checconio84.mod.items.ItemAxeMod;
import com.checconio84.mod.items.ItemHoeMod;
import com.checconio84.mod.items.ItemMod;
import com.checconio84.mod.items.ItemPickaxeMod;
import com.checconio84.mod.items.ItemSpadeMod;
import com.checconio84.mod.items.ItemSwordMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemsMod
{    
    public static Item uraniumIngot, uraniumPowder;
    public static Item uraniumSword, uraniumPickaxe, uraniumAxe, uraniumSpade, uraniumHoe;
    public static Item uraniumHelmet, uraniumChestplate, uraniumLeggings, uraniumBoots;
    public static Item uraniumSwordDisinfected, uraniumPickaxeDisinfected, uraniumAxeDisinfected, uraniumSpadeDisinfected, uraniumHoeDisinfected;
    public static Item uraniumHelmetDisinfected, uraniumChestplateDisinfected, uraniumLeggingsDisinfected, uraniumBootsDisinfected;
    
    public static void init()
    {
        uraniumIngot = new ItemMod().setUnlocalizedName("uraniumIngot").setCreativeTab(tabItem);
        uraniumPowder = new ItemMod().setUnlocalizedName("uraniumPowder").setCreativeTab(tabItem);      
        uraniumSword = new ItemSwordMod(URANIUM).setUnlocalizedName("uraniumSword").setCreativeTab(tabItem);
        uraniumPickaxe = new ItemPickaxeMod(URANIUM).setUnlocalizedName("uraniumPickaxe").setCreativeTab(tabItem);
        uraniumAxe = new ItemAxeMod(URANIUM).setUnlocalizedName("uraniumAxe").setCreativeTab(tabItem);
        uraniumSpade = new ItemSpadeMod(URANIUM).setUnlocalizedName("uraniumSpade").setCreativeTab(tabItem);
        uraniumHoe = new ItemHoeMod(URANIUM).setUnlocalizedName("uraniumHoe").setCreativeTab(tabItem);
        uraniumHelmet = new ItemArmorMod(URANIUM_ARMOR, 0).setUnlocalizedName("uraniumHelmet").setCreativeTab(tabItem);
        uraniumChestplate = new ItemArmorMod(URANIUM_ARMOR, 1).setUnlocalizedName("uraniumChestplate").setCreativeTab(tabItem);
        uraniumLeggings = new ItemArmorMod(URANIUM_ARMOR, 2).setUnlocalizedName("uraniumLeggings").setCreativeTab(tabItem);
        uraniumBoots = new ItemArmorMod(URANIUM_ARMOR, 3).setUnlocalizedName("uraniumBoots").setCreativeTab(tabItem);      
        uraniumSwordDisinfected = new ItemSwordMod(URANIUM).setUnlocalizedName("uraniumSwordDisinfected").setCreativeTab(tabItem);
        uraniumPickaxeDisinfected = new ItemPickaxeMod(URANIUM).setUnlocalizedName("uraniumPickaxeDisinfected").setCreativeTab(tabItem);
        uraniumAxeDisinfected = new ItemAxeMod(URANIUM).setUnlocalizedName("uraniumAxeDisinfected").setCreativeTab(tabItem);
        uraniumSpadeDisinfected = new ItemSpadeMod(URANIUM).setUnlocalizedName("uraniumSpadeDisinfected").setCreativeTab(tabItem);
        uraniumHoeDisinfected = new ItemHoeMod(URANIUM).setUnlocalizedName("uraniumHoeDisinfected").setCreativeTab(tabItem);
        uraniumHelmetDisinfected = new ItemArmorMod(URANIUM_ARMOR, 0).setUnlocalizedName("uraniumHelmetDisinfected").setCreativeTab(tabItem);
        uraniumChestplateDisinfected = new ItemArmorMod(URANIUM_ARMOR, 1).setUnlocalizedName("uraniumChestplateDisinfected").setCreativeTab(tabItem);
        uraniumLeggingsDisinfected = new ItemArmorMod(URANIUM_ARMOR, 2).setUnlocalizedName("uraniumLeggingsDisinfected").setCreativeTab(tabItem);
        uraniumBootsDisinfected = new ItemArmorMod(URANIUM_ARMOR, 3).setUnlocalizedName("uraniumBootsDisinfected").setCreativeTab(tabItem);
    }
    
    public static void register()
    {
        GameRegistry.registerItem(uraniumIngot, uraniumIngot.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumPowder, uraniumPowder.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumSword, uraniumSword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumPickaxe, uraniumPickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumAxe, uraniumAxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumSpade, uraniumSpade.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumHoe, uraniumHoe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumHelmet, uraniumHelmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumChestplate, uraniumChestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumLeggings, uraniumLeggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumBoots, uraniumBoots.getUnlocalizedName().substring(5));        
        GameRegistry.registerItem(uraniumSwordDisinfected, uraniumSwordDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumPickaxeDisinfected, uraniumPickaxeDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumAxeDisinfected, uraniumAxeDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumSpadeDisinfected, uraniumSpadeDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumHoeDisinfected, uraniumHoeDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumHelmetDisinfected, uraniumHelmetDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumChestplateDisinfected, uraniumChestplateDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumLeggingsDisinfected, uraniumLeggingsDisinfected.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(uraniumBootsDisinfected, uraniumBootsDisinfected.getUnlocalizedName().substring(5));
    }
    
    public static void registerRenders()
    {
        registerRender(uraniumIngot);
        registerRender(uraniumPowder);
        registerRender(uraniumSword);
        registerRender(uraniumPickaxe);
        registerRender(uraniumAxe);
        registerRender(uraniumSpade);
        registerRender(uraniumHoe);
        registerRender(uraniumHelmet);
        registerRender(uraniumChestplate);
        registerRender(uraniumLeggings);
        registerRender(uraniumBoots);
        registerRender(uraniumSwordDisinfected);
        registerRender(uraniumPickaxeDisinfected);
        registerRender(uraniumAxeDisinfected);
        registerRender(uraniumSpadeDisinfected);
        registerRender(uraniumHoeDisinfected);
        registerRender(uraniumHelmetDisinfected);
        registerRender(uraniumChestplateDisinfected);
        registerRender(uraniumLeggingsDisinfected);
        registerRender(uraniumBootsDisinfected);
    }
    
    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}