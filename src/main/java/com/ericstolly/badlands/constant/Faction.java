/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.constant;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@Getter
@AllArgsConstructor
public enum Faction {
	
	UNDEFINED(-1, "Undefined"),
	ALLIANCE(1, "Alliance"),
	HORDE(2, "Horde");
	
	/* ID of the faction as predefined in the Stormforge REST API */
	private int id;
	
	/* Friendly faction name in case we want to print it */
	private String friendly;
	
	/* Gets the Faction of the id provided */
	public static Faction getFactionFromId(final int factionId) {
		return Arrays.asList(Faction.values()).stream().filter(faction -> faction.getId() == factionId).findFirst().orElse(null);
	}
	
	/* Gets the Race of the string provided */
	public static Faction getFactionFromString(final @NonNull String factionString) {
		return Arrays.asList(Faction.values()).stream().filter(faction -> faction.getFriendly().equals(factionString)).findFirst().orElse(null);
	}
}