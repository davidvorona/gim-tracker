/*
 * Copyright (c) 2021, David Vorona <davidavorona@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.gimp;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Keybind;

@ConfigGroup("gimp")
public interface GimPluginConfig extends Config
{
	@ConfigItem(
		position = 0,
		keyName = "serverAddress",
		name = "Server Address",
		description = "Address of the remote GIMP server, check the GitHub for a public server address"
	)
	default String serverAddress()
	{
		return "";
	}

	@ConfigItem(
		position = 1,
		keyName = "ghostMode",
		name = "Ghost Mode",
		description = "Hide your status and location from your fellow gimps"
	)
	default boolean ghostMode()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "showFootsteps",
		name = "Show Footsteps",
		description = "Choose how many footsteps to show on the map"
	)
	default int showFootsteps()
	{
		return 0;
	}

	@ConfigItem(
		keyName = "pings",
		name = "Pings",
		description = "Enable group pings.<br>"
			+ "To ping, hold the ping hotkey down and click on the tile you want to ping.",
		position = 3
	)
	default boolean pings()
	{
		return true;
	}

	@ConfigItem(
		keyName = "pingSound",
		name = "Ping Sound",
		description = "Enable sound notification on group ping",
		position = 4
	)
	default boolean pingSound()
	{
		return true;
	}

	@ConfigItem(
		keyName = "pingHotkey",
		name = "Ping hotkey",
		description = "Key to hold to send a tile ping.<br>"
			+ "To ping, hold the ping hotkey down and click on the tile you want to ping.",
		position = 5
	)
	default Keybind pingHotkey()
	{
		return Keybind.NOT_SET;
	}

	@ConfigSection(
		position = 6,
		name = "Developer",
		description = "Developer settings"
	)
	String developerSection = "developerSection";

	@ConfigItem(
		position = 7,
		section = developerSection,
		keyName = "showSelf",
		name = "Show Self",
		description = "Show yourself on the map"
	)
	default boolean showSelf()
	{
		return false;
	}

	@ConfigItem(
		keyName = "notesData",
		name = "",
		description = "",
		hidden = true
	)
	default String notesData()
	{
		return "";
	}

	@ConfigItem(
		keyName = "notesData",
		name = "",
		description = ""
	)
	void notesData(String str);
}
