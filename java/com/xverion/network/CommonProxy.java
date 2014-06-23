package com.xverion.network;

import com.xverion.network.event.playerEvents;
import net.minecraftforge.common.MinecraftForge;

/**
 * Created by brian on 6/16/2014.
 */
public class CommonProxy
{
    public void init()
    {

        MinecraftForge.EVENT_BUS.register(new playerEvents());

    }
}
