package net.uebishe.govnishe.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.uebishe.govnishe.Govnishe;

public class ModItemsGroups {
    public static final ItemGroup Unusual_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(Govnishe.MOD_ID, "assofant"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.assofant"))
                    .icon(() -> new ItemStack(ModItems.ASSOFANT)).entries((displayContext, entries) -> {
                  entries.add(ModItems.ASSOFANT);
                  entries.add(ModItems.ASSOFSQUID);
                    }).build());
    public static void registerItemGroups() {
        Govnishe.LOGGER.info("registering Item Groups For " + Govnishe.MOD_ID);

    }

}
