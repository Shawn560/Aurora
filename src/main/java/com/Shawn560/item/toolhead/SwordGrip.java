package com.Shawn560.item.toolhead;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class SwordGrip {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item SwordGrip;
	
	public static void initializationItem(){
		SwordGrip = new Item().setUnlocalizedName("SwordGrip").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.SwordGrip);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(SwordGrip, SwordGrip.getUnlocalizedName());
	}
}
