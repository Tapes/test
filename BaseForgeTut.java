package ForgeTut;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Forge Test", name = "Flip Test Mod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false, versionBounds = "[0.0.1]")

public class BaseForgeTut 
{
	@SidedProxy(clientSide = "ForgeTut.ClientProxy", serverSide = "ForgeTut.CommonProxy")
	public static CommonProxy proxy;
	
	public class MyForgeMod
	{
	
	}
	
	@Init
	public void LoadFrom(FMLInitializationEvent event)
	{
		proxy.registerRenderInformation();
		ClientProxy.registerRenderInformation();
	}
	
	@PreInit
	public void PreLoad(FMLInitializationEvent event)
	{
		
	}	
}
