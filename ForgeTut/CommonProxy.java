package ForgeTut;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy implements IGuiHandler
{
	public static Block forgeblock = (new BlockForgeTest(200, 0, Material.cloth)).setBlockName("forgetestblock").setHardness(1F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);
	public static Block multiblock = (new MultiBlockTexture(201, 0, Material.clay)).setBlockName("multitexture").setHardness(1F).setResistance(10F).setCreativeTab(CreativeTabs.tabBlock);
	public static Block flower = (new BlockCustomFlower(202, 65, Material.plants)).setBlockName("Flower").setHardness(0F).setResistance(0.1F).setCreativeTab(CreativeTabs.tabDeco);
	
	public static Item forgeitem = (new ItemForgeTest(12000)).setItemName("forgetestitem").setIconIndex(0).setTabToDisplayOn(CreativeTabs.tabMisc);
	public static Item shinyitem = (new ItemShiny(12001)).setItemName("shinyitem").setIconIndex(1).setTabToDisplayOn(CreativeTabs.tabMisc);
	
	
	
	public static void registerRenderInformation()
	{
		GameRegistry.registerBlock(forgeblock);
		GameRegistry.registerBlock(multiblock);
		GameRegistry.registerBlock(flower);
		
		GameRegistry.addSmelting(Item.appleRed.shiftedIndex, new ItemStack(CommonProxy.forgeblock, 32), 200F);
		
		GameRegistry.addRecipe(new ItemStack(shinyitem), new Object[] {"AAA", "FFF", "GGG", 'A', new ItemStack(Item.arrow), 'F', new ItemStack(Block.dirt), 'G', new ItemStack(forgeblock)});
		GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond), new Object[] {new ItemStack(forgeblock)});
	
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		return null;
	}
}
