package com.Shawn560.tool;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.ItemTextures;
import com.Shawn560.tool.Bone.bdAxe;
import com.Shawn560.tool.Bone.bdHoe;
import com.Shawn560.tool.Bone.bdPick;
import com.Shawn560.tool.Bone.bdSpade;
import com.Shawn560.tool.Bone.bdSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class bTools {

	public static void mainRegistry(){
		initializationItem();
		registerItem();
	}
	
	public static ToolMaterial bdShard = EnumHelper.addToolMaterial("Diorite Bone Shard", 3, 2000, 16.0f, 4.5f, 10);
	
	public static Item bdPick;
	public static Item bdAxe;
	public static Item bdSpade;
	public static Item bdSword;
	public static Item bdHoe;
	
	public static void initializationItem(){
		bdPick = new bdPick(bdShard).setUnlocalizedName("bdPick").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.bdPick);
		bdAxe = new bdAxe(bdShard).setUnlocalizedName("bdAxe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.bdAxe);
		bdSpade = new bdSpade(bdShard).setUnlocalizedName("bdSpade").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.bdSpade);
		bdSword = new bdSword(bdShard).setUnlocalizedName("bdSword").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.bdSword);
		bdHoe = new bdHoe(bdShard).setUnlocalizedName("bdHoe").setCreativeTab(MCreativeTabs.tabTools).setTextureName(ItemTextures.bdHoe);
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(bdPick, bdPick.getUnlocalizedName());
		GameRegistry.registerItem(bdAxe, bdAxe.getUnlocalizedName());
		GameRegistry.registerItem(bdSpade, bdSpade.getUnlocalizedName());
		GameRegistry.registerItem(bdSword, bdSword.getUnlocalizedName());
		GameRegistry.registerItem(bdHoe, bdHoe.getUnlocalizedName());
	}
}
