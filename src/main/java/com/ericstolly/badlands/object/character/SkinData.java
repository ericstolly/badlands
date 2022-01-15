/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.object.character;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class SkinData {
	
	private final int skinStyle;
	private final int faceColor;
	private final int hairStyle;
	private final int hairColor;
	private final int facialHair;
}