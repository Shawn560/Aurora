package com.Shawn560.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import com.Shawn560.entity.EntityIraqiMilitant;
import com.Shawn560.entity.EntityShawn560;
import com.Shawn560.lib.RefStrings;
import com.Shawn560.model.Player;

public class RenderIraqiMilitant extends RenderLiving {
	
	private static final ResourceLocation texture = new ResourceLocation(RefStrings.MODID + ":" + "textures/model/IraqiMilitant.png");
	
	protected Player modelEntity;

	public RenderIraqiMilitant(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		modelEntity = ((Player) mainModel);
	}

	public void renderCyclops(EntityIraqiMilitant entity, double x, double y, double z, float u, float v) {
		super.doRender(entity, x, y, z, u, v);
	}
	
	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
		renderCyclops((EntityIraqiMilitant)entityLiving, x, y, z, u, v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v) {
		renderCyclops((EntityIraqiMilitant)entity, x, y, z, u, v);
	}
	
	
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}

	

}