package me.gamingoninsulin.miniaturecoal.blocks;

import me.gamingoninsulin.miniaturecoal.MiniatureCoal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block MINIATURE_BLAZE_CLAY_BLOCK = registerBlock("miniature_blaze_clay_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).sounds(BlockSoundGroup.ROOTED_DIRT)));

    public static final Block MINIATURE_WET_PEAT_BLOCK = registerBlock("miniature_wet_peat_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).sounds(BlockSoundGroup.ROOTED_DIRT)));

    public static final Block MINIATURE_DRIED_PEAT_BLOCK = registerBlock("miniature_dried_peat_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CLAY).sounds(BlockSoundGroup.ROOTED_DIRT)));

    /*
    ####################################################################################################################
                                                    DON'T TOUCH!
    ####################################################################################################################
     */
    private static Block registerBlock(String name, Block block) {
     registerBlockItem(name, block);
     return Registry.register(Registries.BLOCK, new Identifier(MiniatureCoal.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MiniatureCoal.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        MiniatureCoal.LOGGER.info("Registering ModBlocks for " + MiniatureCoal.MOD_ID);
    }
}
