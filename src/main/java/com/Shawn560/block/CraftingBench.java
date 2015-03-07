package com.Shawn560.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.Shawn560.Main.MainRegistry;
import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.lib.BlockTextures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CraftingBench extends Block{

	@SideOnly(Side.CLIENT)
	private IIcon workSurfaceTop;
	
	public CraftingBench() {
		super(Material.wood);
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		return side == 1 ? this.workSurfaceTop : this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(BlockTextures.CraftingBenchSide);
		this.workSurfaceTop = iconRegister.registerIcon(BlockTextures.CraftingBenchTop);
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (!player.isSneaking()) {
			player.openGui(MainRegistry.instance, MainRegistry.guiIDCraftingBench, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}

}
