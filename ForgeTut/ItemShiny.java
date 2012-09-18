package ForgeTut;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.EnumRarity;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class ItemShiny extends Item
{

	protected ItemShiny(int par1) {
		super(par1);
	}


	@SideOnly(Side.CLIENT)
	public String getTextureFile()
	{
		return "/ForgeTut/gfx/item.png";
	} 
	
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		return true;
	}

	 @SideOnly(Side.CLIENT)
	 public EnumRarity getRarity(ItemStack par1ItemStack)
	 {
		 return EnumRarity.epic;
	 }
}
