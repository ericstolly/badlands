/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.object.character;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.experimental.UtilityClass;

//TODO: Come back to this, the API is very messy when it comes to this...

@UtilityClass
public class CharacterStatistics {
	
	@ToString
	@AllArgsConstructor
	public static class BaseStatistics {
		public final int strength;
		public final int agility;
		public final int stamina;
		public final int spirit;
	}
	
	public class MeleeStatistics {
		
	}
	
	public class RangedStatistics {
		
	}
	
	public class SpellStatistics {
		
	}
	
	public class DefenseStatistics {
		
	}
	
	@ToString
	@AllArgsConstructor
	public static class CombatStatistics {
		public final int honorableKills;
	}
}