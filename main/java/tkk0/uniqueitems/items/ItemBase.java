package tkk0.uniqueitems.items;

import net.minecraft.item.Item;
import tkk0.uniqueitems.Main;
import tkk0.uniqueitems.init.ModItems;
import tkk0.uniqueitems.util.IHasModel;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.uniqueitemstab);
		
		ModItems.ITEMS.add(this);
		
	}

	
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
