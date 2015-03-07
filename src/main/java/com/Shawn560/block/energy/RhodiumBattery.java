package com.Shawn560.block.energy;

import main.java.cofh.api.energy.IEnergyStorage;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RhodiumBattery extends Block implements IEnergyStorage{

	public RhodiumBattery(Material p_i45394_1_) {
		super(p_i45394_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int receiveEnergy(int maxReceive, boolean simulate) {
		// TODO Auto-generated method stub
		return 100000000;
	}

	@Override
	public int extractEnergy(int maxExtract, boolean simulate) {
		// TODO Auto-generated method stub
		return 100000000;
	}

	@Override
	public int getEnergyStored() {
		// TODO Auto-generated method stub
		return 100000000;
	}

	@Override
	public int getMaxEnergyStored() {
		// TODO Auto-generated method stub
		return 100000000;
	}

}
