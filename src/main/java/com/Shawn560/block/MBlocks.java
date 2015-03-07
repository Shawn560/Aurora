package com.Shawn560.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.Shawn560.block.crop.cCrop;
import com.Shawn560.block.crop.dCrop;
import com.Shawn560.block.crop.mCrop;
import com.Shawn560.block.crop.nCrop;
import com.Shawn560.block.crop.rCrop;
import com.Shawn560.block.crop.tCrop;
import com.Shawn560.block.crop.vCrop;
import com.Shawn560.block.crop.zCrop;
import com.Shawn560.block.energy.RhodiumBattery;
import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.BlockTextures;

import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static Block dOre;
	public static Block TinOre;
	public static Block CopperOre;
	public static Block ZincOre;
	public static Block NickelOre;
	public static Block MaganeseOre;
	public static Block VanadiumOre;
	public static Block RhodiumOre;
	
	public static Block dOreNether;
	public static Block TinOreNether;
	public static Block CopperOreNether;
	public static Block ZincOreNether;
	public static Block NickelOreNether;
	public static Block MaganeseOreNether;
	public static Block VanadiumOreNether;
	public static Block RhodiumOreNether;
	
	public static Block CraftingBench;
	
	public static Block RhodiumBattery;
	
	public static Block Rhodium;
	
	public static Block dCrop;
	public static Block tCrop;
	public static Block cCrop;
	public static Block zCrop;
	public static Block nCrop;
	public static Block mCrop;
	public static Block vCrop;
	public static Block rCrop;
	
	public static void initializationItem(){
		//ORES
		dOre = new Ore(Material.rock).setBlockName("dOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.dOre).setHardness(5f);
		TinOre = new Ore(Material.rock).setBlockName("TinOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.TinOre).setHardness(5f);
		CopperOre = new Ore(Material.rock).setBlockName("CopperOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.CopperOre).setHardness(5f);
		ZincOre = new Ore(Material.rock).setBlockName("ZincOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.ZincOre).setHardness(5f);
		NickelOre = new Ore(Material.rock).setBlockName("NickelOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.NickelOre).setHardness(5f);
		MaganeseOre = new Ore(Material.rock).setBlockName("MaganeseOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.MaganeseOre).setHardness(5f);
		VanadiumOre = new Ore(Material.rock).setBlockName("VanadiumOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.VanadiumOre).setHardness(5f);
		RhodiumOre = new Ore(Material.rock).setBlockName("RhodiumOre").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.RhodiumOre).setHardness(5f);
		
		//NETHER ORES
		dOreNether = new Ore(Material.rock).setBlockName("dOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.dOreNether).setHardness(5f);
		TinOreNether = new Ore(Material.rock).setBlockName("TinOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.TinOreNether).setHardness(5f);
		CopperOreNether = new Ore(Material.rock).setBlockName("CopperOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.CopperOreNether).setHardness(5f);
		ZincOreNether = new Ore(Material.rock).setBlockName("ZincOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.ZincOreNether).setHardness(5f);
		NickelOreNether = new Ore(Material.rock).setBlockName("NickelOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.NickelOreNether).setHardness(5f);
		MaganeseOreNether = new Ore(Material.rock).setBlockName("MaganeseOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.MaganeseOreNether).setHardness(5f);
		VanadiumOreNether = new Ore(Material.rock).setBlockName("VanadiumOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.VanadiumOreNether).setHardness(5f);
		RhodiumOreNether = new Ore(Material.rock).setBlockName("RhodiumOreNether").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.RhodiumOreNether).setHardness(5f);
		
		//CRAFTING BENCH
		CraftingBench = new CraftingBench().setBlockName("CraftingBench").setCreativeTab(MCreativeTabs.tabBlocks).setHardness(1f);
		
		//BATTERIES
		RhodiumBattery = new RhodiumBattery(Material.iron).setBlockName("RhodiumBattery").setCreativeTab(MCreativeTabs.tabBlocks).setHardness(1f);
		
		//CROPS
		dCrop = new dCrop().setBlockName("dCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.dPlant);
		tCrop = new tCrop().setBlockName("tCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.tPlant);
		cCrop = new cCrop().setBlockName("cCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.cPlant);
		zCrop = new zCrop().setBlockName("zCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.zPlant);
		nCrop = new nCrop().setBlockName("nCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.nPlant);
		mCrop = new mCrop().setBlockName("mCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.mPlant);
		vCrop = new vCrop().setBlockName("vCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.vPlant);
		rCrop = new rCrop().setBlockName("rCrop").setCreativeTab(MCreativeTabs.tabBlocks).setBlockTextureName(BlockTextures.rPlant);
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(dOre, dOre.getUnlocalizedName());
		GameRegistry.registerBlock(TinOre, TinOre.getUnlocalizedName());
		GameRegistry.registerBlock(CopperOre, CopperOre.getUnlocalizedName());
		GameRegistry.registerBlock(ZincOre, ZincOre.getUnlocalizedName());
		GameRegistry.registerBlock(NickelOre, NickelOre.getUnlocalizedName());
		GameRegistry.registerBlock(MaganeseOre, MaganeseOre.getUnlocalizedName());
		GameRegistry.registerBlock(VanadiumOre, VanadiumOre.getUnlocalizedName());
		GameRegistry.registerBlock(RhodiumOre, RhodiumOre.getUnlocalizedName());
		
		GameRegistry.registerBlock(dOreNether, dOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(TinOreNether, TinOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(CopperOreNether, CopperOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(ZincOreNether, ZincOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(NickelOreNether, NickelOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(MaganeseOreNether, MaganeseOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(VanadiumOreNether, VanadiumOreNether.getUnlocalizedName());
		GameRegistry.registerBlock(RhodiumOreNether, RhodiumOreNether.getUnlocalizedName());
		
		GameRegistry.registerBlock(CraftingBench, CraftingBench.getUnlocalizedName());
		
		GameRegistry.registerBlock(RhodiumBattery, RhodiumBattery.getUnlocalizedName());
		
		GameRegistry.registerBlock(dCrop, dCrop.getUnlocalizedName());
		GameRegistry.registerBlock(tCrop, tCrop.getUnlocalizedName());
		GameRegistry.registerBlock(cCrop, cCrop.getUnlocalizedName());
		GameRegistry.registerBlock(zCrop, zCrop.getUnlocalizedName());
		GameRegistry.registerBlock(nCrop, nCrop.getUnlocalizedName());
		GameRegistry.registerBlock(mCrop, mCrop.getUnlocalizedName());
		GameRegistry.registerBlock(vCrop, vCrop.getUnlocalizedName());
		GameRegistry.registerBlock(rCrop, rCrop.getUnlocalizedName());
	}
}
