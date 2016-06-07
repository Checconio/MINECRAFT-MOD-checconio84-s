package com.checconio84.mod.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftsDictionaryMod
{
    //Crafting
    public static void craftSword(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"#", "#", "F", '#', itemIn, 'F', Items.stick});
    }
    
    public static void craftPickaxe(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"###", " F ", " F ", '#', itemIn, 'F', Items.stick});
    }
    
    public static void craftAxe(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"## ", "#F ", " F ", '#', itemIn, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{" ##", " F#", " F ", '#', itemIn, 'F', Items.stick});
    }
    
    public static void craftSpade(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"#", "F", "F", '#', itemIn, 'F', Items.stick});
    }
    
    public static void craftHoe(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"## ", " F ", " F ", '#', itemIn, 'F', Items.stick});
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{" ##", " F ", " F ", '#', itemIn, 'F', Items.stick});
    }
    
    public static void craftHelmet(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"###", "# #", '#', itemIn});
    }
    
    public static void craftChestplate(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"# #", "###", "###", '#', itemIn});
    }
    
    public static void craftLeggings(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"###", "# #", "# #", '#', itemIn});
    }
    
    public static void craftBoots(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"# #", "# #", '#', itemIn});
    }
    
    public static void craftBlockCompressed(Item itemIn, Block blockOut)
    {
        GameRegistry.addRecipe(new ItemStack(blockOut, 1), new Object[]{"###", "###", "###", '#', itemIn});
    }
    
    public static void craftArmorDisinfected(Item itemIn, Item itemOut)
    {
        GameRegistry.addRecipe(new ItemStack(itemOut, 1), new Object[]{"###", "#I#", "###", '#', Items.gold_ingot, 'I', itemIn});
    } 
    
    //Smelting
    public static void addSmelting(Item itemIn, Item itemOut)
    {
        GameRegistry.addSmelting(itemIn, new ItemStack(itemOut, 1), 2.5F);
    }
}