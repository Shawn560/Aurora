package com.Shawn560.item.toolhead;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class SpadeHead {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item SpadeHead;
	
	public static void initializationItem(){
		SpadeHead = new Item().setUnlocalizedName("SpadeHead").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.SpadeHead);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(SpadeHead, SpadeHead.getUnlocalizedName());
	}
}
