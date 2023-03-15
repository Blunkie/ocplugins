package com.yfletch.occlicker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

@ConfigGroup("oc-clicker")
public interface OCClickerConfig extends Config
{
	@ConfigItem(
		keyName = "toggle",
		name = "Toggle",
		description = "",
		position = 0
	)
	default Keybind toggle()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		keyName = "consumeYellowClicks",
		name = "Consume yellow clicks",
		description = "Consume yellow clicks that may occur if the OC plugins messes up",
		position = 2
	)
	default boolean consumeYellowClicks()
	{
		return true;
	}
}
