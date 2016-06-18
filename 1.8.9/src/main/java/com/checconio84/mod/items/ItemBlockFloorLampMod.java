package com.checconio84.mod.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockFloorLampMod extends ItemBlock
{
    public ItemBlockFloorLampMod(Block block)
    {
        super(block);
        if (!(block instanceof IItemBlockFloorLampMod))
        {
            throw new IllegalArgumentException(String.format("The given Block %s is not an instance of ISpecialBlockName!", block.getUnlocalizedName()));
        }
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName(stack) + "." + ((IItemBlockFloorLampMod)this.block).getSpecialName(stack);
    }
    
    public interface IItemBlockFloorLampMod
    {

        String getSpecialName(ItemStack stack);
    }
}