package net.uebishe.govnishe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.uebishe.govnishe.Govnishe;

public class ModItems {

    public static final Item ASSOFANT = registerItem("assofant", new Item(new FabricItemSettings().food(ModFoodComponent.ASSOFANT)));
    public static final Item ASSOFSQUID = registerItem("assofsquid", new Item(new FabricItemSettings().food(ModFoodComponent.ASSOFSQUID)));

    private static void addItemsToIngridientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ASSOFANT);
        entries.add(ASSOFSQUID);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Govnishe.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Govnishe.LOGGER.info("Registering Mod Items for " + Govnishe.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngridientTabItemGroup);
    }
}
