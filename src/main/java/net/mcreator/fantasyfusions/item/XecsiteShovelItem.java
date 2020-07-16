
package net.mcreator.fantasyfusions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.fantasyfusions.itemgroup.FFtabToolsItemGroup;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class XecsiteShovelItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:xecsite_shovel")
	public static final Item block = null;
	public XecsiteShovelItem(FantasyFusionsModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 237;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(XecsiteIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(FFtabToolsItemGroup.tab)) {
		}.setRegistryName("xecsite_shovel"));
	}
}
