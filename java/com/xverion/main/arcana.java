package com.xverion.main;

import com.xverion.block.block;
import com.xverion.item.items;
import com.xverion.network.CommonProxy;
import com.xverion.network.event.keybindHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by brian on 6/16/2014.
 */

@Mod(modid = "arcana", name = "Arcana", version = "0.0.01")

public class arcana
{
    @Mod.Instance("arcana")
    public static arcana instance;


    @SidedProxy(clientSide = "com.xverion.client.ClientProxy", serverSide = "com.xverion.network.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void load(FMLPreInitializationEvent event)
    {
        block.init();
        items.init();
        proxy.init();
        keybindHandler.init();

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void load(FMLPostInitializationEvent event)
    {

    }

}
