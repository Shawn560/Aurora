package com.Shawn560.item;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class Sticks {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item sStick;
	public static Item iStick;
	public static Item gStick;
	public static Item dStick;
	public static Item eStick;
	public static Item bStick;
	
	public static void initializationItem(){
		sStick = new Item().setUnlocalizedName("sStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.sStick);
		iStick = new Item().setUnlocalizedName("iStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.iStick);
		gStick = new Item().setUnlocalizedName("gStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.gStick);
		dStick = new Item().setUnlocalizedName("dStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.dStick);
		eStick = new Item().setUnlocalizedName("eStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.eStick);
		bStick = new Item().setUnlocalizedName("bStick").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.bStick);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(sStick, sStick.getUnlocalizedName());
		GameRegistry.registerItem(iStick, iStick.getUnlocalizedName());
		GameRegistry.registerItem(gStick, gStick.getUnlocalizedName());
		GameRegistry.registerItem(dStick, dStick.getUnlocalizedName());
		GameRegistry.registerItem(eStick, eStick.getUnlocalizedName());
		GameRegistry.registerItem(bStick, bStick.getUnlocalizedName());
	}
}
