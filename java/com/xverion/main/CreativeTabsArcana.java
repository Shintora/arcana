package com.xverion.main;

import com.xverion.item.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by brian on 27-6-2014.
 */
public class CreativeTabsArcana extends CreativeTabs
{

    public CreativeTabsArcana(String id)
    {
        super(id);
    }

    @Override
    public Item getTabIconItem() {
        return items.simpleStave;
    }
}
