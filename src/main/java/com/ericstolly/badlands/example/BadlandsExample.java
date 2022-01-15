/**
 * Badlands - Copyright (C) 2022 Eric Stolly
 * https://www.ericstolly.com/
 */
package com.ericstolly.badlands.example;

import com.ericstolly.badlands.BadlandsAuthentication;
import com.ericstolly.badlands.BadlandsClient;
import com.ericstolly.badlands.constant.Realm;

import lombok.NonNull;

public class BadlandsExample {
	
	public static void main(final @NonNull String[] args) {
		BadlandsClient badlandsClient = new BadlandsClient(BadlandsAuthentication.builder().apiKey("API_KEY").secretKey("SECRET_KEY").build());
		
		System.out.println(badlandsClient.getCharacterSheet("Ericstolly", Realm.MISTBLADE).toString());
	}
}