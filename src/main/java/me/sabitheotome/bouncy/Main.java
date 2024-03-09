package me.sabitheotome.bouncy;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Main implements ModInitializer {

	public static final String MOD_ID = "bouncy";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Bouncy Mod");
	}
}