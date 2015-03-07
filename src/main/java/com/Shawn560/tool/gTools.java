package com.Shawn560.tool;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;
import com.Shawn560.tool.Gold.gdAxe;
import com.Shawn560.tool.Gold.gdHoe;
import com.Shawn560.tool.Gold.gdPick;
import com.Shawn560.tool.Gold.gdSpade;
import com.Shawn560.tool.Gold.gdSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class gTools {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static ToolMaterial gdShard = EnumHelper.addToolMaterial("Diorite Gold Shard", 3, 4000, 16.0f, 4.5f, 10);
	
	public static Item gdPick;
	public static Item gdAxe;
	public static Item gdSpade;
	public static Item gdSword;
	public static Item gdHoe;
	
	public static void initializationItem(){
		gdPick = new gdPick(gdShard).setUnlocalizedName("gdPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.gdPick);
		gdAxe = new gdAxe(gdShard).setUnlocalizedName("gdAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.gdAxe);
		gdSpade = new gdSpade(gdShard).setUnlocalizedName("gdSpade").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.gdSpade);
		gdSword = new gdSword(gdShard).setUnlocalizedName("gdSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.gdSword);
		gdHoe = new gdHoe(gdShard).setUnlocalizedName("gdHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.gdHoe);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(gdPick, gdPick.getUnlocalizedName());
		GameRegistry.registerItem(gdAxe, gdAxe.getUnlocalizedName());
		GameRegistry.registerItem(gdSpade, gdSpade.getUnlocalizedName());
		GameRegistry.registerItem(gdSword, gdSword.getUnlocalizedName());
		GameRegistry.registerItem(gdHoe, gdHoe.getUnlocalizedName());
	}
}
