package com.adventure_game;

import java.util.HashMap;
import java.util.Map;

public class Location {
	private final int locationID;
	private String description;
	private final Map<String, Integer> exits;

	public Location(int locationID, String description) {
		this.locationID = locationID;
		this.description = description;
		this.exits = new HashMap<>();
	}

	public void addExit(String direction, int location) {
		exits.put(direction, location);
	}

	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
//		return exits; // gives the actual hashmap to the main()
		return new HashMap<String, Integer>(exits); // makes a temp copy and gives it to main //better security
	}
}
