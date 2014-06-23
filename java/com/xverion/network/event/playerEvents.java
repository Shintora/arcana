package com.xverion.network.event;

import com.xverion.power.powerManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
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

}
