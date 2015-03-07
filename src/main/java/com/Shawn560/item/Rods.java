package com.Shawn560.item;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class Rods {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item sRod;
	public static Item iRod;
	public static Item gRod;
	public static Item dRod;
	public static Item eRod;
	public static Item bRod;
	
	public static void initializationItem(){
		sRod = new Item().setUnlocalizedName("sRod").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.sRod);
		iRod = new Item().setUnlocalizedName("iRod").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.iRod);
		gRod = new Item().setUnlocalizedName("gRod").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.gRod);
		dRod = new Item().setUnlocalizedName("dRod").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.dRod);
		eRod = new Item().setUnlocalizedName("eRod").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.eRod);
		bRod = new Item().setUnlocalizedName("bRod").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.bRod);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(sRod, sRod.getUnlocalizedName());
		GameRegistry.registerItem(iRod, iRod.getUnlocalizedName());
		GameRegistry.registerItem(gRod, gRod.getUnlocalizedName());
		GameRegistry.registerItem(dRod, dRod.getUnlocalizedName());
		GameRegistry.registerItem(eRod, eRod.getUnlocalizedName());
		GameRegistry.registerItem(bRod, bRod.getUnlocalizedName());
	}
}
