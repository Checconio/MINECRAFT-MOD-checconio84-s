package com.checconio84.mod.renders.blocks;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.checconio84.mod.proxy.ClientProxy;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RenderBlockFloorLamp implements ISimpleBlockRenderingHandler
{
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
    {
        Tessellator tessellator = Tessellator.instance;
        renderer.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.05F, 0.1F, 0.05F, 0.95F, 0.2F, 0.95F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.2F, 0.2F, 0.2F, 0.8F, 0.3F, 0.8F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.8F, 0.7F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.2F, 0.8F, 0.2F, 0.8F, 0.9F, 0.8F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.3F, 0.9F, 0.3F, 0.7F, 1.0F, 0.7F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.6F, 1.0F, 0.6F, 0.4F, 2.0F, 0.4F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.6F, 2.0F, 0.6F, 0.4F, 2.2F, 0.4F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.3F, 2.2F, 0.3F, 0.7F, 2.3F, 0.7F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.2F, 2.3F, 0.2F, 0.8F, 2.4F, 0.8F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.55F, 2.4F, 0.2F, 0.45F, 2.7F, 0.1F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.55F, 2.4F, 0.9F, 0.45F, 2.7F, 0.8F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.2F, 2.4F, 0.55F, 0.1F, 2.7F, 0.45F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.9F, 2.4F, 0.55F, 0.8F, 2.7F, 0.45F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.55F, 2.7F, 0.3F, 0.45F, 2.8F, 0.2F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.55F, 2.7F, 0.8F, 0.45F, 2.8F, 0.7F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.3F, 2.7F, 0.55F, 0.2F, 2.8F, 0.45F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.8F, 2.7F, 0.55F, 0.7F, 2.8F, 0.45F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.7F, 2.8F, 0.7F, 0.3F, 2.9F, 0.3F);
        this.renderInInventory(tessellator, renderer, block, metadata);
        renderer.setRenderBounds(0.6F, 2.9F, 0.6F, 0.4F, 3.0F, 0.4F);
        this.renderInInventory(tessellator, renderer, block, metadata);
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        if(world.getBlockMetadata(x, y, z) == 0)
        {
            renderer.setRenderBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.1F, 1.0F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.05F, 0.1F, 0.05F, 0.95F, 0.2F, 0.95F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.2F, 0.2F, 0.2F, 0.8F, 0.3F, 0.8F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.3F, 0.3F, 0.3F, 0.7F, 0.8F, 0.7F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.2F, 0.8F, 0.2F, 0.8F, 0.9F, 0.8F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.3F, 0.9F, 0.3F, 0.7F, 1.0F, 0.7F);
            renderer.renderStandardBlock(block, x, y, z);
        }
        
        if(world.getBlockMetadata(x, y, z) == 1)
        {
            renderer.setRenderBounds(0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.4F);
            renderer.renderStandardBlock(block, x, y, z);
        }
        
        if(world.getBlockMetadata(x, y, z) == 2)
        {
            renderer.setRenderBounds(0.6F, 0.0F, 0.6F, 0.4F, 1.0F, 0.4F);
            renderer.renderStandardBlock(block, x, y, z);
        }
        
        if(world.getBlockMetadata(x, y, z) == 3)
        {
            renderer.setRenderBounds(0.6F, 0.0F, 0.6F, 0.4F, 0.2F, 0.4F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.3F, 0.2F, 0.3F, 0.7F, 0.3F, 0.7F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.2F, 0.3F, 0.2F, 0.8F, 0.4F, 0.8F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.55F, 0.4F, 0.2F, 0.45F, 0.7F, 0.1F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.55F, 0.4F, 0.9F, 0.45F, 0.7F, 0.8F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.2F, 0.4F, 0.55F, 0.1F, 0.7F, 0.45F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.9F, 0.4F, 0.55F, 0.8F, 0.7F, 0.45F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.55F, 0.7F, 0.3F, 0.45F, 0.8F, 0.2F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.55F, 0.7F, 0.8F, 0.45F, 0.8F, 0.7F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.3F, 0.7F, 0.55F, 0.2F, 0.8F, 0.45F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.8F, 0.7F, 0.55F, 0.7F, 0.8F, 0.45F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.7F, 0.8F, 0.7F, 0.3F, 0.9F, 0.3F);
            renderer.renderStandardBlock(block, x, y, z);
            renderer.setRenderBounds(0.6F, 0.9F, 0.6F, 0.4F, 1.0F, 0.4F);
            renderer.renderStandardBlock(block, x, y, z);
        }
        return true;
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId)
    {
        return true;
    }

    @Override
    public int getRenderId()
    {
        return ClientProxy.renderIsbrh;
    }
    
    private void renderInInventory(Tessellator tessellator, RenderBlocks renderer, Block block, int metadata)
    {
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, -1F, 0.0F);
        renderer.renderFaceYNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(0, metadata));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 1.0F, 0.0F);
        renderer.renderFaceYPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(1, metadata));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 0.0F, -1F);
        renderer.renderFaceZNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(2, metadata));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(0.0F, 0.0F, 1.0F);
        renderer.renderFaceZPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(3, metadata));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(-1F, 0.0F, 0.0F);
        renderer.renderFaceXNeg(block, 0.0D, 0.0D, 0.0D, block.getIcon(4, metadata));
        tessellator.draw();
        tessellator.startDrawingQuads();
        tessellator.setNormal(1.0F, 0.0F, 0.0F);
        renderer.renderFaceXPos(block, 0.0D, 0.0D, 0.0D, block.getIcon(5, metadata));
        tessellator.draw();
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
    }
}