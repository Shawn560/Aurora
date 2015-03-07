package com.Shawn560.item;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class OtherItems {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item Shawn560Soul;
	public static Item Nathmatt25Soul;
	public static Item Bracken453Soul;
	public static Item EggShawn560;
	public static Item EggNathmatt25;
	public static Item EggBracken453;	
	
	public static void initializationItem(){
		Shawn560Soul = new Item().setUnlocalizedName("Shawn560Soul").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.Shawn560Soul);
		Nathmatt25Soul = new Item().setUnlocalizedName("Nathmatt25Soul").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.Nathmatt25Soul);
		Bracken453Soul = new Item().setUnlocalizedName("Bracken453Soul").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.Bracken453Soul);
		
		EggShawn560 = new Item().setUnlocalizedName("EggShawn560").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.EggShawn560);
		EggNathmatt25 = new Item().setUnlocalizedName("EggNathmatt25").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.EggNathmatt25);
		EggBracken453 = new Item().setUnlocalizedName("EggBracken453").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.EggBracken453);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Shawn560Soul, Shawn560Soul.getUnlocalizedName());
		GameRegistry.registerItem(Nathmatt25Soul, Nathmatt25Soul.getUnlocalizedName());
		GameRegistry.registerItem(Bracken453Soul, Bracken453Soul.getUnlocalizedName());
	}
}
