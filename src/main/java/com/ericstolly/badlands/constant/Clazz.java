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
public enum Clazz {
	
	UNDEFINED(0, "Undefined"),
	WARRIOR(1, "Warrior"),
	PALADIN(2, "Paladin"),
	HUNTER(3, "Hunter"),
	ROGUE(4, "Rogue"),
	PRIEST(5, "Priest"),
	DEATH_KNIGHT(6, "Death Knight"),
	SHAMAN(7, "Shaman"),
	MAGE(8, "Mage"),
	WARLOCK(9, "Warlock"),
	MONK(10, "Monk"),
	DRUID(11, "Druid");
	
	/* ID of the class as predefined in the Stormforge REST API */
	private int id;
	
	/* Friendly class name in case we want to print it */
	private String friendly;
	
	/* Gets the Class of the id provided */
	public static Clazz getClazzFromId(final int clazzId) {
		return Arrays.asList(Clazz.values()).stream().filter(clazz -> clazz.getId() == clazzId).findFirst().orElse(null);
	}
	
	/* Gets the Class of the string provided */
	public static Clazz getClazzFromString(final @NonNull String clazzString) {
		return Arrays.asList(Clazz.values()).stream().filter(clazz -> clazz.getFriendly().equals(clazzString)).findFirst().orElse(null);
	}
}