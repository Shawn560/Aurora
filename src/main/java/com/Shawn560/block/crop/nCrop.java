package com.Shawn560.block.crop;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.Shawn560.item.Seeds;
import com.Shawn560.item.Shards;

public class nCrop extends BlockCrops{

	@Override
	 protected Item func_149866_i(){
		 return Seeds.nSeed;
	 }

	@Override
	 protected Item func_149865_P(){
		 return Shards.nickelShard;
	 }
}
