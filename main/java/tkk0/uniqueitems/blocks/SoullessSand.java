package tkk0.uniqueitems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import tkk0.uniqueitems.Main;

public class SoullessSand extends BlockBase{

	public SoullessSand(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SAND);
		setCreativeTab(Main.uniqueitemstab);
		
	}

}
