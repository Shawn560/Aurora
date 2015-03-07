package com.Shawn560.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.Shawn560.tool.eTools;

public class CreativeTabTool extends CreativeTabs {

	public CreativeTabTool(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return eTools.edPick;
	}

}
