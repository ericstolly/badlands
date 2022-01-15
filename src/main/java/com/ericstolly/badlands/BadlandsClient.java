/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands;

import com.ericstolly.badlands.constant.Endpoints;
import com.ericstolly.badlands.constant.Realm;
import com.ericstolly.badlands.object.character.CharacterSheet;
import com.ericstolly.badlands.request.Requestable;
import com.ericstolly.badlands.request.impl.CharacterSheetRequest;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import lombok.NonNull;

public class BadlandsClient {
	
	private final BadlandsAuthentication badlandsAuthentication;
	
	/* Initialise BadlandsClient without the usage of BadlandsAuthentication */
	public BadlandsClient(final @NonNull String apiKey, final @NonNull String secretKey) {
		this(new BadlandsAuthentication(apiKey, secretKey));
	}
	
	public BadlandsClient(final @NonNull BadlandsAuthentication badlandsAuthentication) {
		this.badlandsAuthentication = badlandsAuthentication;
	}
	
	public CharacterSheet getCharacterSheet(final @NonNull String character, final @NonNull Realm realm) {
		/* Create the request object */
		final CharacterSheetRequest characterSheetRequest = new CharacterSheetRequest(character, realm, badlandsAuthentication);
		
		/* Send the request and create the JSON object that stores it's response */
		final JSONObject response = sendRequest(characterSheetRequest);
		
		/* Create a new CharacterSheet to return */
		final CharacterSheet characterSheet = new CharacterSheet(response);
		
		return characterSheet;
	}
	
	private JSONObject sendRequest(final @NonNull Requestable requestable) {
	    HttpResponse<JsonNode> jsonResponse 
	      = Unirest.post(Endpoints.MASTER.getUrl() + "?apikey=" + badlandsAuthentication.getApiKey())
	      .header("accept", "application/json")
	      .body(requestable.requestBody())
	      .asJson();
	    
		return jsonResponse.getBody().getObject();
	}
}