package me.gamingoninsulin.miniaturecoal.items;

import me.gamingoninsulin.miniaturecoal.MiniatureCoal;
import me.gamingoninsulin.miniaturecoal.blocks.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MINIATURE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MiniatureCoal.MOD_ID, "miniature"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.miniature"))
                    .icon(() -> new ItemStack(ModItems.MINIATURE_COAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.MINIATURE_COAL);
                        entries.add(ModItems.MINIATURE_CHARCOAL);

                        entries.add(ModItems.MINIATURE_BLAZE_CLAY_BALL);
                        entries.add(ModBlocks.MINIATURE_BLAZE_CLAY_BLOCK);

                        entries.add(ModItems.MINIATURE_WET_PEAT_BRICK);
                        entries.add(ModBlocks.MINIATURE_WET_PEAT_BLOCK);

                        entries.add(ModItems.MINIATURE_DRIED_PEAT_BRICK);
                        entries.add(ModBlocks.MINIATURE_DRIED_PEAT_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        MiniatureCoal.LOGGER.info("Registering Item Groups for " + MiniatureCoal.MOD_ID);
    }
}
