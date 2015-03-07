package com.Shawn560.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.Shawn560.item.Shards;

public class CreativeTabCrafting extends CreativeTabs {

	public CreativeTabCrafting(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Shards.Shard;
	}

}
