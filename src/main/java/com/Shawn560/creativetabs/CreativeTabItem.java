package com.Shawn560.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.Shawn560.item.Sticks;

public class CreativeTabItem extends CreativeTabs {

	public CreativeTabItem(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Sticks.sStick;
	}

}
