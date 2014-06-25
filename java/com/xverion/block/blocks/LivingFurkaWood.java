package com.xverion.block.blocks;

import com.xverion.block.block;
import com.xverion.power.blockPowerStorage;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;


/**
 * Created by brian on 6/16/2014.
 */
public class LivingFurkaWood extends Block
{

    World world = this.world;

    static blockPowerStorage storage = new blockPowerStorage(1500, 1200);

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


    public static void ReceivePower(double amount, int x, int y, int z){
        storage.addpowerToStorage(amount);
         if(storage.CheckAmountForImbue())
         {
            System.out.println("reached");
         }
    }
}
