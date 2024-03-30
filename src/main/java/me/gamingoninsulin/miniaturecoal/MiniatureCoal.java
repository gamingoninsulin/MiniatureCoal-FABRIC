package me.gamingoninsulin.miniaturecoal;

import me.gamingoninsulin.miniaturecoal.blocks.ModBlocks;
import me.gamingoninsulin.miniaturecoal.items.ModItemGroups;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import me.gamingoninsulin.miniaturecoal.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniatureCoal implements ModInitializer {
	public static final String MOD_ID = "miniacoal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.MINIATURE_COAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.MINIATURE_CHARCOAL, 200);
		FuelRegistry.INSTANCE.add(ModItems.MINIATURE_BLAZE_BRICK, 3000);

		LOGGER.info("Miniature Coal is DONE loading!");
	}
}