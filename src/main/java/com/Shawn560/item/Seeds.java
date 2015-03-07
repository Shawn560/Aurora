package com.Shawn560.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

import com.Shawn560.block.MBlocks;
import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.BlockTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class Seeds {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Item dSeed;
	public static Item tSeed;
	public static Item cSeed;
	public static Item zSeed;
	public static Item nSeed;
	public static Item mSeed;
	public static Item vSeed;
	public static Item rSeed;
	
	public static void initializationItem(){
		dSeed = new ItemSeeds(MBlocks.dCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.dSeed).setUnlocalizedName("dSeed");
		tSeed = new ItemSeeds(MBlocks.tCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.tSeed).setUnlocalizedName("tSeed");
		cSeed = new ItemSeeds(MBlocks.cCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.cSeed).setUnlocalizedName("cSeed");
		zSeed = new ItemSeeds(MBlocks.zCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.zSeed).setUnlocalizedName("zSeed");
		nSeed = new ItemSeeds(MBlocks.nCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.nSeed).setUnlocalizedName("nSeed");
		mSeed = new ItemSeeds(MBlocks.mCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.mSeed).setUnlocalizedName("mSeed");
		vSeed = new ItemSeeds(MBlocks.vCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.vSeed).setUnlocalizedName("vSeed");
		rSeed = new ItemSeeds(MBlocks.rCrop, Blocks.farmland).setCreativeTab(MCreativeTabs.tabItems).setTextureName(BlockTextures.rSeed).setUnlocalizedName("rSeed");
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(dSeed, dSeed.getUnlocalizedName());
		GameRegistry.registerItem(tSeed, tSeed.getUnlocalizedName());
		GameRegistry.registerItem(cSeed, cSeed.getUnlocalizedName());
		GameRegistry.registerItem(zSeed, zSeed.getUnlocalizedName());
		GameRegistry.registerItem(nSeed, nSeed.getUnlocalizedName());
		GameRegistry.registerItem(mSeed, mSeed.getUnlocalizedName());
		GameRegistry.registerItem(vSeed, vSeed.getUnlocalizedName());
		GameRegistry.registerItem(rSeed, rSeed.getUnlocalizedName());
	}
}
