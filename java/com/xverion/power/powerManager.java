package com.xverion.power;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by brian on 6/16/2014.
 */
public class powerManager
{
    protected static String namePlayer;

    protected double[] runes = {1000, 3000, 6000, 12000, 16000, 20000, 30000, 60000};

    protected static boolean powerChannel;

    protected static double powerAmount;

    public powerManager(String playerName )
    {
        namePlayer = playerName;
        System.out.println(namePlayer);
    }

    public static void addpowertest()
    {
      for(int x = 0; x <= 5; x++) {
          powerAmount += 50;
      }
    }

    public static void ChannelOpen(int amount, World world, EntityPlayer player)
    {
      if(world.isRemote) {
          if (namePlayer == player.getDisplayName()) {
              Random random = new Random();

              powerChannel = true;

              powerAmount += (amount * random.nextDouble());
          }
      }
    }

    public static void onChannelClosed(EntityPlayer player)
    {
        if(namePlayer == player.getDisplayName())
        {
            powerChannel = false;
        }
    }

    public static void drainPower(int amount, Random r, World world, EntityPlayer player)
    {
        if(world.isRemote && !powerChannel)
        {
            if(namePlayer == player.getDisplayName())
            {
                powerAmount -= (amount * r.nextDouble());
            }
        }
    }

    public static double getPower()
    {
        return powerAmount;
    }
}
