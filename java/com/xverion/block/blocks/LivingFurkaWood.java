package com.xverion.block.blocks;

import com.xverion.block.block;
import com.xverion.block.tileEntity.TileEntityWood;
import com.xverion.main.arcana;
import com.xverion.power.IBlockPowerManager;
import com.xverion.power.blockPowerStorage;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;


/**
 * Created by brian on 6/16/2014.
 */
public class LivingFurkaWood extends BlockContainer
{

    public LivingFurkaWood(Material material)
    {
        super(material);
        this.setBlockUnbreakable();
        this.setResistance(8.0F);
        this.setHardness(8.0F);
        this.setCreativeTab(arcana.arcanaTab);
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


    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityWood();
    }
}
