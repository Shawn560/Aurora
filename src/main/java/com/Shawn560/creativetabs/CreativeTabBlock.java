package com.Shawn560.creativetabs;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import com.Shawn560.block.MBlocks;
import com.Shawn560.lib.RefStrings;

public class CreativeTabBlock extends CreativeTabs {
	
	public CreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MBlocks.CraftingBench);
	}

}
