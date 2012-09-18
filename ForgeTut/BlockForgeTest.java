package ForgeTut;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.EntitySilverfish;
import net.minecraft.src.EntityXPOrb;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockForgeTest extends Block 
{
	public BlockForgeTest(int i, int j, Material m)
	{
		super(i, j, m);
	}
	
	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/ForgeTut/gfx/block.png";
	}
	
	
    public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            EntityXPOrb var6 = new EntityXPOrb(par1World);
            var6.setLocationAndAngles((double)par2 + 0.5D, (double)par3, (double)par4 + 0.5D, 0.0F, 0.0F);
            par1World.spawnEntityInWorld(var6);
        }

        super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
    }
}
