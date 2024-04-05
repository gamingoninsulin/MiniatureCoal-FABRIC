package me.gamingoninsulin.miniaturecoal.datagen;

import me.gamingoninsulin.miniaturecoal.blocks.ModBlocks;
import me.gamingoninsulin.miniaturecoal.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider  extends FabricRecipeProvider {
    private static final List<ItemConvertible> PEAT_SMELTABLES = List.of(
            ModItems.MINIATURE_WET_PEAT_BRICK);

    private static final List<ItemConvertible> BLAZE_SMELTABLES = List.of(
            ModItems.MINIATURE_BLAZE_CLAY_BALL);

    public ModRecipeProvider(FabricDataOutput output) { super(output); }

    @Override
    public void generate(RecipeExporter exporter) {
    /*
    ####################################################################################################################
                                                    FURNACE RECIPES
    ####################################################################################################################
    */

        offerSmelting(exporter, PEAT_SMELTABLES, RecipeCategory.MISC, ModItems.MINIATURE_DRIED_PEAT_BRICK,
                0.7f, 200, "fuel");

        // #############################################################################################################

    /*
    ####################################################################################################################
                                                    BLASTING RECIPES
    ####################################################################################################################
    */

        offerBlasting(exporter, PEAT_SMELTABLES, RecipeCategory.MISC, ModItems.MINIATURE_DRIED_PEAT_BRICK,
                0.7f, 100, "fuel");

        // #############################################################################################################

        offerBlasting(exporter, BLAZE_SMELTABLES, RecipeCategory.MISC, ModItems.MINIATURE_BLAZE_BRICK,
                0.7f, 400, "fuel");

    /*
    ####################################################################################################################
                                                 SHAPELESS RECIPES
    ####################################################################################################################
    */
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MINIATURE_COAL, 9)
                .input(Items.COAL)
                .criterion(FabricRecipeProvider.hasItem(Items.COAL),
                        FabricRecipeProvider.conditionsFromItem(Items.COAL))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_COAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_COAL)).offerTo(exporter);

        // #############################################################################################################

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MINIATURE_CHARCOAL, 9)
                .input(Items.CHARCOAL)
                .criterion(FabricRecipeProvider.hasItem(Items.CHARCOAL),
                        FabricRecipeProvider.conditionsFromItem(Items.CHARCOAL))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_CHARCOAL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_CHARCOAL)).offerTo(exporter);

        // #############################################################################################################

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK, 1)
                .input(Items.CLAY)
                .input(Items.BLAZE_POWDER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_BLAZE_CLAY_BALL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_BLAZE_CLAY_BALL))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK)).offerTo(exporter);

        // #############################################################################################################

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MINIATURE_BLAZE_CLAY_BALL, 4)
                .input(ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_BLAZE_CLAY_BALL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_BLAZE_CLAY_BALL))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_BLAZE_CLAY_BALL),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_BLAZE_CLAY_BALL)).offerTo(exporter);

        // #############################################################################################################

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MINIATURE_WET_PEAT_BRICK, 4)
                .input(ModBlocks.MINIATURE_WET_PEAT_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_WET_PEAT_BRICK),

                FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_WET_PEAT_BRICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MINIATURE_WET_PEAT_BLOCK),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.MINIATURE_WET_PEAT_BLOCK)).offerTo(exporter);

        // #############################################################################################################

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MINIATURE_DRIED_PEAT_BRICK, 4)
                .input(ModBlocks.MINIATURE_DRIED_PEAT_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MINIATURE_DRIED_PEAT_BRICK),

                FabricRecipeProvider.conditionsFromItem(ModItems.MINIATURE_DRIED_PEAT_BRICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MINIATURE_DRIED_PEAT_BLOCK),
                FabricRecipeProvider.conditionsFromItem(ModBlocks.MINIATURE_DRIED_PEAT_BLOCK)).offerTo(exporter);
    /*
    ####################################################################################################################
                                                    SHAPED RECIPES
    ####################################################################################################################
    */
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.COAL, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.MINIATURE_COAL)
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MINIATURE_COAL) + "_craft"));

        // #############################################################################################################
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHARCOAL, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.MINIATURE_CHARCOAL)
                .criterion(hasItem(Items.CHARCOAL), conditionsFromItem(Items.CHARCOAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.MINIATURE_CHARCOAL)+ "_craft"));

        // #############################################################################################################

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.MINIATURE_BLAZE_CLAY_BALL)
                .criterion(hasItem(ModItems.MINIATURE_BLAZE_CLAY_BALL), conditionsFromItem(ModItems.MINIATURE_BLAZE_CLAY_BALL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK) + "_craft"));

        // #############################################################################################################

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MINIATURE_WET_PEAT_BLOCK, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.MINIATURE_WET_PEAT_BRICK)
                .criterion(hasItem(ModItems.MINIATURE_WET_PEAT_BRICK), conditionsFromItem(ModItems.MINIATURE_WET_PEAT_BRICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MINIATURE_WET_PEAT_BLOCK) + "_craft"));

        // #############################################################################################################

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MINIATURE_DRIED_PEAT_BLOCK, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.MINIATURE_DRIED_PEAT_BRICK)
                .criterion(hasItem(ModItems.MINIATURE_DRIED_PEAT_BRICK), conditionsFromItem(ModItems.MINIATURE_DRIED_PEAT_BRICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.MINIATURE_DRIED_PEAT_BLOCK) + "_craft"));

        // #############################################################################################################
    }
}
