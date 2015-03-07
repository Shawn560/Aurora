package com.Shawn560.Main;

import com.Shawn560.item.Seeds;
import com.Shawn560.item.Shards;
import com.Shawn560.item.Sticks;
import com.Shawn560.item.toolhead.AxeHead;
import com.Shawn560.item.toolhead.HoeHead;
import com.Shawn560.item.toolhead.PickHead;
import com.Shawn560.item.toolhead.SpadeHead;
import com.Shawn560.item.toolhead.SwordBlade;
import com.Shawn560.item.toolhead.SwordGrip;

public class ItemRegistry {

	public static void registry(){
		Sticks.mainRegistry();
		Shards.mainRegistry();
		Seeds.mainRegistry();
		AxeHead.mainRegistry();
		PickHead.mainRegistry();
		SpadeHead.mainRegistry();
		SwordBlade.mainRegistry();
		SwordGrip.mainRegistry();
		HoeHead.mainRegistry();
	}
}
