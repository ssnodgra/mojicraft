package com.pheran.mojicraft;

import com.pheran.mojicraft.init.ModItems;
import com.pheran.mojicraft.proxy.Proxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// Main class for Mojicraft mod
@Mod(modid = Mojicraft.MODID)
public class Mojicraft {
	// Unique identifier string for this mod
	public static final String MODID = "mojicraft";

	// Create instance variable for this mod
	@Instance(MODID)
	public static Mojicraft instance;

	// Set up proxy functions to run on client-side and server-side
	// This avoids executing client-specific code on the server, which would crash it
	@SidedProxy(clientSide = "com.pheran.mojicraft.proxy.ClientProxy", serverSide = "com.pheran.mojicraft.ServerProxy")
	public static Proxy proxy;
	
	// Set up tab so that items can be added to the inventory menu in creative mode
	public static MojiTab creativeTab;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.setup();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {

	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
