package ForgeTut;
 
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
 
public class ClientProxy extends CommonProxy
{
@SideOnly(Side.CLIENT)
public static void registerRenderInformation()
	{
		LanguageRegistry.addName(CommonProxy.forgeitem, "Forge Item");
		LanguageRegistry.addName(CommonProxy.forgeblock, "Forge Block");
		LanguageRegistry.addName(CommonProxy.multiblock, "Multi Block");
		LanguageRegistry.addName(CommonProxy.shinyitem, "Shiny Item");
		LanguageRegistry.addName(CommonProxy.flower, "Flower");
	}	
}