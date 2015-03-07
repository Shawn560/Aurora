package com.Shawn560.tool;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;
import com.Shawn560.tool.Diamond.ddAxe;
import com.Shawn560.tool.Diamond.ddHoe;
import com.Shawn560.tool.Diamond.ddPick;
import com.Shawn560.tool.Diamond.ddSpade;
import com.Shawn560.tool.Diamond.ddSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class dTools {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static ToolMaterial ddShard = EnumHelper.addToolMaterial("Diorite Diamond Shard", 3, 5000, 16.0f, 4.5f, 10);
	
	public static Item ddPick;
	public static Item ddAxe;
	public static Item ddSpade;
	public static Item ddSword;
	public static Item ddHoe;
	
	public static void initializationItem(){
		ddPick = new ddPick(ddShard).setUnlocalizedName("ddPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.ddPick);
		ddAxe = new ddAxe(ddShard).setUnlocalizedName("ddAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.ddAxe);
		ddSpade = new ddSpade(ddShard).setUnlocalizedName("ddSpade").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.ddSpade);
		ddSword = new ddSword(ddShard).setUnlocalizedName("ddSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.ddSword);
		ddHoe = new ddHoe(ddShard).setUnlocalizedName("ddHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.ddHoe);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(ddPick, ddPick.getUnlocalizedName());
		GameRegistry.registerItem(ddAxe, ddAxe.getUnlocalizedName());
		GameRegistry.registerItem(ddSpade, ddSpade.getUnlocalizedName());
		GameRegistry.registerItem(ddSword, ddSword.getUnlocalizedName());
		GameRegistry.registerItem(ddHoe, ddHoe.getUnlocalizedName());
	}
}
