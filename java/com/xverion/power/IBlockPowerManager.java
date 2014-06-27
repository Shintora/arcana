package com.xverion.power;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by brian on 27-6-2014.
 */
public interface IBlockPowerManager
{

    public void addPower(double amount, World world, EntityPlayer player, int x, int y , int z);

    public void drainPower(double amount, World world, EntityPlayer player);

}
