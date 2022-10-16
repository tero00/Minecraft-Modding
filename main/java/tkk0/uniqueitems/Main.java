package tkk0.uniqueitems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tkk0.uniqueitems.init.ModItems;
import tkk0.uniqueitems.proxy.CommonProxy;
import tkk0.uniqueitems.tabs.UniqueItemsTab;
import tkk0.uniqueitems.util.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	public static final CreativeTabs uniqueitemstab = new UniqueItemsTab("uniqueitemstab");

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
	
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {

		GameRegistry.addSmelting(Blocks.REDSTONE_BLOCK, new ItemStack(ModItems.HARD_REDSTONE), 10F);
		GameRegistry.addSmelting(Blocks.LAPIS_BLOCK, new ItemStack(ModItems.POLISHED_LAPIS), 10F);
	
	}	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
	
	}
}

