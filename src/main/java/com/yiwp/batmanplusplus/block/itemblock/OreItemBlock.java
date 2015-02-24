package com.yiwp.batmanplusplus.block.itemblock;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

public class OreItemBlock extends ExtItemBlock {

	static final String[] metalTypes = new String[] {Names.Metal.titanium, Names.Metal.vibranium};
	
	public OreItemBlock(Block b) {
		super(b, "ore", metalTypes);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= metalTypes.length) {
			i = 0;
		}
		return this.getUnlocalizedName() + metalTypes[i];
	}

}