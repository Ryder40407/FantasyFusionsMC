
package net.mcreator.fantasyfusions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.fantasyfusions.itemgroup.FFtabMainItemGroup;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class NetreikLeafItem extends FantasyFusionsModElements.ModElement {
	@ObjectHolder("fantasy_fusions:netreik_leaf")
	public static final Item block = null;
	public NetreikLeafItem(FantasyFusionsModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(FFtabMainItemGroup.tab).maxStackSize(16));
			setRegistryName("netreik_leaf");
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
