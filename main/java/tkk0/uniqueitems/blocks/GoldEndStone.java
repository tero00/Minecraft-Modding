package tkk0.uniqueitems.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import tkk0.uniqueitems.Main;

public class GoldEndStone extends BlockBase{

	public GoldEndStone(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setCreativeTab(Main.uniqueitemstab);
		
	}

}
