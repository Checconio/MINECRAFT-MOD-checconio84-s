package com.checconio84.mod.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialMod
{
    public static ToolMaterial URANIUM = EnumHelper.addToolMaterial("URANIUM", 4, 1400, 18.0F, 16.0F, 1);
    public static ArmorMaterial URANIUM_ARMOR = EnumHelper.addArmorMaterial("URANIUM_ARMOR", "URANIUM_ARMOR", 20, new int[]{5, 9, 7, 5}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
}