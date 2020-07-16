
package net.mcreator.fantasyfusions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.fantasyfusions.itemgroup.FFtabToolsItemGroup;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class SilvikeSwordItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:silvike_sword")
	public static final Item block = null;
	public SilvikeSwordItem(FantasyFusionsModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 270;
			}

			public float getEfficiency() {
				return 5.5f;
			}

			public float getAttackDamage() {
				return 1.3000000000000003f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SilvikeIngotItem.block, (int) (1)));
			}
		}, 3, -2.2999999999999998f, new Item.Properties().group(FFtabToolsItemGroup.tab)) {
		}.setRegistryName("silvike_sword"));
	}
}
