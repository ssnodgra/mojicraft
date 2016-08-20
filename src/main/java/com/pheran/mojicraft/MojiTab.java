package com.pheran.mojicraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MojiTab extends CreativeTabs {
	
	public MojiTab() {
		super(Mojicraft.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return null;
	}
}
