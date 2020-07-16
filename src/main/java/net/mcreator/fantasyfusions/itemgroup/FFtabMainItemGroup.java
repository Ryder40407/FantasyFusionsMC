
package net.mcreator.fantasyfusions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.fantasyfusions.item.NetreikLeafItem;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

@FantasyFusionsModElements.ModElement.Tag
public class FFtabMainItemGroup extends FantasyFusionsModElements.ModElement {
	public FFtabMainItemGroup(FantasyFusionsModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabf_ftab_main") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(NetreikLeafItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
