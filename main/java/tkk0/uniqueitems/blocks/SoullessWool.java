package tkk0.uniqueitems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import tkk0.uniqueitems.Main;

public class SoullessWool extends BlockBase{

	public SoullessWool(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.CLOTH);
		setCreativeTab(Main.uniqueitemstab);
		
	}

}
