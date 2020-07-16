
package net.mcreator.fantasyfusions.world.structure;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.LogicalSidedProvider;
import net.minecraftforge.fml.LogicalSide;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.concurrent.ThreadTaskExecutor;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.fantasyfusions.procedures.FusionCrystalSLTProcedure;
import net.mcreator.fantasyfusions.FantasyFusionsModElements;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@FantasyFusionsModElements.ModElement.Tag
public class FusionCrystalSmallTempleStructure extends FantasyFusionsModElements.ModElement {
	public FusionCrystalSmallTempleStructure(FantasyFusionsModElements instance) {
		super(instance, 41);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		Feature<NoFeatureConfig> feature = new Feature<NoFeatureConfig>(NoFeatureConfig::deserialize) {
			@Override
			public boolean place(IWorld iworld, ChunkGenerator generator, Random random, BlockPos pos, NoFeatureConfig config) {
				int ci = pos.getX();
				int ck = pos.getZ();
				DimensionType dimensionType = iworld.getDimension().getType();
				boolean dimensionCriteria = false;
				if (dimensionType == DimensionType.OVERWORLD)
					dimensionCriteria = true;
				if (!dimensionCriteria)
					return false;
				if ((random.nextInt(1000000) + 1) <= 1250) {
					int count = random.nextInt(1) + 1;
					for (int a = 0; a < count; a++) {
						int i = ci + random.nextInt(16) + 8;
						int k = ck + random.nextInt(16) + 8;
						int j = iworld.getHeight(Heightmap.Type.OCEAN_FLOOR_WG, i, k);
						j -= 1;
						BlockState blockAt = iworld.getBlockState(new BlockPos(i, j, k));
						boolean blockCriteria = false;
						if (blockAt.getBlock() == Blocks.GRASS_BLOCK.getDefaultState().getBlock())
							blockCriteria = true;
						if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
							blockCriteria = true;
						if (blockAt.getBlock() == Blocks.SAND.getDefaultState().getBlock())
							blockCriteria = true;
						if (blockAt.getBlock() == Blocks.RED_SAND.getDefaultState().getBlock())
							blockCriteria = true;
						if (blockAt.getBlock() == Blocks.PODZOL.getDefaultState().getBlock())
							blockCriteria = true;
						if (!blockCriteria)
							continue;
						Template template = ((ServerWorld) iworld.getWorld()).getSaveHandler().getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("fantasy_fusions", "fusiongemschem"));
						if (template == null)
							return false;
						Rotation rotation = Rotation.NONE;
						Mirror mirror = Mirror.NONE;
						BlockPos spawnTo = new BlockPos(i, j + 0, k);
						ServerWorld world = (ServerWorld) iworld.getWorld();
						int x = spawnTo.getX();
						int y = spawnTo.getY();
						int z = spawnTo.getZ();
						template.addBlocksToWorldChunk(iworld, spawnTo,
								new PlacementSettings().setRotation(rotation).setRandom(random).setMirror(mirror)
										.addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK).setChunk((ChunkPos) null)
										.setIgnoreEntities(false));
						ThreadTaskExecutor<?> executor = LogicalSidedProvider.WORKQUEUE.get(LogicalSide.SERVER);
						if (!executor.isOnExecutionThread()) {
							executor.deferTask(() -> {
								{
									Map<String, Object> $_dependencies = new HashMap<>();
									$_dependencies.put("x", x);
									$_dependencies.put("y", y);
									$_dependencies.put("z", z);
									$_dependencies.put("world", world);
									FusionCrystalSLTProcedure.executeProcedure($_dependencies);
								}
							});
						} else {
							{
								Map<String, Object> $_dependencies = new HashMap<>();
								$_dependencies.put("x", x);
								$_dependencies.put("y", y);
								$_dependencies.put("z", z);
								$_dependencies.put("world", world);
								FusionCrystalSLTProcedure.executeProcedure($_dependencies);
							}
						}
					}
				}
				return true;
			}
		};
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
			biome.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, feature.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
					.withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG)));
		}
	}
}
