package com.Shawn560.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.Shawn560.gui.container.ContainerCraftingBench;
import com.Shawn560.lib.RefStrings;

public class GuiPlayer extends GuiContainer{
	
private ResourceLocation texture = new ResourceLocation(RefStrings.MODID + ":" + "textures/gui/guiPlayer.png");
	
	public GuiPlayer(InventoryPlayer invPlayer, World world, int x, int y, int z) {
		super(new ContainerCraftingBench(invPlayer, world, x, y, z));
		
		this.xSize = 176;
		this.ySize = 188;
		
	}

	
	public void onGuiClosed() {
		super.onGuiClosed();
	}
	
	protected void drawGuiContainerForegroundLayer(int i, int j) {
		
		this.fontRendererObj.drawString(StatCollector.translateToLocal("  Masterminds "), 100, 9, 0xFFFFFF);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("     Bench    "), 100, 19, 0xFFFFFF);
		
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {

		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		
	}


}
