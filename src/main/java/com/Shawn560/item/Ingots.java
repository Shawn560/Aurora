package com.Shawn560.item;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class Ingots {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item DioriteIngot;
	public static Item TinIngot;
	public static Item CopperIngot;
	public static Item ZincIngot;
	public static Item NickelIngot;
	public static Item MaganeseIngot;
	public static Item VanadiumIngot;
	public static Item RhodiumIngot;
	
	public static void initializationItem(){
		DioriteIngot = new Item().setUnlocalizedName("dIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.DioriteIngot);
		TinIngot = new Item().setUnlocalizedName("tIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.TinIngot);
		CopperIngot = new Item().setUnlocalizedName("cIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.CopperIngot);
		ZincIngot = new Item().setUnlocalizedName("zIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.ZincIngot);
		NickelIngot = new Item().setUnlocalizedName("nIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.NickelIngot);
		MaganeseIngot = new Item().setUnlocalizedName("mIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.MaganeseIngot);
		VanadiumIngot = new Item().setUnlocalizedName("vIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.VanadiumIngot);
		RhodiumIngot = new Item().setUnlocalizedName("rIngot").setCreativeTab(MCreativeTabs.tabItems).setTextureName(ItemTextures.RhodiumIngot);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(DioriteIngot, DioriteIngot.getUnlocalizedName());
		GameRegistry.registerItem(TinIngot, TinIngot.getUnlocalizedName());
		GameRegistry.registerItem(CopperIngot, CopperIngot.getUnlocalizedName());
		GameRegistry.registerItem(ZincIngot, ZincIngot.getUnlocalizedName());
		GameRegistry.registerItem(NickelIngot, NickelIngot.getUnlocalizedName());
		GameRegistry.registerItem(MaganeseIngot, MaganeseIngot.getUnlocalizedName());
		GameRegistry.registerItem(VanadiumIngot, VanadiumIngot.getUnlocalizedName());
		GameRegistry.registerItem(RhodiumIngot, RhodiumIngot.getUnlocalizedName());
	}
}
