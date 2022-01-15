/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.request;

import kong.unirest.json.JSONObject;

public interface Requestable {
	
	JSONObject requestBody();
}