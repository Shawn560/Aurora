package com.Shawn560.tool;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;
import com.Shawn560.tool.Emerald.edAxe;
import com.Shawn560.tool.Emerald.edHoe;
import com.Shawn560.tool.Emerald.edPick;
import com.Shawn560.tool.Emerald.edSpade;
import com.Shawn560.tool.Emerald.edSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class eTools {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static ToolMaterial edShard = EnumHelper.addToolMaterial("Diorite Emerald Shard", 3, 6000, 16.0f, 4.5f, 10);
	
	public static Item edPick;
	public static Item edAxe;
	public static Item edSpade;
	public static Item edSword;
	public static Item edHoe;
	
	public static void initializationItem(){
		edPick = new edPick(edShard).setUnlocalizedName("edPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.edPick);
		edAxe = new edAxe(edShard).setUnlocalizedName("edAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.edAxe);
		edSpade = new edSpade(edShard).setUnlocalizedName("edSpade").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.edSpade);
		edSword = new edSword(edShard).setUnlocalizedName("edSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.edSword);
		edHoe = new edHoe(edShard).setUnlocalizedName("edHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.edHoe);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(edPick, edPick.getUnlocalizedName());
		GameRegistry.registerItem(edAxe, edAxe.getUnlocalizedName());
		GameRegistry.registerItem(edSpade, edSpade.getUnlocalizedName());
		GameRegistry.registerItem(edSword, edSword.getUnlocalizedName());
		GameRegistry.registerItem(edHoe, edHoe.getUnlocalizedName());
	}
}
