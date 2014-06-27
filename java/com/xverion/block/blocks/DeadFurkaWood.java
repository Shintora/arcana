package com.xverion.block.blocks;

import com.xverion.main.arcana;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by brian on 6/16/2014.
 */
public class DeadFurkaWood extends Block
{
    public DeadFurkaWood(Material material)
    {
        super(material);
        this.setBlockName("DeadFurkaWood");
        this.setHardness(4.0F);
        this.setResistance(4.0F);
        this.setCreativeTab(arcana.arcanaTab);
    }

    @Override
    public void registerBlockIcons(IIconRegister icon) {
        blockIcon = icon.registerIcon("arcana:DeadFurkaWood");
    }
}
