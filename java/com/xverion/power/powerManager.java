package com.xverion.power;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

import java.util.Random;



/**
 * Created by brian on 6/16/2014.
 */
public class powerManager
{
    protected static String namePlayer;

    protected double[] runes = {1000, 3000, 6000, 12000, 16000, 20000, 30000, 60000};

    public static boolean powerChannel;

    protected static double powerAmount;

    public powerManager(String playerName )
    {
        namePlayer = playerName;
        System.out.println(namePlayer);
        powerChannel = false;
    }

    public static void addpowertest()
    {
      for(int x = 0; x <= 5; x++) {
          powerAmount += 50;
      }
    }

    public static void ChannelOpen(int amount)
    {
        World world = MinecraftServer.getServer().worldServerForDimension(0);

        if(!world.isRemote) {

            Random random = new Random();

            powerAmount += (amount * random.nextInt());

        }
    }


    public static void drainPower(int amount)
    {
        World world = MinecraftServer.getServer().worldServerForDimension(0);

        Random r = new Random();

        if(world.isRemote)
        {
            powerAmount -= (amount * r.nextInt());
        }
    }

    public static double getPower()
    {
        return powerAmount;
    }

    public static void setChannelState()
    {
        if(powerChannel)
        {
            powerChannel = false;
        }

        else
        {
            powerChannel  = true;
        }
    }


}
