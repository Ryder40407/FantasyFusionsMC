package net.mcreator.fantasyfusions.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.mcreator.fantasyfusions.item.WauviunCrystalItem;
import net.mcreator.fantasyfusions.item.TowhineLeafItem;
import net.mcreator.fantasyfusions.item.SrivuiteDustItem;
import net.mcreator.fantasyfusions.item.SkycraitCrystalItem;
import net.mcreator.fantasyfusions.item.CrackiumCrystalItem;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

import java.util.Map;

@FantasyFusionsModElements.ModElement.Tag
public class FusionCrystalSLTProcedure extends FantasyFusionsModElements.ModElement {
	public FusionCrystalSLTProcedure(FantasyFusionsModElements instance) {
		super(instance, 40);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure FusionCrystalSLT!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure FusionCrystalSLT!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure FusionCrystalSLT!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure FusionCrystalSLT!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)), Blocks.CHEST.getDefaultState(), 3);
		if ((Math.random() < 0.7)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(TowhineLeafItem.block, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 3)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 3)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Items.IRON_INGOT, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 2)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((Math.random() < 0.4)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(CrackiumCrystalItem.block, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 2)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Items.EMERALD, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 1)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((Math.random() < 0.4)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(WauviunCrystalItem.block, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 2)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 2)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 1)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((Math.random() < 0.4)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(SrivuiteDustItem.block, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 2)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Blocks.OAK_LOG, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 7)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
		if ((Math.random() < 0.25)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(SkycraitCrystalItem.block, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 2)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		} else {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) (y + 2), (int) (z + 1)));
				if (_ent != null) {
					final int _sltid = (int) (Math.round((Math.random() * 27)));
					final ItemStack _setstack = new ItemStack(Blocks.VOID_AIR, (int) (1));
					_setstack.setCount((int) Math.round((Math.random() * 1)));
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						if (capability instanceof IItemHandlerModifiable) {
							((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
						}
					});
				}
			}
		}
	}
}
