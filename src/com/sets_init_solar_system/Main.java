package com.sets_init_solar_system;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();  //Replace with LinkedHashMap to preserve order of insertion
	private static Set<HeavenlyBody> planets = new HashSet<>();  //Replace with LinkedHashSet to preserve order of insertion

	public static void main(String[] args) {
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);  //Last temp value is Earth

		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);  // Adding Moon to earth (temp)

		temp = new HeavenlyBody("Mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Deimos", 1.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		tempMoon = new HeavenlyBody("Phobos", 0.3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		temp = new HeavenlyBody("Jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Io", 1.8);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Europa", 3.5);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Ganymede", 7.1);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Callisto", 16.7);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		temp = new HeavenlyBody("Saturn", 10759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Uranus", 30660);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Neptune", 165);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Pluto", 248);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		System.out.println("Planets");
		for (HeavenlyBody planet : planets) {
			System.out.println("\t" + planet.getName());
		}

		HeavenlyBody body = solarSystem.get("Jupiter");
		System.out.println("Moons of " + body.getName());
		for (HeavenlyBody jupiterMoons : body.getSatellites()) {
			System.out.println("\t" + jupiterMoons.getName());
		}

		body = solarSystem.get("Mars");
		System.out.println("Moons of " + body.getName());
		for (HeavenlyBody marsMoons : body.getSatellites()) {
			System.out.println("\t" + marsMoons.getName());
		}

		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatellites());
		}
		System.out.println("All moons");
		for (HeavenlyBody moon : moons) {
			System.out.println("\t" + moon.getName());
		}

		HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
		planets.add(pluto); // this adds another pluto to the planets set. Note that the two plutos are not the same object despite the name

		for (HeavenlyBody planet : planets) {
			System.out.println(planet.getName() + " : " + planet.getOrbitalPeriod());
		}
	}
}
