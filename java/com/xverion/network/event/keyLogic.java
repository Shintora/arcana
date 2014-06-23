package com.xverion.network.event;

import com.xverion.power.powerManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by brian on 22-6-2014.
 */
public class keyLogic
{

    World world;
    EntityPlayer player;

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if(keybindHandler.channelArcana.isPressed())
        {
            powerManager.ChannelOpen(50, world, player);

            System.out.println(powerManager.getPower());
        }
    }

}
