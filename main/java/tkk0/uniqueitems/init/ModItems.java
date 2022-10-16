package tkk0.uniqueitems.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import tkk0.uniqueitems.items.CoolItemBase;
import tkk0.uniqueitems.items.ItemBase;
import tkk0.uniqueitems.items.armor.ArmorBase;
import tkk0.uniqueitems.items.armor.JuggArmor;
import tkk0.uniqueitems.items.tools.BowBase;
import tkk0.uniqueitems.items.tools.DaggerBase;
import tkk0.uniqueitems.items.tools.HeavySwordBase;
import tkk0.uniqueitems.items.tools.LightSwordBase;
import tkk0.uniqueitems.items.tools.OmegaHeavySwordBase;
import tkk0.uniqueitems.items.tools.SwordBase;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//material
	public static final ArmorMaterial ARMOR_MATERIAL_SOULLESS = EnumHelper.addArmorMaterial("soulless_material", "uniqueitems:soulless", 23, new int[]{3,6,6,3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_RITUAL = EnumHelper.addArmorMaterial("ritual_material", "uniqueitems:ritual", 11, new int[]{1,1,4,5}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_JUNGLE = EnumHelper.addArmorMaterial("jungle_material", "uniqueitems:jungle", 11, new int[]{1,1,4,5}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_JUGGERNAUT = EnumHelper.addArmorMaterial("juggernaut_material", "uniqueitems:juggernaut", 116, new int[]{1,1,1,11}, 5, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 8.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WOODLAND = EnumHelper.addArmorMaterial("woodland_material", "uniqueitems:woodland", 4, new int[]{1,2,3,2}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SPECTRE = EnumHelper.addArmorMaterial("spectre_material", "uniqueitems:spectre", 11, new int[]{1,1,4,5}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TWILIGHT = EnumHelper.addArmorMaterial("twilight_material", "uniqueitems:twilight", 7, new int[]{2,4,5,2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_FAIRY = EnumHelper.addArmorMaterial("fairy_material", "uniqueitems:fairy", 38, new int[]{4,7,9,4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_BEEHIVE = EnumHelper.addArmorMaterial("beehive_material", "uniqueitems:beehive", 24, new int[]{1,2,3,3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SHENDYT = EnumHelper.addArmorMaterial("shendyt_material", "uniqueitems:shendyt", 12, new int[]{1,3,1,1}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SORCERER = EnumHelper.addArmorMaterial("sorcerer_material", "uniqueitems:sorcerer", 41, new int[]{2,7,5,4}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ACROPOLIS = EnumHelper.addArmorMaterial("acropolis_material", "uniqueitems:acropolis", 56, new int[]{5,8,10,5}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CORAL = EnumHelper.addArmorMaterial("coral_material", "uniqueitems:coral", 13, new int[]{3,6,7,3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_WATERDRAGON = EnumHelper.addArmorMaterial("waterdragon_material", "uniqueitems:waterdragon", 27, new int[]{4,6,8,3}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_LEAFDRAGON = EnumHelper.addArmorMaterial("leafdragon_material", "uniqueitems:leafdragon", 37, new int[]{5,8,10,5}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_FIREDRAGON = EnumHelper.addArmorMaterial("firedragon_material", "uniqueitems:firedragon", 47, new int[]{5,8,10,5}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 4.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_CANDY = EnumHelper.addArmorMaterial("candy_material", "uniqueitems:candy", 87, new int[]{1,1,9,1}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_ZAARVOX = EnumHelper.addArmorMaterial("zaarvox_material", "uniqueitems:zaarvox", 37, new int[]{1,1,9,1}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_RESU = EnumHelper.addArmorMaterial("resu_material", "uniqueitems:resu", 29, new int[]{1,1,9,1}, 11, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SPECTRAL = EnumHelper.addArmorMaterial("spectral_material", "uniqueitems:spectral", 37, new int[]{5,8,10,5}, 66, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);

	public static final ToolMaterial DAGGER_MATERIAL_WEAK = EnumHelper.addToolMaterial("dagger_material_weak", 1, 156, 5.0F, 0.0F, 10);
	public static final ToolMaterial DAGGER_MATERIAL_MEDIUM = EnumHelper.addToolMaterial("dagger_material_medium", 1, 1146, 5.0F, 2.0F, 15);
	public static final ToolMaterial DAGGER_MATERIAL = EnumHelper.addToolMaterial("dagger_material", 1, 1955, 5.0F, 5.0F, 60);
	public static final ToolMaterial DAGGER_MATERIAL_ULTRA = EnumHelper.addToolMaterial("dagger_material_ultra", 1, 2666, 5.0F, 10.0F, 5);
	
	public static final ToolMaterial STAFF_MATERIAL = EnumHelper.addToolMaterial("staff_material", 1, 946, 10.0F, 9.0F, 20);

	public static final ToolMaterial SWORD_MATERIAL_MEDIUM = EnumHelper.addToolMaterial("sword_material_medium", 1, 946, 5.0F, 8.0F, 110);
	public static final ToolMaterial SWORD_MATERIAL_STRONG = EnumHelper.addToolMaterial("sword_material_strong", 1, 946, 5.0F, 10.0F, 30);
	
	public static final ToolMaterial SWORD_MATERIAL_HEAVY = EnumHelper.addToolMaterial("sword_material_heavy", 1, 2649, 8.0F, 14.0F, 11);
	public static final ToolMaterial SWORD_MATERIAL_OMEGA = EnumHelper.addToolMaterial("sword_material_omega", 1, 180000, 20.0F, 12.0F, 2);
	
	public static final ToolMaterial KATANA_MATERIAL_WOOD = EnumHelper.addToolMaterial("katana_material_wood", 1, 69, 10.0F, 0.0F, 15);
	public static final ToolMaterial KATANA_MATERIAL = EnumHelper.addToolMaterial("katana_material", 1, 644, 20.0F, 1.0F, 11);
	public static final ToolMaterial KATANA_MATERIAL_DURABLE = EnumHelper.addToolMaterial("katana_material_durable", 1, 946, 20.0F, 3.0F, 11);
	public static final ToolMaterial KATANA_MATERIAL_STRONG = EnumHelper.addToolMaterial("katana_material_strong", 1, 1303, 20.0F, 9.0F, 30);
	public static final ToolMaterial KATANA_MATERIAL_ULTRA = EnumHelper.addToolMaterial("katana_material_ultra", 1, 644, 20.0F, 4.0F, 2);
	
	//item
	public static final Item WOOL_CLOTH = new ItemBase("wool_cloth");
	public static final Item WOODLAND_CLOTH = new ItemBase("woodland_cloth");
	public static final Item CORAL_CLOTH = new ItemBase("coral_cloth");
	public static final Item TWILIGHT_CLOTH = new ItemBase("twilight_cloth");
	public static final Item SPECTRAL_CLOTH = new ItemBase("spectral_cloth");
	public static final Item SOULLESS_CLOTH = new ItemBase("soulless_cloth");
	public static final Item SORCERER_CLOTH = new ItemBase("sorcerer_cloth");
	public static final Item WATERDRAGON_CLOTH = new ItemBase("waterdragon_cloth");
	
	public static final Item SPIRIT_BOTTLE = new ItemBase("spirit_bottle");
	public static final Item SPIRIT_IRON = new ItemBase("spirit_iron");
	public static final Item ANGRY_SPIRIT_BOTTLE = new ItemBase("angry_spirit_bottle");
	public static final Item ANGRY_SPIRIT_IRON = new ItemBase("angry_spirit_iron");
	public static final Item FAIRY_IRON = new ItemBase("fairy_iron");
	public static final Item BARK = new ItemBase("bark");
	public static final Item OBSIDIAN_PLATE = new ItemBase("obsidian_plate");
	public static final Item CORAL_BRANCH = new ItemBase("coral_branch");
	public static final Item ENCHANTED_LEAF = new CoolItemBase("enchanted_leaf");
	public static final Item DRAGON_SCALE = new CoolItemBase("dragon_scale");
	public static final Item PRIMATIC_GEM = new CoolItemBase("prismatic_gem");
	public static final Item LEAFDRAGON_HIDE = new ItemBase("leafdragon_hide");
	public static final Item FIREDRAGON_PLATE = new ItemBase("firedragon_plate");
	public static final Item HARD_REDSTONE = new ItemBase("hard_redstone");
	public static final Item POLISHED_LAPIS = new ItemBase("polished_lapis");
	public static final Item ASH_DIAMOND = new ItemBase("ash_diamond");
	public static final Item STAR_QUARTZ = new CoolItemBase("star_quartz");
	public static final Item STAR_GOLD = new CoolItemBase("star_gold");
	public static final Item ULTRAMARINE = new ItemBase("ultramarine");
	public static final Item STAR_CRONUS_METAL = new CoolItemBase("star_cronus_metal");
	
	//tool & weapon
	public static final ItemSword BONE_DAGGER = new DaggerBase("bone_dagger", DAGGER_MATERIAL_WEAK);
	public static final ItemSword BEE_STINGER_DAGGER = new DaggerBase("queen_bee_stinger", DAGGER_MATERIAL_MEDIUM);
	public static final ItemSword SPIRIT_DAGGER = new DaggerBase("spirit_dagger", DAGGER_MATERIAL);
	public static final ItemSword ETHERITE_DAGGER = new DaggerBase("etherite_dagger", DAGGER_MATERIAL);
	public static final ItemSword CRONUS_DAGGER = new DaggerBase("cronus_dagger", DAGGER_MATERIAL_ULTRA);

	public static final ItemSword FAIRY_SWORD = new SwordBase("fairy_sword", SWORD_MATERIAL_MEDIUM);
	
	public static final ItemSword SKYSPLITTER_SWORD = new SwordBase("skysplitter_sword", SWORD_MATERIAL_STRONG);
	public static final ItemSword ACCLAIM_SWORD = new SwordBase("acclaim_sword", SWORD_MATERIAL_STRONG);
	public static final ItemSword SPLENDOR_SWORD = new SwordBase("splendor_sword", SWORD_MATERIAL_STRONG);
	public static final ItemSword MAJESTY_SWORD = new SwordBase("majesty_sword", SWORD_MATERIAL_STRONG);
	
	public static final ItemSword BEDROCK_SWORD = new HeavySwordBase("bedrock_sword", SWORD_MATERIAL_OMEGA);
	public static final ItemSword DEMON_BLADE = new HeavySwordBase("demon_blade", SWORD_MATERIAL_HEAVY);
	public static final ItemSword COLOSSUS_SWORD = new HeavySwordBase("colossus_sword", SWORD_MATERIAL_HEAVY);
	
	public static final ItemSword KENDO_STICK = new LightSwordBase("kendo_stick", KATANA_MATERIAL_WOOD);
	public static final ItemSword MURAMASA = new LightSwordBase("muramasa", KATANA_MATERIAL);
	public static final ItemSword RAY_KATANA = new LightSwordBase("ray_katana", KATANA_MATERIAL);
	public static final ItemSword DOKU_NO_KEN = new LightSwordBase("doku_no_ken", KATANA_MATERIAL_DURABLE);
	public static final ItemSword MASAMUNE = new LightSwordBase("masamune", KATANA_MATERIAL_STRONG);
	public static final ItemSword SADAMUNE = new LightSwordBase("sadamune", KATANA_MATERIAL_STRONG);
	public static final ItemSword KUSANAGI = new LightSwordBase("kusanagi", KATANA_MATERIAL_STRONG);
	
	public static final ItemSword VOID_BLADE = new OmegaHeavySwordBase("void_blade", KATANA_MATERIAL_ULTRA);
	
	public static final ItemSword SPECTRE_STAFF = new HeavySwordBase("spectre_staff", STAFF_MATERIAL);
	
	public static final Item CORAL_BOW = new BowBase("coral_bow");
	public static final Item LEAF_BOW = new BowBase("leaf_bow");
	
	//armor
	public static final Item SOULLESS_MASK = new ArmorBase("soulless_mask", ARMOR_MATERIAL_SOULLESS, 1, EntityEquipmentSlot.HEAD);
	public static final Item SOULLESS_ROBE = new ArmorBase("soulless_robe", ARMOR_MATERIAL_SOULLESS, 1, EntityEquipmentSlot.CHEST);
	public static final Item SOULLESS_LEGGINGS = new ArmorBase("soulless_leggings", ARMOR_MATERIAL_SOULLESS, 2, EntityEquipmentSlot.LEGS);
	public static final Item SOULLESS_BOOTS = new ArmorBase("soulless_boots", ARMOR_MATERIAL_SOULLESS, 1, EntityEquipmentSlot.FEET);
	
	public static final Item WOODLAND_MASK = new ArmorBase("woodland_mask", ARMOR_MATERIAL_WOODLAND, 1, EntityEquipmentSlot.HEAD);
	public static final Item WOODLAND_ROBE = new ArmorBase("woodland_robe", ARMOR_MATERIAL_WOODLAND, 1, EntityEquipmentSlot.CHEST);
	public static final Item WOODLAND_LEGGINGS = new ArmorBase("woodland_leggings", ARMOR_MATERIAL_WOODLAND, 2, EntityEquipmentSlot.LEGS);
	public static final Item WOODLAND_BOOTS = new ArmorBase("woodland_boots", ARMOR_MATERIAL_WOODLAND, 1, EntityEquipmentSlot.FEET);
	
	public static final Item TWILIGHT_HELMET = new ArmorBase("twilight_helmet", ARMOR_MATERIAL_TWILIGHT, 1, EntityEquipmentSlot.HEAD);
	public static final Item TWILIGHT_ROBE = new ArmorBase("twilight_robe", ARMOR_MATERIAL_TWILIGHT, 1, EntityEquipmentSlot.CHEST);
	public static final Item TWILIGHT_LEGGINGS = new ArmorBase("twilight_leggings", ARMOR_MATERIAL_TWILIGHT, 2, EntityEquipmentSlot.LEGS);
	public static final Item TWILIGHT_BOOTS = new ArmorBase("twilight_boots", ARMOR_MATERIAL_TWILIGHT, 1, EntityEquipmentSlot.FEET);

	public static final Item FAIRY_HELMET = new ArmorBase("fairy_helmet", ARMOR_MATERIAL_FAIRY, 1, EntityEquipmentSlot.HEAD);
	public static final Item FAIRY_CHESTPLATE = new ArmorBase("fairy_chestplate", ARMOR_MATERIAL_FAIRY, 1, EntityEquipmentSlot.CHEST);
	public static final Item FAIRY_LEGGINGS = new ArmorBase("fairy_leggings", ARMOR_MATERIAL_FAIRY, 2, EntityEquipmentSlot.LEGS);
	public static final Item FAIRY_BOOTS = new ArmorBase("fairy_boots", ARMOR_MATERIAL_FAIRY, 1, EntityEquipmentSlot.FEET);
	
	public static final Item RITUAL_SKULL_HELMET = new ArmorBase("ritual_skull_helmet", ARMOR_MATERIAL_RITUAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item RITUAL_ROBE = new ArmorBase("ritual_robe", ARMOR_MATERIAL_RITUAL, 1, EntityEquipmentSlot.CHEST);
	
	public static final Item JUNGLE_HELMET = new ArmorBase("crystal_skull_helmet", ARMOR_MATERIAL_JUNGLE, 1, EntityEquipmentSlot.HEAD);
	public static final Item JUNGLE_ROBE = new ArmorBase("jungle_robe", ARMOR_MATERIAL_JUNGLE, 1, EntityEquipmentSlot.CHEST);
	
	public static final Item SPECTRE_HELMET = new ArmorBase("spectre_skull_helmet", ARMOR_MATERIAL_SPECTRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPECTRE_ROBE = new ArmorBase("spectre_robe", ARMOR_MATERIAL_SPECTRE, 1, EntityEquipmentSlot.CHEST);
	
	public static final Item JUGGERNAUT_HELMET = new JuggArmor("juggernaut_helmet", ARMOR_MATERIAL_JUGGERNAUT, 1, EntityEquipmentSlot.HEAD);
	
	public static final Item BEEHIVE_HELMET = new ArmorBase("beehive_helmet", ARMOR_MATERIAL_BEEHIVE, 1, EntityEquipmentSlot.HEAD);
	
	public static final Item SORCERER_HELMET = new ArmorBase("sorcerer_helmet", ARMOR_MATERIAL_SORCERER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SORCERER_ROBE = new ArmorBase("sorcerer_robe", ARMOR_MATERIAL_SORCERER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SORCERER_lEGGINGS = new ArmorBase("sorcerer_leggings", ARMOR_MATERIAL_SORCERER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SORCERER_BOOTS = new ArmorBase("sorcerer_boots", ARMOR_MATERIAL_SORCERER, 1, EntityEquipmentSlot.FEET);

	public static final Item ACROPOLIS_HELMET = new ArmorBase("acropolis_helmet", ARMOR_MATERIAL_ACROPOLIS, 1, EntityEquipmentSlot.HEAD);
	public static final Item ACROPOLIS_CHESTPLATE = new ArmorBase("acropolis_chestplate", ARMOR_MATERIAL_ACROPOLIS, 1, EntityEquipmentSlot.CHEST);
	public static final Item ACROPOLIS_LEGGINGS = new ArmorBase("acropolis_leggings", ARMOR_MATERIAL_ACROPOLIS, 2, EntityEquipmentSlot.LEGS);
	public static final Item ACROPOLIS_BOOTS = new ArmorBase("acropolis_boots", ARMOR_MATERIAL_ACROPOLIS, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SHENDYT = new ArmorBase("shendyt", ARMOR_MATERIAL_SHENDYT, 2, EntityEquipmentSlot.LEGS);

	public static final Item CORAL_HELMET = new ArmorBase("coral_helmet", ARMOR_MATERIAL_CORAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item CORAL_CHESTPLATE = new ArmorBase("coral_chestplate", ARMOR_MATERIAL_CORAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item CORAL_LEGGINGS = new ArmorBase("coral_leggings", ARMOR_MATERIAL_CORAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item CORAL_BOOTS = new ArmorBase("coral_boots", ARMOR_MATERIAL_CORAL, 1, EntityEquipmentSlot.FEET);

	public static final Item WATERDRAGON_HELMET = new ArmorBase("waterdragon_helmet", ARMOR_MATERIAL_WATERDRAGON, 1, EntityEquipmentSlot.HEAD);
	public static final Item WATERDRAGON_ROBE = new ArmorBase("waterdragon_robe", ARMOR_MATERIAL_WATERDRAGON, 1, EntityEquipmentSlot.CHEST);
	public static final Item WATERDRAGON_LEGGINGS = new ArmorBase("waterdragon_leggings", ARMOR_MATERIAL_WATERDRAGON, 2, EntityEquipmentSlot.LEGS);
	public static final Item WATERDRAGON_BOOTS = new ArmorBase("waterdragon_boots", ARMOR_MATERIAL_WATERDRAGON, 1, EntityEquipmentSlot.FEET);

	public static final Item FIREDRAGON_HELMET = new ArmorBase("firedragon_helmet", ARMOR_MATERIAL_FIREDRAGON, 1, EntityEquipmentSlot.HEAD);
	public static final Item FIRERAGON_CHESTPLATE = new ArmorBase("firedragon_chestplate", ARMOR_MATERIAL_FIREDRAGON, 1, EntityEquipmentSlot.CHEST);
	public static final Item FIREDRAGON_LEGGINGS = new ArmorBase("firedragon_leggings", ARMOR_MATERIAL_FIREDRAGON, 2, EntityEquipmentSlot.LEGS);
	public static final Item FIREDRAGON_BOOTS = new ArmorBase("firedragon_boots", ARMOR_MATERIAL_FIREDRAGON, 1, EntityEquipmentSlot.FEET);

	public static final Item LEAFDRAGON_HELMET = new ArmorBase("leafdragon_helmet", ARMOR_MATERIAL_LEAFDRAGON, 1, EntityEquipmentSlot.HEAD);
	public static final Item LEAFDRAGON_CHESTPLATE = new ArmorBase("leafdragon_chestplate", ARMOR_MATERIAL_LEAFDRAGON, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEAFDRAGON_LEGGINGS = new ArmorBase("leafdragon_leggings", ARMOR_MATERIAL_LEAFDRAGON, 2, EntityEquipmentSlot.LEGS);
	public static final Item LEAFDRAGON_BOOTS = new ArmorBase("leafdragon_boots", ARMOR_MATERIAL_LEAFDRAGON, 1, EntityEquipmentSlot.FEET);
	
	public static final Item CANDY_CHESTPLATE = new ArmorBase("candy_chestplate", ARMOR_MATERIAL_CANDY, 1, EntityEquipmentSlot.CHEST);
	
	public static final Item ZAARVOX_CHESTPLATE = new ArmorBase("zaarvox_chestplate", ARMOR_MATERIAL_ZAARVOX, 1, EntityEquipmentSlot.CHEST);

	public static final Item RESURRECTED_CHESTPLATE = new ArmorBase("resurrected_chestplate", ARMOR_MATERIAL_RESU, 1, EntityEquipmentSlot.CHEST);

	public static final Item SPECTRAL_HELMET = new ArmorBase("spectral_helmet", ARMOR_MATERIAL_SPECTRAL, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPECTRAL_CHESTPLATE = new ArmorBase("spectral_chestplate", ARMOR_MATERIAL_SPECTRAL, 1, EntityEquipmentSlot.CHEST);
	public static final Item SPECTRAL_LEGGINGS = new ArmorBase("spectral_leggings", ARMOR_MATERIAL_SPECTRAL, 2, EntityEquipmentSlot.LEGS);
	public static final Item SPECTRAL_BOOTS = new ArmorBase("spectral_boots", ARMOR_MATERIAL_SPECTRAL, 1, EntityEquipmentSlot.FEET);
}
