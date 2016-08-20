package com.pheran.mojicraft.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item {
	
	public ItemBase(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		GameRegistry.register(this);
	}
}
