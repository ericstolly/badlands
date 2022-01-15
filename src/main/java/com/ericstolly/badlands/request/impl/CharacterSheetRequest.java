/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.request.impl;

import com.ericstolly.badlands.BadlandsAuthentication;
import com.ericstolly.badlands.constant.Endpoints;
import com.ericstolly.badlands.constant.Realm;
import com.ericstolly.badlands.request.Requestable;

import kong.unirest.json.JSONObject;
import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public class CharacterSheetRequest implements Requestable {

	private final @NonNull String character;
	private final @NonNull Realm realm;
	private final @NonNull BadlandsAuthentication badlandsAuthentication;
	
	@Override
	public JSONObject requestBody() {
		final JSONObject body = new JSONObject();
		final JSONObject parameters = new JSONObject();
		
		body.put("url", Endpoints.CHARACTER_SHEET.getUrl());
		body.put("secret", badlandsAuthentication.getSecretKey());
		
		parameters.put("n", character);
		parameters.put("r", realm.getRealmName());
		
		body.put("params", parameters);
		
		return body;
	}
}