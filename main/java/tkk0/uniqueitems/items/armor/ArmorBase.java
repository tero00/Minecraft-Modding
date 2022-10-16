package tkk0.uniqueitems.items.armor;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import tkk0.uniqueitems.Main;
import tkk0.uniqueitems.init.ModItems;
import tkk0.uniqueitems.util.IHasModel;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
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
