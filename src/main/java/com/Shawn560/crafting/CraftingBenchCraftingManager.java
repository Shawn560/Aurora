package com.Shawn560.crafting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.world.World;

import com.Shawn560.item.Ingots;
import com.Shawn560.item.Rods;
import com.Shawn560.item.Seeds;
import com.Shawn560.item.Shards;
import com.Shawn560.item.Sticks;
import com.Shawn560.tool.sTools;

public class CraftingBenchCraftingManager {
	    /** The static instance of this class */
	    private static final CraftingBenchCraftingManager instance = new CraftingBenchCraftingManager();
	    /** A list of all the recipes added */
	    private List recipes = new ArrayList();
	    private static final String __OBFID = "CL_00000090";

	    /**
	     * Returns the static instance of this class
	     */
	    public static final CraftingBenchCraftingManager getInstance()
	    {
	        /** The static instance of this class */
	        return instance;
	    }

	    private CraftingBenchCraftingManager()
	    {
	        recipes = new ArrayList();
	        
	        this.addRecipe(new ItemStack(sTools.sdAxe, 1), new Object[] {"S", "S", "S", "S", "S", 'S', Items.stick});
	        this.addRecipe(new ItemStack(Shards.stoneShard, 8), new Object[]{"SSSSS", "SYYYS", "SYYYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Shards.ironShard, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Blocks.stone, 'Z', Items.iron_ingot});
	        this.addRecipe(new ItemStack(Shards.goldShard, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Blocks.stone, 'Z', Items.gold_ingot});
	        this.addRecipe(new ItemStack(Shards.diamondShard, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Blocks.stone, 'Z', Items.diamond});
	        this.addRecipe(new ItemStack(Shards.emeraldShard, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Blocks.stone, 'Z', Items.emerald});
	        
	        this.addRecipe(new ItemStack(Sticks.sStick, 1), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Shards.stoneShard, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Sticks.iStick, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Shards.ironShard, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Sticks.gStick, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Shards.goldShard, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Sticks.dStick, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Shards.diamondShard, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Sticks.eStick, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Shards.emeraldShard, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Sticks.bStick, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Shards.boneShard, 'Y', Blocks.stone});
	        
	        this.addRecipe(new ItemStack(Rods.sRod, 1), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Sticks.sStick, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Rods.iRod, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Sticks.iStick, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Rods.gRod, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Sticks.gStick, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Rods.dRod, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Sticks.dStick, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Rods.eRod, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Sticks.eStick, 'Y', Blocks.stone});
	        this.addRecipe(new ItemStack(Rods.bRod, 8), new Object[]{" SYS ", " SYS ", " SYS ", " SYS ", " SYS ", 'S', Sticks.bStick, 'Y', Blocks.stone});
	        
	        this.addRecipe(new ItemStack(Seeds.cSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.CopperIngot, 'Z', Items.wheat_seeds});
	        this.addRecipe(new ItemStack(Seeds.tSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.TinIngot, 'Z', Items.wheat_seeds});
	        this.addRecipe(new ItemStack(Seeds.zSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.ZincIngot, 'Z', Items.wheat_seeds});
	        this.addRecipe(new ItemStack(Seeds.nSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.NickelIngot, 'Z', Items.wheat_seeds});
	        this.addRecipe(new ItemStack(Seeds.mSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.MaganeseIngot, 'Z', Items.wheat_seeds});
	        this.addRecipe(new ItemStack(Seeds.vSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.VanadiumIngot, 'Z', Items.wheat_seeds});
	        this.addRecipe(new ItemStack(Seeds.rSeed, 8), new Object[]{"SSSSS", "SYYYS", "SYZYS", "SYYYS", "SSSSS", 'S', Shards.Shard, 'Y', Ingots.RhodiumIngot, 'Z', Items.wheat_seeds});
	        
	        Collections.sort(this.recipes, new CraftingBenchRecipeSorter(this));
	    }

	    public CraftingBenchShapedRecipes addRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	    {
	        String s = "";
	        int i = 0;
	        int j = 0;
	        int k = 0;

	        if (par2ArrayOfObj[i] instanceof String[])
	        {
	            String[] astring = (String[])((String[])par2ArrayOfObj[i++]);

	            for (int l = 0; l < astring.length; ++l)
	            {
	                String s1 = astring[l];
	                ++k;
	                j = s1.length();
	                s = s + s1;
	            }
	        }
	        else
	        {
	            while (par2ArrayOfObj[i] instanceof String)
	            {
	                String s2 = (String)par2ArrayOfObj[i++];
	                ++k;
	                j = s2.length();
	                s = s + s2;
	            }
	        }

	        HashMap hashmap;

	        for (hashmap = new HashMap(); i < par2ArrayOfObj.length; i += 2)
	        {
	            Character character = (Character)par2ArrayOfObj[i];
	            ItemStack itemstack1 = null;

	            if (par2ArrayOfObj[i + 1] instanceof Item)
	            {
	                itemstack1 = new ItemStack((Item)par2ArrayOfObj[i + 1]);
	            }
	            else if (par2ArrayOfObj[i + 1] instanceof Block)
	            {
	                itemstack1 = new ItemStack((Block)par2ArrayOfObj[i + 1], 1, 32767);
	            }
	            else if (par2ArrayOfObj[i + 1] instanceof ItemStack)
	            {
	                itemstack1 = (ItemStack)par2ArrayOfObj[i + 1];
	            }

	            hashmap.put(character, itemstack1);
	        }

	        ItemStack[] aitemstack = new ItemStack[j * k];

	        for (int i1 = 0; i1 < j * k; ++i1)
	        {
	            char c0 = s.charAt(i1);

	            if (hashmap.containsKey(Character.valueOf(c0)))
	            {
	                aitemstack[i1] = ((ItemStack)hashmap.get(Character.valueOf(c0))).copy();
	            }
	            else
	            {
	                aitemstack[i1] = null;
	            }
	        }

	        CraftingBenchShapedRecipes shapedrecipes = new CraftingBenchShapedRecipes(j, k, aitemstack, par1ItemStack);
	        this.recipes.add(shapedrecipes);
	        return shapedrecipes;
	    }

	    public void addShapelessRecipe(ItemStack par1ItemStack, Object ... par2ArrayOfObj)
	    {
	        ArrayList arraylist = new ArrayList();
	        Object[] aobject = par2ArrayOfObj;
	        int i = par2ArrayOfObj.length;

	        for (int j = 0; j < i; ++j)
	        {
	            Object object1 = aobject[j];

	            if (object1 instanceof ItemStack)
	            {
	                arraylist.add(((ItemStack)object1).copy());
	            }
	            else if (object1 instanceof Item)
	            {
	                arraylist.add(new ItemStack((Item)object1));
	            }
	            else
	            {
	                if (!(object1 instanceof Block))
	                {
	                    throw new RuntimeException("Invalid shapeless recipe!");
	                }

	                arraylist.add(new ItemStack((Block)object1));
	            }
	        }

	        this.recipes.add(new ShapelessRecipes(par1ItemStack, arraylist));
	    }

	    public ItemStack findMatchingRecipe(InventoryCrafting par1InventoryCrafting, World par2World)
	    {
	        int i = 0;
	        ItemStack itemstack = null;
	        ItemStack itemstack1 = null;
	        int j;

	        for (j = 0; j < par1InventoryCrafting.getSizeInventory(); ++j)
	        {
	            ItemStack itemstack2 = par1InventoryCrafting.getStackInSlot(j);

	            if (itemstack2 != null)
	            {
	                if (i == 0)
	                {
	                    itemstack = itemstack2;
	                }

	                if (i == 1)
	                {
	                    itemstack1 = itemstack2;
	                }

	                ++i;
	            }
	        }

	        if (i == 2 && itemstack.getItem() == itemstack1.getItem() && itemstack.stackSize == 1 && itemstack1.stackSize == 1 && itemstack.getItem().isRepairable())
	        {
	            Item item = itemstack.getItem();
	            int j1 = item.getMaxDamage() - itemstack.getItemDamageForDisplay();
	            int k = item.getMaxDamage() - itemstack1.getItemDamageForDisplay();
	            int l = j1 + k + item.getMaxDamage() * 5 / 100;
	            int i1 = item.getMaxDamage() - l;

	            if (i1 < 0)
	            {
	                i1 = 0;
	            }

	            return new ItemStack(itemstack.getItem(), 1, i1);
	        }
	        else
	        {
	            for (j = 0; j < this.recipes.size(); ++j)
	            {
	                IRecipe irecipe = (IRecipe)this.recipes.get(j);

	                if (irecipe.matches(par1InventoryCrafting, par2World))
	                {
	                    return irecipe.getCraftingResult(par1InventoryCrafting);
	                }
	            }

	            return null;
	        }
	    }

	    /**
	     * returns the List<> of all recipes
	     */
	    public List getRecipeList()
	    {
	        return this.recipes;
	    }
	}
