package com.Shawn560.item.toolhead;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class PickHead {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item PickHead;
	
	public static void initializationItem(){
		PickHead = new Item().setUnlocalizedName("PickHead").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.PickHead);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(PickHead, PickHead.getUnlocalizedName());
	}
}
