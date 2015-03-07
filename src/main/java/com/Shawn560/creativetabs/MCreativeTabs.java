package com.Shawn560.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {

	public static CreativeTabs tabBlocks;
	public static CreativeTabs tabItems;
	public static CreativeTabs tabTools;
	public static CreativeTabs tabArmours;
	public static CreativeTabs tabCrafting;
	
	public static void initialiseTabs(){
		tabBlocks = new CreativeTabBlock("BlockTab");
		tabItems = new CreativeTabItem("ItemTab");
		tabTools = new CreativeTabTool("ToolTab");
		tabArmours = new CreativeTabArmour("ArmourTab");
		tabCrafting = new CreativeTabCrafting("CraftingTab");
	}
}
