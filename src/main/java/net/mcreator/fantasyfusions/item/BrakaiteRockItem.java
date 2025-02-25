
package net.mcreator.fantasyfusions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.fantasyfusions.itemgroup.FFtabMainItemGroup;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class BrakaiteRockItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:brakaite_rock")
	public static final Item block = null;
	public BrakaiteRockItem(FantasyFusionsModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FFtabMainItemGroup.tab).maxStackSize(16));
			setRegistryName("brakaite_rock");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
