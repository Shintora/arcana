package com.xverion.power;

import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;



/**
 * Created by brian on 6/16/2014.
 */
public class powerManager
{
    protected static String namePlayer;

    protected static int playerLevelRune;

    protected double[] runes = {100, 1000, 3000, 6000, 12000, 16000, 20000, 30000, 60000};
    protected static double[] amountToDrain = {0.01, 0.1, 0.3, 0.6, 1.2, 1.6, 2, 3, 6};

    public static boolean powerChannel;

    protected static double powerAmount;

    public powerManager(String playerName )
    {
        namePlayer = playerName;
        System.out.println(namePlayer);
        powerChannel = false;
        playerLevelRune = 2;
    }


    public static void ChannelOpen(double amount)
    {
        World world = MinecraftServer.getServer().worldServerForDimension(0);

        if(!world.isRemote) {

            powerAmount += amount;

        }
    }

    public static void drainPower(double amount)
    {
        World world = MinecraftServer.getServer().worldServerForDimension(0);

        if(!world.isRemote)
        {
            powerAmount -= amount;
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

    public static double getAmountToDrain()
    {
        return amountToDrain[playerLevelRune];
    }


}
