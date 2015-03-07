package com.Shawn560.item;

import net.minecraft.item.Item;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class Shards {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item Shard;
	public static Item copperShard;
	public static Item diamondShard;
	public static Item emeraldShard;
	public static Item goldShard;
	public static Item ironShard;
	public static Item maganeseShard;
	public static Item nickelShard;
	public static Item rhodiumShard;
	public static Item stoneShard;
	public static Item tinShard;
	public static Item vanadiumShard;
	public static Item zincShard;
	public static Item boneShard;
	
	public static void initializationItem(){
		Shard = new Item().setUnlocalizedName("Shard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.Shard);
		copperShard = new Item().setUnlocalizedName("cShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.cShard);
		diamondShard = new Item().setUnlocalizedName("dShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.dShard);
		emeraldShard = new Item().setUnlocalizedName("eShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.eShard);
		goldShard = new Item().setUnlocalizedName("gShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.iShard);
		ironShard = new Item().setUnlocalizedName("iShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.mShard);
		maganeseShard = new Item().setUnlocalizedName("mShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.nShard);
		nickelShard = new Item().setUnlocalizedName("nShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.rShard);
		rhodiumShard = new Item().setUnlocalizedName("rShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.sShard);
		stoneShard = new Item().setUnlocalizedName("sShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.cShard);
		tinShard = new Item().setUnlocalizedName("tShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.tShard);
		vanadiumShard = new Item().setUnlocalizedName("vShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.vShard);
		zincShard = new Item().setUnlocalizedName("zShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.zShard);
		boneShard = new Item().setUnlocalizedName("bShard").setCreativeTab(MCreativeTabs.tabCrafting).setTextureName(ItemTextures.bShard);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(Shard, Shard.getUnlocalizedName());
		GameRegistry.registerItem(copperShard, copperShard.getUnlocalizedName());
		GameRegistry.registerItem(diamondShard, diamondShard.getUnlocalizedName());
		GameRegistry.registerItem(emeraldShard, emeraldShard.getUnlocalizedName());
		GameRegistry.registerItem(goldShard, goldShard.getUnlocalizedName());
		GameRegistry.registerItem(ironShard, ironShard.getUnlocalizedName());
		GameRegistry.registerItem(maganeseShard, maganeseShard.getUnlocalizedName());
		GameRegistry.registerItem(nickelShard, nickelShard.getUnlocalizedName());
		GameRegistry.registerItem(rhodiumShard, rhodiumShard.getUnlocalizedName());
		GameRegistry.registerItem(stoneShard, stoneShard.getUnlocalizedName());
		GameRegistry.registerItem(tinShard, tinShard.getUnlocalizedName());
		GameRegistry.registerItem(vanadiumShard, vanadiumShard.getUnlocalizedName());
		GameRegistry.registerItem(zincShard, zincShard.getUnlocalizedName());
		GameRegistry.registerItem(boneShard, boneShard.getUnlocalizedName());
	}
}
