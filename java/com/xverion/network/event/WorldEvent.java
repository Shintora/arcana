package com.xverion.network.event;

import com.xverion.power.powerManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

/**
 * Created by brian on 25-6-2014.
 */
public class WorldEvent
{

    @SubscribeEvent
    public void worldTickevents(TickEvent.WorldTickEvent event)
    {

        if(!event.world.isRemote) {

            if (powerManager.powerChannel) {
                powerManager.ChannelOpen(1);

                System.out.println(powerManager.getPower());
            }

            if (!powerManager.powerChannel) {
               if(powerManager.getPower() > 0) {
                   powerManager.drainPower(2.5);

                   System.out.println(powerManager.getPower());
               }

            }
        }

    }

}
