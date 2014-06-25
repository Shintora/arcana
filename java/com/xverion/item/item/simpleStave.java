package com.xverion.item.item;

import com.xverion.block.blocks.LivingFurkaWood;
import com.xverion.power.powerManager;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
        this.setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("simpleStave");
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
       itemIcon = icon.registerIcon("arcana:simpleStave");

    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int meta, float hitX, float hitY, float PartialTickTime) {
        MovingObjectPosition move = getMovingObjectPositionFromPlayer(world, player, true);

        powerManager.drainPower(powerManager.getAmountToDrain());

        if(world.getBlock(move.blockX, move.blockY, move.blockZ) instanceof LivingFurkaWood)
        {
            LivingFurkaWood.ReceivePower(powerManager.getAmountToDrain(), move.blockX, move.blockY, move.blockZ);
        }

        return true;

    }
}
