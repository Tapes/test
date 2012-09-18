package ForgeTut;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.Material;

public class MultiBlockTexture extends Block 
{
	public MultiBlockTexture(int i, int j, Material m)
	{
		super(i, j, m);
	}
	
	//if par1    0 = Bottom 1 = Top 2-5 = sides
    public int getBlockTextureFromSide(int par1)
    {
       return par1 == 0 ? 19 : (par1 == 1 ? 23 : 22);
    }
}