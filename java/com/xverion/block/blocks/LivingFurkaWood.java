package com.xverion.block.blocks;

import com.xverion.block.block;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;


/**
 * Created by brian on 6/16/2014.
 */
public class LivingFurkaWood extends Block
{



    public LivingFurkaWood(Material material)
    {
        super(material);
        this.setBlockUnbreakable();
        this.setResistance(8.0F);
        this.setHardness(8.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName("LivingFurkaWood");
    }

    @Override
    public Item getItemDropped(int quantity, Random random, int meta) {
        return Item.getItemFromBlock(block.DeadFurkaWood);
    }

    @Override
    public void registerBlockIcons(IIconRegister icon)
    {
        blockIcon = icon.registerIcon("arcana:LivingFurkaWood");
    }


}
