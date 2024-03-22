package me.gamingoninsulin.miniaturecoal.items;

import me.gamingoninsulin.miniaturecoal.MiniatureCoal;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MINIATURE_COAL = registerItem("miniature_coal",
            new Item(new FabricItemSettings()));

    public static final Item MINIATURE_CHARCOAL = registerItem("miniature_charcoal",
            new Item(new FabricItemSettings()));

    public static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MiniatureCoal.MOD_ID, name), item);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(MINIATURE_COAL);
        entries.add(MINIATURE_CHARCOAL);
    }

    public static void registerModItems() {
        MiniatureCoal.LOGGER.info("Registering Mod Items for " + MiniatureCoal.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }
}
