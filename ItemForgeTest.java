package ForgeTut;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Item;

public class ItemForgeTest extends Item
{
	protected ItemForgeTest(int i) 
	{
		super(i);
	}

	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/ForgeTut/item.png";
	}
}
