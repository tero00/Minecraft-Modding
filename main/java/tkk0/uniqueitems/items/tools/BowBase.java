package tkk0.uniqueitems.items.tools;

import net.minecraft.item.ItemBow;
import tkk0.uniqueitems.Main;
import tkk0.uniqueitems.init.ModItems;
import tkk0.uniqueitems.util.IHasModel;

public class BowBase extends ItemBow implements IHasModel{
	
	public BowBase(String name) {
		
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
