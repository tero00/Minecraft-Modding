package tkk0.uniqueitems.items.tools;

import net.minecraft.item.ItemSword;
import tkk0.uniqueitems.Main;
import tkk0.uniqueitems.init.ModItems;
import tkk0.uniqueitems.util.IHasModel;

public class SwordBase extends ItemSword implements IHasModel{

	public SwordBase(String name, ToolMaterial material) {
		super(material);
		
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

