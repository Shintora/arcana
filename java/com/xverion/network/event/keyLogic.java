package com.xverion.network.event;

import com.xverion.power.powerManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * Created by brian on 22-6-2014.
 */
public class keyLogic
{


    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if(keybindHandler.channelArcana.isPressed())
        {

            powerManager.setChannelState();

        }
    }

}
