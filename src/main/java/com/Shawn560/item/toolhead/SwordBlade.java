package com.Shawn560.item.toolhead;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class SwordBlade {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item SwordBlade;
	
	public static void initializationItem(){
		SwordBlade = new Item().setUnlocalizedName("SwordBlade").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.SwordBlade);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(SwordBlade, SwordBlade.getUnlocalizedName());
	}
}
