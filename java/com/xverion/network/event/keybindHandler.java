package com.xverion.network.event;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by brian on 22-6-2014.
 */
public class keybindHandler
{

    public static KeyBinding channelArcana;

    public static void init()
    {

        channelArcana = new KeyBinding("channel_Arcana", Keyboard.KEY_R, "key.categories.arcana");

        ClientRegistry.registerKeyBinding(channelArcana);

        FMLCommonHandler.instance().bus().register(new keyLogic());


    }

}
