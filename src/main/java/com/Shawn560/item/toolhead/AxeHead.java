package com.Shawn560.item.toolhead;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class AxeHead {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item AxeHead;
	
	public static void initializationItem(){
		AxeHead = new Item().setUnlocalizedName("AxeHead").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.AxeHead);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(AxeHead, AxeHead.getUnlocalizedName());
	}
}
