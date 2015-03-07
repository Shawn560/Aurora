package com.Shawn560.tool;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;
import com.Shawn560.tool.Stone.sdAxe;
import com.Shawn560.tool.Stone.sdHoe;
import com.Shawn560.tool.Stone.sdPick;
import com.Shawn560.tool.Stone.sdSpade;
import com.Shawn560.tool.Stone.sdSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class sTools {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static ToolMaterial sdShard = EnumHelper.addToolMaterial("Diorite Stone Shard", 3, 1000, 16.0f, 4.5f, 10);
	
	public static Item sdPick;
	public static Item sdAxe;
	public static Item sdSpade;
	public static Item sdSword;
	public static Item sdHoe;
	
	public static void initializationItem(){
		sdPick = new sdPick(sdShard).setUnlocalizedName("sdPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.sdPick);
		sdAxe = new sdAxe(sdShard).setUnlocalizedName("sdAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.sdAxe);
		sdSpade = new sdSpade(sdShard).setUnlocalizedName("sdSpade").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.sdSpade);
		sdSword = new sdSword(sdShard).setUnlocalizedName("sdSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.sdSword);
		sdHoe = new sdHoe(sdShard).setUnlocalizedName("sdHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.sdHoe);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(sdPick, sdPick.getUnlocalizedName());
		GameRegistry.registerItem(sdAxe, sdAxe.getUnlocalizedName());
		GameRegistry.registerItem(sdSpade, sdSpade.getUnlocalizedName());
		GameRegistry.registerItem(sdSword, sdSword.getUnlocalizedName());
		GameRegistry.registerItem(sdHoe, sdHoe.getUnlocalizedName());
	}
}
