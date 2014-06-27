package com.xverion.block;

import com.xverion.block.blocks.DeadFurkaWood;
import com.xverion.block.blocks.LivingFurkaWood;
import com.xverion.block.tileEntity.TileEntityWood;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by brian on 6/16/2014.
 */
public class block
{

    public static Block DeadFurkaWood;
    public static Block LivingFurkaWood;

    public static void init()
    {
        DeadFurkaWood = new DeadFurkaWood(Material.wood);
        LivingFurkaWood = new LivingFurkaWood(Material.wood);


        GameRegistry.registerBlock(DeadFurkaWood, DeadFurkaWood.getLocalizedName().substring(1));
        GameRegistry.registerBlock(LivingFurkaWood, LivingFurkaWood.getLocalizedName().substring(2));

        GameRegistry.registerTileEntity(TileEntityWood.class, "furkaWood");

    }

}
