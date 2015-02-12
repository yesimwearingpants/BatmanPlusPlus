package com.yiwp.batmanplusplus.block;

import java.util.List;

import mantle.blocks.MantleBlock;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import com.yiwp.batmanplusplus.creativetab.BPPCreativeTab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class ExtBlock extends MantleBlock {
	
	public String[] textureNames;
	public IIcon[] icons; 
	
	
	public ExtBlock(Material material, String[] tex, String name) {
		super(material);
		this.setCreativeTab(BPPCreativeTab.INSTANCE);
		this.setBlockName(name);
	}

	@Override
    public int damageDropped (int meta)
    {
        return meta;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister iconRegister)
    {
        this.icons = new IIcon[textureNames.length];

        for (int i = 0; i < this.icons.length; ++i)
        {
            this.icons[i] = iconRegister.registerIcon("tinker:" + textureNames[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon (int side, int meta)
    {
        return meta < icons.length ? icons[meta] : icons[0];
    }

    @SideOnly(Side.CLIENT)
    public int getSideTextureIndex (int side)
    {
        if (side == 0)
            return 2;
        if (side == 1)
            return 0;

        return 1;
    }

    // TODO getSubBlocks
    @Override
    public void getSubBlocks (Item block, CreativeTabs tab, List list)
    {
        for (int iter = 0; iter < icons.length; iter++)
        {
            list.add(new ItemStack(block, 1, iter));
        }
    }

	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z,
			int beaconX, int beaconY, int beaconZ) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}