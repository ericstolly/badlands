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
public enum Race {
	
	UNDEFINED(0, "Undefined"),
	HUMAN(1, "Human"),
	ORC(2, "Orc"),
	DWARF(3, "Dwarf"),
	NIGHT_ELF(4, "Night Elf"),
	UNDEAD(5, "Undead"),
	TAUREN(6, "Tauren"),
	GNOME(7, "Gnome"),
	TROLL(8, "Troll"),
	GOBLIN(9, "Goblin"),
	BLOOD_ELF(10, "Blood Elf"),
	DRAENEI(11, "Draenei"),
	WORGEN(22, "Worgen"),
	PANDAREN(25, "Pandaren");
	
	/* ID of the race as predefined in the Stormforge REST API */
	private int id;
	
	/* Friendly race name in case we want to print it */
	private String friendly;
	
	/* Gets the Race of the id provided */
	public static Race getRaceFromId(final int raceId) {
		return Arrays.asList(Race.values()).stream().filter(race -> race.getId() == raceId).findFirst().orElse(null);
	}
	
	/* Gets the Race of the string provided */
	public static Race getRaceFromString(final @NonNull String raceString) {
		return Arrays.asList(Race.values()).stream().filter(race -> race.getFriendly().equals(raceString)).findFirst().orElse(null);
	}	
}