package com.Shawn560.tool.Stone;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class sdAxe extends ItemAxe{

	public sdAxe(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack){
		return EnumHelper.addRarity("dark gray", EnumChatFormatting.DARK_GRAY, "dark gray");
	}
	
	public void addInformation(ItemStack sdAxe, EntityPlayer player, List list, boolean par4)
	{
		 list.add(EnumChatFormatting.DARK_GRAY + "Stone Rod");
	}

}
