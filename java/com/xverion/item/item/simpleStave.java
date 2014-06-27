package com.xverion.item.item;

import com.xverion.block.blocks.LivingFurkaWood;
import com.xverion.block.tileEntity.TileEntityWood;
import com.xverion.main.arcana;
import com.xverion.power.IBlockPowerManager;
import com.xverion.power.powerManager;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by brian on 6/16/2014.
 */
public class simpleStave extends Item
{
    public simpleStave()
    {
        super();
        this.setCreativeTab(arcana.arcanaTab);
        setUnlocalizedName("simpleStave");
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
       itemIcon = icon.registerIcon("arcana:simpleStave");

    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {

        MovingObjectPosition move = getMovingObjectPositionFromPlayer(world, player, true);

        if(!world.isRemote)
        {
            TileEntity tile = world.getTileEntity(move.blockX, move.blockY, move.blockZ);

            if(tile instanceof IBlockPowerManager)
            {

                ((IBlockPowerManager) tile).addPower(100, world, player, move.blockX, move.blockY, move.blockZ);

            }
        }

        return stack;

    }
}
