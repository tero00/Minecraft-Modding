package tkk0.uniqueitems.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tkk0.uniqueitems.Main;
import tkk0.uniqueitems.init.ModItems;
import tkk0.uniqueitems.util.IHasModel;

public class CoolItemBase extends Item implements IHasModel {

	public CoolItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.uniqueitemstab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
