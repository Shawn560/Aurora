package com.Shawn560.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.Shawn560.Main.MainRegistry;
import com.Shawn560.block.MBlocks;
import com.Shawn560.gui.GuiCraftingBench;
import com.Shawn560.gui.container.ContainerCraftingBench;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == MainRegistry.guiIDCraftingBench) {
			return ID == MainRegistry.guiIDCraftingBench && world.getBlock(x, y, z) == MBlocks.CraftingBench ? new ContainerCraftingBench(player.inventory, world, x, y, z) : null;
		}
		
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(ID == MainRegistry.guiIDPlayer) {
			return ID == MainRegistry.guiIDPlayer && world.getBlock(x, y, z) == MBlocks.CopperOre ? new GuiCraftingBench(player.inventory, world, x, y, z) : null;
		}
		return null;
	}

}
