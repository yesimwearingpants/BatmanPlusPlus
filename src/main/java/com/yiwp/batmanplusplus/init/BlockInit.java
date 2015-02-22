package com.yiwp.batmanplusplus.init;

import com.yiwp.batmanplusplus.block.*;
import com.yiwp.batmanplusplus.block.itemblock.MetalItemBlock;
import com.yiwp.batmanplusplus.lib.reference.Names;
import com.yiwp.batmanplusplus.lib.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MODID)
public class BlockInit {
	
	
	public static ExtBlock BlockMetaMetal = new MetalBlock();
	public static ExtBlock BlockTetsu = new BlockTetsu(11.5f, 35.0f);
	public static ExtBlock BlockTitaniumAlumide = new BlockTiAl(7.5f, 25.0f);
	public static ExtBlock BlockCactusSteel = new BlockCactusSteel(0.1f, 0.1f);
	public static ExtBlock BlockPressBoard = new BlockPressBoard();
		
	
	public static void preInit() {
		GameRegistry.registerBlock(BlockTetsu, Names.Textures.block(Names.tetsu));
		GameRegistry.registerBlock(BlockTitaniumAlumide, Names.Textures.block(Names.titaniumAlumide));
		GameRegistry.registerBlock(BlockCactusSteel, Names.Textures.block(Names.cactusSteel));
		GameRegistry.registerBlock(BlockPressBoard, Names.Textures.block(Names.board));
		GameRegistry.registerBlock(BlockMetaMetal, MetalItemBlock.class, "blockMetal");
	}

}
