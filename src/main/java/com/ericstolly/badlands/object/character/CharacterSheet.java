/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.object.character;

import com.ericstolly.badlands.constant.Clazz;
import com.ericstolly.badlands.constant.Faction;
import com.ericstolly.badlands.constant.Gender;
import com.ericstolly.badlands.constant.Race;

import kong.unirest.json.JSONObject;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString
public class CharacterSheet {
	
	private String name;
	private Clazz clazz;
	private Race race;
	private Faction faction;
	private int level;
	private Gender gender;
	
	//TODO: Make a guild object?
	private String guild;
	
	public CharacterSheet(final @NonNull JSONObject jsonObject) {
		final JSONObject response = jsonObject.getJSONObject("response");
		
		this.name = response.getString("name");
		this.clazz = Clazz.getClazzFromId(response.getInt("class"));
		this.race = Race.getRaceFromId(response.getInt("race"));
		this.faction = Faction.getFactionFromString(response.getString("faction_string_class"));
		this.level = response.getInt("level");
		this.gender = Gender.getGenderFromId(response.getInt("gender"));
		this.guild = response.getString("guildName");
	}
}