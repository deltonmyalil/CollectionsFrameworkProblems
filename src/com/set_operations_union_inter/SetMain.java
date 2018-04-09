package com.set_operations_union_inter;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();

		for (int i = 1; i <= 100; i++) {
			squares.add(i * i);
			cubes.add(i * i * i);
		}
		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
		Set<Integer> unionSet = new HashSet<>(squares);
		unionSet.addAll(cubes);  // add all does adding two sets with duplelim
		System.out.println("Union contains " + unionSet.size() + " elements");

		Set<Integer> intersectionSet = new HashSet<>(squares);
		intersectionSet.retainAll(cubes); // retainAll does intersection: syntax: setA.retainAll(setB), result is stored in setA
		System.out.println("Intersection contains " + intersectionSet.size() + " elements");

		for (int i : intersectionSet) {
			System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
		}
	}
}
