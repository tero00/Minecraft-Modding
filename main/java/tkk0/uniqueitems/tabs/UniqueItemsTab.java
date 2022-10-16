package tkk0.uniqueitems.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import tkk0.uniqueitems.init.ModItems;

public class UniqueItemsTab extends CreativeTabs{

	public UniqueItemsTab(String label) {
		super("uniqueitemstab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.BEEHIVE_HELMET);
	}

}
