package com.xverion.item.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by brian on 6/16/2014.
 */
public class simpleStave extends Item
{
    public simpleStave()
    {
        super();
        this.setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("simpleStave");
    }

    @Override
    public void registerIcons(IIconRegister icon)
    {
       itemIcon = icon.registerIcon("arcana:simpleStave");

    }



}
