package com.Shawn560.block.crop;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.Shawn560.item.Seeds;
import com.Shawn560.item.Shards;

public class vCrop extends BlockCrops{

	@Override
	 protected Item func_149866_i(){
		 return Seeds.vSeed;
	 }

	@Override
	 protected Item func_149865_P(){
		 return Shards.vanadiumShard;
	 }
}
