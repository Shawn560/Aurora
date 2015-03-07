package com.Shawn560.handlers.entity;

import java.util.Random;

import com.Shawn560.Main.MainRegistry;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityIraqiMilitantHandler {

	public static void registerMonsters(Class entityClass, String name) {
		int entityId = EntityRegistry.findGlobalUniqueEntityId();
		long x = name.hashCode();
		Random random = new Random(x);
		int subColor = 0x404041;
		int mainColor = 0xf000ff;
		
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
		EntityRegistry.addSpawn(entityClass, 10, 1, 2, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.forest);
		EntityRegistry.registerModEntity(entityClass, name, entityId, MainRegistry.instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, subColor, mainColor));
		
	}
}
