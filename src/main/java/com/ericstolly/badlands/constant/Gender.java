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
public enum Gender {
	
	UNDEFINED(-1, "Undefined"),
	MALE(1, "Male"),
	FEMALE(2, "Female");
	
	/* ID of the gender as predefined in the Stormforge REST API */
	private int id;
	
	/* Friendly gender name in case we want to print it */
	private String friendly;
	
	/* Gets the Faction of the id provided */
	public static Gender getGenderFromId(final int genderId) {
		return Arrays.asList(Gender.values()).stream().filter(gender -> gender.getId() == genderId).findFirst().orElse(null);
	}
	
	/* Gets the Race of the string provided */
	public static Gender getGenderFromString(final @NonNull String genderString) {
		return Arrays.asList(Gender.values()).stream().filter(gender -> gender.getFriendly().equals(genderString)).findFirst().orElse(null);
	}
}