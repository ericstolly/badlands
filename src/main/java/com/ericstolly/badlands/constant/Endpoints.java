/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Endpoints {
	
	MASTER("https://characters-api.stormforge.gg/v1/"),
	CHARACTER_SHEET("character-sheet");
	
	public String url;
}
