package com.pheran.mojicraft.init;

import com.pheran.mojicraft.item.ItemBase;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	static Item smiley;
	static Item smiley2;
	
	public static void setup() {
		smiley = new ItemBase("smiley");
		smiley2 = new ItemBase("smiley2");
	}

}
