package com.yiwp.batmanplusplus.block;

import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BPPBlock extends ExtBlock	{

	public String[] textureNames = {};
		
	public BPPBlock(Material material, String[] tex, String name) {
		super(material, tex, name);
		
	}

	

}