package com.Shawn560.tool.Emerald;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class edHoe extends ItemHoe{

	public edHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumHelper.addRarity("green", EnumChatFormatting.GREEN, "green");
	}
	
	public void addInformation(ItemStack sdAxe, EntityPlayer player, List list, boolean par4)
	{
		 list.add(EnumChatFormatting.GREEN + "Emerald Rod");
	}
}
