package com.Shawn560.Main;

import com.Shawn560.entity.EntityAlicheek;
import com.Shawn560.entity.EntityBackcab;
import com.Shawn560.entity.EntityBatman;
import com.Shawn560.entity.EntityBracken453;
import com.Shawn560.entity.EntityIraqiMilitant;
import com.Shawn560.entity.EntityMadjock999;
import com.Shawn560.entity.EntityNathmatt25;
import com.Shawn560.entity.EntityShawn560;
import com.Shawn560.model.Player;
import com.Shawn560.renderer.RenderAlicheek;
import com.Shawn560.renderer.RenderBackcab;
import com.Shawn560.renderer.RenderBatman;
import com.Shawn560.renderer.RenderBracken453;
import com.Shawn560.renderer.RenderIraqiMilitant;
import com.Shawn560.renderer.RenderMadjock999;
import com.Shawn560.renderer.RenderNathmatt25;
import com.Shawn560.renderer.RenderShawn560;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		
	}
	
	public static void registerRenderThings() {
		//Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityShawn560.class, new RenderShawn560(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityNathmatt25.class, new RenderNathmatt25(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBracken453.class, new RenderBracken453(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAlicheek.class, new RenderAlicheek(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBackcab.class, new RenderBackcab(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMadjock999.class, new RenderMadjock999(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityIraqiMilitant.class, new RenderIraqiMilitant(new Player(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBatman.class, new RenderBatman(new Player(), 0.3F));
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
	
}
