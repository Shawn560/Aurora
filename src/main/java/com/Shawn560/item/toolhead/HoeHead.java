package com.Shawn560.item.toolhead;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class HoeHead {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item HoeHead;
	
	public static void initializationItem(){
		HoeHead = new Item().setUnlocalizedName("HoeHead").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.HoeHead);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(HoeHead, HoeHead.getUnlocalizedName());
	}
}
