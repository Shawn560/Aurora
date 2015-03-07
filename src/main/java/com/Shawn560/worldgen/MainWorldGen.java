package com.Shawn560.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.Shawn560.block.MBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class MainWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0 :
			//Generate our surface world
			generateSurface(world, random, chunkX*16, chunkZ*16);
			
		case -1 :
			//Generate our surface world
			generateNether(world, random, chunkX*16, chunkZ*16);
			
		case 1 :
			//Generate our surface world
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(Nealecraft.oreWhatever, world, random, i=blockXPos, j= blockZPos, maxX, maxZ, maxVeinSize, chancetospawn, minY, maxY); 
		this.addOreSpawn(MBlocks.TinOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		this.addOreSpawn(MBlocks.CopperOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		this.addOreSpawn(MBlocks.ZincOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 20, 38);
		this.addOreSpawn(MBlocks.NickelOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		this.addOreSpawn(MBlocks.MaganeseOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 15, 19);
		this.addOreSpawn(MBlocks.VanadiumOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 11, 13);
		this.addOreSpawn(MBlocks.RhodiumOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 11, 13);
		
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		this.addNetherOreSpawn(MBlocks.TinOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		this.addNetherOreSpawn(MBlocks.CopperOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		this.addNetherOreSpawn(MBlocks.ZincOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 20, 38);
		this.addOreSpawn(MBlocks.NickelOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 38, 100);
		this.addOreSpawn(MBlocks.MaganeseOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 15, 19);
		this.addOreSpawn(MBlocks.VanadiumOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 11, 13);
		this.addOreSpawn(MBlocks.RhodiumOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 11, 13);
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub
		
	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
	
	private void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenNetherMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}
