package com.Shawn560.crafting;

import net.minecraft.item.ItemStack;

import com.Shawn560.block.MBlocks;
import com.Shawn560.item.Ingots;
import com.Shawn560.item.Shards;
import com.Shawn560.item.Sticks;
import com.Shawn560.item.toolhead.AxeHead;
import com.Shawn560.item.toolhead.HoeHead;
import com.Shawn560.item.toolhead.PickHead;
import com.Shawn560.item.toolhead.SpadeHead;
import com.Shawn560.item.toolhead.SwordBlade;
import com.Shawn560.item.toolhead.SwordGrip;
import com.Shawn560.tool.dTools;
import com.Shawn560.tool.eTools;
import com.Shawn560.tool.gTools;
import com.Shawn560.tool.iTools;
import com.Shawn560.tool.sTools;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingManager {

	public static void mainRegistry(){
		addCraftingRecipe();
		addSmeltingRecipe();
	}
	
	public static void addCraftingRecipe(){
		
		//TOOLCRAFTING
		GameRegistry.addRecipe(new ItemStack(sTools.sdAxe, 1), new Object[]{" X "," Y "," Y ", 'X', AxeHead.AxeHead, 'Y', Sticks.sStick});
		GameRegistry.addRecipe(new ItemStack(sTools.sdPick, 1), new Object[]{" X "," Y "," Y ", 'X', PickHead.PickHead, 'Y', Sticks.sStick});
		GameRegistry.addRecipe(new ItemStack(sTools.sdSpade, 1), new Object[]{" X "," Y "," Y ", 'X', SpadeHead.SpadeHead, 'Y', Sticks.sStick});
		GameRegistry.addRecipe(new ItemStack(sTools.sdSword, 1), new Object[]{" X "," Y "," Z ", 'X', SwordBlade.SwordBlade, 'Y', Sticks.sStick, 'Z', SwordGrip.SwordGrip});
		GameRegistry.addRecipe(new ItemStack(sTools.sdHoe, 1), new Object[]{" X "," Y "," Y ", 'X', HoeHead.HoeHead, 'Y', Sticks.sStick});
		
		GameRegistry.addRecipe(new ItemStack(iTools.idAxe, 1), new Object[]{" X "," Y "," Y ", 'X', AxeHead.AxeHead, 'Y', Sticks.iStick});
		GameRegistry.addRecipe(new ItemStack(iTools.idPick, 1), new Object[]{" X "," Y "," Y ", 'X', PickHead.PickHead, 'Y', Sticks.iStick});
		GameRegistry.addRecipe(new ItemStack(iTools.idSpade, 1), new Object[]{" X "," Y "," Y ", 'X', SpadeHead.SpadeHead, 'Y', Sticks.iStick});
		GameRegistry.addRecipe(new ItemStack(iTools.idSword, 1), new Object[]{" X "," Y "," Z ", 'X', SwordBlade.SwordBlade, 'Y', Sticks.iStick, 'Z', SwordGrip.SwordGrip});
		GameRegistry.addRecipe(new ItemStack(iTools.idHoe, 1), new Object[]{" X "," Y "," Y ", 'X', HoeHead.HoeHead, 'Y', Sticks.iStick});
		
		GameRegistry.addRecipe(new ItemStack(gTools.gdAxe, 1), new Object[]{" X "," Y "," Y ", 'X', AxeHead.AxeHead, 'Y', Sticks.gStick});
		GameRegistry.addRecipe(new ItemStack(gTools.gdPick, 1), new Object[]{" X "," Y "," Y ", 'X', PickHead.PickHead, 'Y', Sticks.gStick});
		GameRegistry.addRecipe(new ItemStack(gTools.gdSpade, 1), new Object[]{" X "," Y "," Y ", 'X', SpadeHead.SpadeHead, 'Y', Sticks.gStick});
		GameRegistry.addRecipe(new ItemStack(gTools.gdSword, 1), new Object[]{" X "," Y "," Z ", 'X', SwordBlade.SwordBlade, 'Y', Sticks.gStick, 'Z', SwordGrip.SwordGrip});
		GameRegistry.addRecipe(new ItemStack(gTools.gdHoe, 1), new Object[]{" X "," Y "," Y ", 'X', HoeHead.HoeHead, 'Y', Sticks.gStick});
		
		GameRegistry.addRecipe(new ItemStack(dTools.ddAxe, 1), new Object[]{" X "," Y "," Y ", 'X', AxeHead.AxeHead, 'Y', Sticks.dStick});
		GameRegistry.addRecipe(new ItemStack(dTools.ddPick, 1), new Object[]{" X "," Y "," Y ", 'X', PickHead.PickHead, 'Y', Sticks.dStick});
		GameRegistry.addRecipe(new ItemStack(dTools.ddSpade, 1), new Object[]{" X "," Y "," Y ", 'X', SpadeHead.SpadeHead, 'Y', Sticks.dStick});
		GameRegistry.addRecipe(new ItemStack(dTools.ddSword, 1), new Object[]{" X "," Y "," Z ", 'X', SwordBlade.SwordBlade, 'Y', Sticks.dStick, 'Z', SwordGrip.SwordGrip});
		GameRegistry.addRecipe(new ItemStack(dTools.ddHoe, 1), new Object[]{" X "," Y "," Y ", 'X', HoeHead.HoeHead, 'Y', Sticks.dStick});
		
		GameRegistry.addRecipe(new ItemStack(eTools.edAxe, 1), new Object[]{" X "," Y "," Y ", 'X', AxeHead.AxeHead, 'Y', Sticks.eStick});
		GameRegistry.addRecipe(new ItemStack(eTools.edPick, 1), new Object[]{" X "," Y "," Y ", 'X', PickHead.PickHead, 'Y', Sticks.eStick});
		GameRegistry.addRecipe(new ItemStack(eTools.edSpade, 1), new Object[]{" X "," Y "," Y ", 'X', SpadeHead.SpadeHead, 'Y', Sticks.eStick});
		GameRegistry.addRecipe(new ItemStack(eTools.edSword, 1), new Object[]{" X "," Y "," Z ", 'X', SwordBlade.SwordBlade, 'Y', Sticks.eStick, 'Z', SwordGrip.SwordGrip});
		GameRegistry.addRecipe(new ItemStack(eTools.edHoe, 1), new Object[]{" X "," Y "," Y ", 'X', HoeHead.HoeHead, 'Y', Sticks.eStick});
		
		//Shapeless
		
		//TOOLHEADS
		GameRegistry.addShapedRecipe(new ItemStack(AxeHead.AxeHead, 1), new Object[]{"XX "," X ", 'X', Shards.Shard});
		GameRegistry.addShapedRecipe(new ItemStack(SpadeHead.SpadeHead, 1), new Object[]{" X ","   ", 'X', Shards.Shard});
		GameRegistry.addShapedRecipe(new ItemStack(HoeHead.HoeHead, 1), new Object[]{"XX ","   ", 'X', Shards.Shard});
		GameRegistry.addShapedRecipe(new ItemStack(PickHead.PickHead, 1), new Object[]{"XXX","   ", 'X', Shards.Shard});
		GameRegistry.addShapedRecipe(new ItemStack(SwordBlade.SwordBlade, 1), new Object[]{" X "," X ", 'X', Shards.Shard});
		GameRegistry.addShapedRecipe(new ItemStack(SwordGrip.SwordGrip, 1), new Object[]{"XXX"," X ", 'X', Shards.Shard});
	}
	
	public static void addSmeltingRecipe(){
		GameRegistry.addSmelting(MBlocks.dOre, new ItemStack(Ingots.DioriteIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.TinOre, new ItemStack(Ingots.TinIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.CopperOre, new ItemStack(Ingots.CopperIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.ZincOre, new ItemStack(Ingots.ZincIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.NickelOre, new ItemStack(Ingots.NickelIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.MaganeseOre, new ItemStack(Ingots.MaganeseIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.VanadiumOre, new ItemStack(Ingots.VanadiumIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.RhodiumOre, new ItemStack(Ingots.RhodiumIngot, 1), 1f);
		
		GameRegistry.addSmelting(MBlocks.dOreNether, new ItemStack(Ingots.DioriteIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.TinOreNether, new ItemStack(Ingots.TinIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.CopperOreNether, new ItemStack(Ingots.CopperIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.ZincOreNether, new ItemStack(Ingots.ZincIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.NickelOreNether, new ItemStack(Ingots.NickelIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.MaganeseOreNether, new ItemStack(Ingots.MaganeseIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.VanadiumOreNether, new ItemStack(Ingots.VanadiumIngot, 1), 1f);
		GameRegistry.addSmelting(MBlocks.RhodiumOreNether, new ItemStack(Ingots.RhodiumIngot, 1), 1f);
	}
}
