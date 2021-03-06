package mods.natura.plugins.nei;

import codechicken.nei.recipe.DefaultOverlayHandler;

import codechicken.nei.api.API;
import mods.natura.gui.WorkbenchGui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.common.FMLCommonHandler;

public class NEICompat
{

    public static void registerNEICompat ()
    {
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
        {
            API.registerGuiOverlay(WorkbenchGui.class, "crafting");
            API.registerGuiOverlayHandler(WorkbenchGui.class, new DefaultOverlayHandler(), "crafting");
        }
    }

}
