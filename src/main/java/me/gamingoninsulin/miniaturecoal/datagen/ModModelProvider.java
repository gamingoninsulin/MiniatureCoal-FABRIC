package me.gamingoninsulin.miniaturecoal.datagen;

import me.gamingoninsulin.miniaturecoal.blocks.ModBlocks;
import me.gamingoninsulin.miniaturecoal.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider  extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MINIATURE_WET_PEAT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MINIATURE_DRIED_PEAT_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MINIATURE_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINIATURE_CHARCOAL, Models.GENERATED);

        itemModelGenerator.register(ModItems.MINIATURE_BLAZE_CLAY_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINIATURE_BLAZE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINIATURE_WET_PEAT_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINIATURE_DRIED_PEAT_BRICK, Models.GENERATED);
    }

}
