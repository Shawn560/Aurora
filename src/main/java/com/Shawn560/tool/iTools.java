package com.Shawn560.tool;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;
import com.Shawn560.tool.Iron.idAxe;
import com.Shawn560.tool.Iron.idHoe;
import com.Shawn560.tool.Iron.idPick;
import com.Shawn560.tool.Iron.idSpade;
import com.Shawn560.tool.Iron.idSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class iTools {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static ToolMaterial idShard = EnumHelper.addToolMaterial("Diorite Iron Shard", 3, 3000, 16.0f, 4.5f, 10);
	
	public static Item idPick;
	public static Item idAxe;
	public static Item idSpade;
	public static Item idSword;
	public static Item idHoe;
	
	public static void initializationItem(){
		idPick = new idPick(idShard).setUnlocalizedName("idPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.idPick);
		idAxe = new idAxe(idShard).setUnlocalizedName("idAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.idAxe);
		idSpade = new idSpade(idShard).setUnlocalizedName("idSpade").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.idSpade);
		idSword = new idSword(idShard).setUnlocalizedName("idSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.idSword);
		idHoe = new idHoe(idShard).setUnlocalizedName("idHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.idHoe);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(idPick, idPick.getUnlocalizedName());
		GameRegistry.registerItem(idAxe, idAxe.getUnlocalizedName());
		GameRegistry.registerItem(idSpade, idSpade.getUnlocalizedName());
		GameRegistry.registerItem(idSword, idSword.getUnlocalizedName());
		GameRegistry.registerItem(idHoe, idHoe.getUnlocalizedName());
	}
}
