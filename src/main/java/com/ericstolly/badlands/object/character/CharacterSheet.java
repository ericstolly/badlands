/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.object.character;

import com.ericstolly.badlands.constant.Clazz;
import com.ericstolly.badlands.constant.Faction;
import com.ericstolly.badlands.constant.Gender;
import com.ericstolly.badlands.constant.Race;
import com.ericstolly.badlands.object.character.CharacterStatistics.BaseStatistics;

import kong.unirest.json.JSONObject;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
@ToString
public class CharacterSheet {
	
	private String name;
	private Clazz clazz;
	private Race race;
	private Faction faction;
	private int level;
	private Gender gender;
	private SkinData skinData;
	private int averageItemLevel;
	private boolean dualSpecialization;
	private int activeSpecialization;
	private BaseStatistics baseStatistics;
	
	//TODO: Make a guild object?
	private String guild;
	
	public CharacterSheet(final @NonNull JSONObject jsonObject) {
		final JSONObject response = jsonObject.getJSONObject("response");
		final JSONObject skinDataResponse = response.getJSONObject("skindata");
		final JSONObject statisticsResponse = response.getJSONObject("characterStat");
		
		this.name = response.getString("name");
		this.clazz = Clazz.getClazzFromId(response.getInt("class"));
		this.race = Race.getRaceFromId(response.getInt("race"));
		this.faction = Faction.getFactionFromString(response.getString("faction_string_class"));
		this.level = response.getInt("level");
		this.gender = Gender.getGenderFromId(response.getInt("gender"));
		this.guild = response.getString("guildName");
		this.averageItemLevel = response.getInt("avgitemlevel");
		this.dualSpecialization = response.getBoolean("dualSpec");
		this.activeSpecialization = response.getInt("activeSpec");
		
		this.skinData = new SkinData(
				skinDataResponse.getInt("skinstyle"),
				skinDataResponse.getInt("facecolor"),
				skinDataResponse.getInt("hairstyle"),
				skinDataResponse.getInt("haircolor"),
				skinDataResponse.getInt("facialhair"));
		
		this.baseStatistics = new BaseStatistics(
				statisticsResponse.getInt("base_strength"),
				statisticsResponse.getInt("base_agility"),
				statisticsResponse.getInt("base_stamina"),
				statisticsResponse.getInt("base_spirit"));
	}
}