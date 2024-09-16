package jiraiyah.bedrock_tools;

import jiraiyah.bedrock_tools.registry.ModEffects;
import jiraiyah.bedrock_tools.registry.ModEvents;
import jiraiyah.bedrock_tools.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;

import static jiraiyah.bedrock_tools.Reference.LOGGER;

public class Main implements ModInitializer
{
	public static boolean DEBUG;

	@Override
	public void onInitialize() {
		DEBUG = FabricLoader.getInstance().isDevelopmentEnvironment();

		LOGGER.info("\u001b[38;2;" + 255 + ";" + 255 + ";" + 0 + ";48;2;" + 255 + ";" + 0 + ";" + 127 +
					"m>>> " + "Initializing" + " " + Reference.ANSI_RESET);

		ModEvents.register();
		ModItems.register();
		ModEffects.register();
	}
}