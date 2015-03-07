package com.Shawn560.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class CraftingBenchRecipeSorter implements Comparator {

	final CraftingBenchCraftingManager workSurface;
	
	public CraftingBenchRecipeSorter(CraftingBenchCraftingManager workSurfaceCraftingManager) {
		this.workSurface = workSurfaceCraftingManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof CraftingBenchShapelessRecipes && irecipe2 instanceof CraftingBenchShapedRecipes ? 1: (irecipe2 instanceof CraftingBenchShapelessRecipes && irecipe1 instanceof CraftingBenchShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}