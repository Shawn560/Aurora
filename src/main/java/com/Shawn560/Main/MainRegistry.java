package com.Shawn560.Main;

import com.Shawn560.block.MBlocks;
import com.Shawn560.crafting.CraftingManager;
import com.Shawn560.creativetabs.MCreativeTabs;
import com.Shawn560.entity.EntityAlicheek;
import com.Shawn560.entity.EntityBackcab;
import com.Shawn560.entity.EntityBatman;
import com.Shawn560.entity.EntityBracken453;
import com.Shawn560.entity.EntityIraqiMilitant;
import com.Shawn560.entity.EntityMadjock999;
import com.Shawn560.entity.EntityNathmatt25;
import com.Shawn560.entity.EntityShawn560;
import com.Shawn560.handlers.CraftingHandler;
import com.Shawn560.handlers.GuiHandler;
import com.Shawn560.handlers.entity.EntityAlicheekHandler;
import com.Shawn560.handlers.entity.EntityBackcabHandler;
import com.Shawn560.handlers.entity.EntityBatmanHandler;
import com.Shawn560.handlers.entity.EntityBracken453Handler;
import com.Shawn560.handlers.entity.EntityIraqiMilitantHandler;
import com.Shawn560.handlers.entity.EntityMadjock999Handler;
import com.Shawn560.handlers.entity.EntityNathmatt25Handler;
import com.Shawn560.handlers.entity.EntityShawn560Handler;
import com.Shawn560.item.Ingots;
import com.Shawn560.item.OtherItems;
import com.Shawn560.lib.RefStrings;
import com.Shawn560.worldgen.MainWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;

	@Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	public static final int guiIDPlayer = 0;
	public static final int guiIDCraftingBench = 1;
	
	static MainWorldGen eventWorldGen = new MainWorldGen();
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		MCreativeTabs.initialiseTabs();
		MBlocks.mainRegistry();
		ItemRegistry.registry();
		OtherItems.mainRegistry();
		ToolsRegistry.registry();
		Ingots.mainRegistry();
		CraftingManager.mainRegistry();
		ClientProxy.registerRenderThings();
		proxy.registerRenderInfo();
		
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event){

		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		EntityShawn560Handler.registerMonsters(EntityShawn560.class, "Shawn560");
		EntityNathmatt25Handler.registerMonsters(EntityNathmatt25.class, "Nathmatt25");
		EntityBracken453Handler.registerMonsters(EntityBracken453.class, "Bracken453");
		EntityAlicheekHandler.registerMonsters(EntityAlicheek.class, "Alicheek");
		EntityMadjock999Handler.registerMonsters(EntityMadjock999.class, "Madjock999");
		EntityBackcabHandler.registerMonsters(EntityBackcab.class, "Backcab");
		EntityIraqiMilitantHandler.registerMonsters(EntityIraqiMilitant.class, "IraqiMilitant");
		EntityBatmanHandler.registerMonsters(EntityBatman.class, "GoddamnBatman");
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
	
	@EventHandler
	  public void serverLoad(FMLServerStartingEvent event)
	  {
	    event.registerServerCommand(new Command());
	  }
	
}
