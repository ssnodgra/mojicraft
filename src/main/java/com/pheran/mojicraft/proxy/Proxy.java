package com.pheran.mojicraft.proxy;

import net.minecraft.item.Item;

// Common interface provided by client and server proxy classes
public interface Proxy {
	public void loadModel(Item item);
}
