
package net.mcreator.fantasyfusions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.fantasyfusions.itemgroup.FFtabToolsItemGroup;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class TrikiteAxeItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:trikite_axe")
	public static final Item block = null;
	public TrikiteAxeItem(FantasyFusionsModElements instance) {
		super(instance, 91);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1275;
			}

			public float getEfficiency() {
				return 7.5f;
			}

			public float getAttackDamage() {
				return 6.299999999999999f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TrikiteIngotItem.block, (int) (1)));
			}
		}, 1, -3.2f, new Item.Properties().group(FFtabToolsItemGroup.tab)) {
		}.setRegistryName("trikite_axe"));
	}
}
