package com.Shawn560.Main;

import com.Shawn560.tool.dTools;
import com.Shawn560.tool.eTools;
import com.Shawn560.tool.gTools;
import com.Shawn560.tool.iTools;
import com.Shawn560.tool.sTools;

public class ToolsRegistry {

	public static void registry(){
		sTools.mainRegistry();
		iTools.mainRegistry();
		gTools.mainRegistry();
		dTools.mainRegistry();
		eTools.mainRegistry();
	}
}
