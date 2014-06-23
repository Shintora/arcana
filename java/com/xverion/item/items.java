package com.xverion.item;

import com.xverion.item.item.simpleStave;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by brian on 6/16/2014.
 */
public class items
{

    public static Item simpleStave;

    public static void init()
    {

        simpleStave = new simpleStave();

        GameRegistry.registerItem(simpleStave, simpleStave.getUnlocalizedName().substring(4));

        GameRegistry.addRecipe(new ItemStack(items.simpleStave), " XS", " SX", "S  ", 'X', Blocks.planks, 'S', Items.stick);

    }


}
