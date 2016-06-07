package com.checconio84.mod;

import com.checconio84.mod.init.BiomesMod;
import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.init.CraftsMod;
import com.checconio84.mod.init.ItemsMod;
import com.checconio84.mod.proxy.CommonProxy;
import com.checconio84.mod.world.WorldRegisterMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = References.MOD_ID, name = References.MOD_NAME, version = References.VERSION)

public class Checconio84
{
    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static CommonProxy proxy;
    
    public static CreativeTabs tabItem = new CreativeTabs("tabItem")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return ItemsMod.uraniumIngot;
        }
    };
    
    public static CreativeTabs tabBlock = new CreativeTabs("tabBlock")
    {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(BlocksMod.uraniumOre);
        }
    };
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        BlocksMod.init();
        BlocksMod.register();
        ItemsMod.init();
        ItemsMod.register();
        CraftsMod.init();
        BiomesMod.init();
        WorldRegisterMod.mainRegsitry();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRenders();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}