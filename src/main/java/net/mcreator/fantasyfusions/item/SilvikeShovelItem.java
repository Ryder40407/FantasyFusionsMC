
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
public class SilvikeShovelItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:silvike_shovel")
	public static final Item block = null;
	public SilvikeShovelItem(FantasyFusionsModElements instance) {
		super(instance, 80);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 5.5f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SilvikeIngotItem.block, (int) (1)));
			}
		}, 1, -3.1f, new Item.Properties().group(FFtabToolsItemGroup.tab)) {
		}.setRegistryName("silvike_shovel"));
	}
}
