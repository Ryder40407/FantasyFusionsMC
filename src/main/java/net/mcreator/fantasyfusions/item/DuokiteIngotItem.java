
package net.mcreator.fantasyfusions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.fantasyfusions.itemgroup.FFtabOresItemGroup;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class DuokiteIngotItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:duokite_ingot")
	public static final Item block = null;
	public DuokiteIngotItem(FantasyFusionsModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FFtabOresItemGroup.tab).maxStackSize(64));
			setRegistryName("duokite_ingot");
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
