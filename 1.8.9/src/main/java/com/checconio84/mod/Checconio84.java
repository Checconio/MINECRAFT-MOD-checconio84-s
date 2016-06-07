package com.checconio84.mod;

import com.checconio84.mod.init.BiomesMod;
import com.checconio84.mod.init.BlocksMod;
import com.checconio84.mod.init.CraftsMod;
import com.checconio84.mod.init.ItemsMod;
import com.checconio84.mod.proxy.CommonProxy;
import com.checconio84.mod.world.WorldRegisterMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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