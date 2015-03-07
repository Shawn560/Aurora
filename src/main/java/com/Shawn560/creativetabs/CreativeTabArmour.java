package com.Shawn560.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabArmour extends CreativeTabs {

	public CreativeTabArmour(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Items.diamond_helmet;
	}

}
