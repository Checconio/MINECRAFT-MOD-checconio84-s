package com.checconio84.mod.init;

import static com.checconio84.mod.init.CraftsDictionaryMod.*;
import static com.checconio84.mod.init.ItemsMod.*;
import static com.checconio84.mod.init.BlocksMod.*;
import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.*;

public class CraftsMod
{
    public static void init()
    {
        addSmelting(uraniumPowder, uraniumIngot);
        craftSword(uraniumIngot, uraniumSword);
        craftPickaxe(uraniumIngot, uraniumPickaxe);
        craftAxe(uraniumIngot, uraniumAxe);
        craftSpade(uraniumIngot, uraniumSpade);
        craftHoe(uraniumIngot, uraniumHoe);
        craftHelmet(uraniumIngot, uraniumHelmet);
        craftChestplate(uraniumIngot, uraniumChestplate);
        craftLeggings(uraniumIngot, uraniumLeggings);
        craftBoots(uraniumIngot, uraniumBoots);
        craftBlockCompressed(uraniumIngot, uraniumBlock);
        craftArmorDisinfected(uraniumSword, uraniumSwordDisinfected);
        craftArmorDisinfected(uraniumPickaxe, uraniumPickaxeDisinfected);
        craftArmorDisinfected(uraniumAxe, uraniumAxeDisinfected);
        craftArmorDisinfected(uraniumSpade, uraniumSpadeDisinfected);
        craftArmorDisinfected(uraniumHoe, uraniumHoeDisinfected);
        craftArmorDisinfected(uraniumHelmet, uraniumHelmetDisinfected);
        craftArmorDisinfected(uraniumChestplate, uraniumChestplateDisinfected);
        craftArmorDisinfected(uraniumLeggings, uraniumLeggingsDisinfected);
        craftArmorDisinfected(uraniumBoots, uraniumBootsDisinfected);
        craftColoredWool(wool, lightWool);
        craftColoredWool(carpet, lightCarpet);
        craftStairs(obsidian, obsidianStairs);
        craftStairs(stone, stoneStairs);
        craftStairs(mossy_cobblestone, mossyCobbleStoneStairs);
        craftStairs(glass, glassStairs);
        craftCustom(marioStars, 1, new Object[]{" D ", "DUD", " D ", 'D', diamond, 'U', uraniumIngot});
    }
}