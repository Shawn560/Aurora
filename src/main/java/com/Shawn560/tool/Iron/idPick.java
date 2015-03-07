package com.Shawn560.tool.Iron;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class idPick extends ItemPickaxe{

	public idPick(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		// TODO Auto-generated constructor stub
	}
	
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumHelper.addRarity("light gray", EnumChatFormatting.GRAY, "light gray");
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GRAY+ "Iron Rod");
	}

}
