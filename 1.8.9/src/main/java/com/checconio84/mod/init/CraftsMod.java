package com.checconio84.mod.init;

import static com.checconio84.mod.init.CraftsDictionaryMod.*;
import static com.checconio84.mod.init.ItemsMod.*;
import static com.checconio84.mod.init.BlocksMod.*;
import static net.minecraft.init.Blocks.*;

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
    }
}