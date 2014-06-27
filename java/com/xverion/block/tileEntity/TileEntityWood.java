package com.xverion.block.tileEntity;

import com.xverion.block.block;
import com.xverion.power.IBlockPowerManager;
import com.xverion.power.blockPowerStorage;
import com.xverion.power.powerManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by brian on 27-6-2014.
 */
public class TileEntityWood extends TileEntity implements IBlockPowerManager
{
    static blockPowerStorage storage = new blockPowerStorage(1500, 1200);

    public TileEntityWood()
    {

    }

    @Override
    public void addPower(double amount, World world, EntityPlayer player, int x, int y, int z) {
        if(!world.isRemote)
        {

          if(powerManager.getPower() > 0)
          {

              powerManager.drainPower(amount);
              storage.setAmountStored(amount);

              if(storage.getAmountStored() >= storage.getAmountNeeded()) {

                  System.out.println("True");
                  storage.setAmountStored(-1200);

                  world.getBlock(x, y, z).breakBlock(world, x, y, z, world.getBlock(x, y, z), 0);
                  world.setBlock(x, y, z, block.DeadFurkaWood);


            }
          }
        }
    }

    @Override
    public void drainPower(double amount, World world, EntityPlayer player) {

    }
}
