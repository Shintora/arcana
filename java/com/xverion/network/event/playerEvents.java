package com.xverion.network.event;

import com.xverion.power.powerManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

/**
 * Created by brian on 21-6-2014.
 */
public class playerEvents
{

    @SubscribeEvent
    public void onPlayerJoin(EntityJoinWorldEvent event)
    {

      if(event.world.isRemote) {
          if (event.entity instanceof EntityPlayer) {

              new powerManager(((EntityPlayer) event.entity).getDisplayName());
          }
      }
    }

    @SubscribeEvent
    public void playerTickPower(TickEvent.PlayerTickEvent event)
    {

      if(!event.player.worldObj.isRemote) {

          System.out.println(powerManager.getPower());

          if (powerManager.powerChannel) {
              powerManager.ChannelOpen(100);

              System.out.println(powerManager.getPower());
          }

          if (!powerManager.powerChannel && powerManager.getPower() > 0) {
              powerManager.drainPower(500);

              System.out.println(powerManager.getPower());
          }
      }

    }

}
