package net.uebishe.govnishe;

import net.fabricmc.api.ModInitializer;

import net.uebishe.govnishe.item.ModItems;
import net.uebishe.govnishe.item.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Govnishe implements ModInitializer {
	public static final String MOD_ID = "govnishe";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}