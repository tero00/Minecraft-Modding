package tkk0.uniqueitems.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import tkk0.uniqueitems.blocks.SoullessSand;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block SOULLESS_SAND = new SoullessSand("soulless_sand", Material.SAND);
}
