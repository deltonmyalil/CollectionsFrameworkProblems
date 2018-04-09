package com.sets_containsAll_superset_test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {

		Set<String> nature = new HashSet<>();
		String natureString = "all nature is but art unknown to thee";
		String[] natureWords = natureString.split(" ");
		nature.addAll(Arrays.asList(natureWords));

		Set<String> divine = new HashSet<>();
		String divineString = "to err is human to forgive divine";
		String[] divineWords = divineString.split(" ");
		divine.addAll(Arrays.asList(divineWords));

		if(nature.containsAll(divine)) {
			System.out.println("divine is a subset of nature");
		} //A.containsAll(B) checks if A is superset of B ie B is a subset of A

		Set<String> intersectionTest = new HashSet<>(nature);
		intersectionTest.retainAll(divine);

		if(nature.containsAll(intersectionTest)) {
			System.out.println("Intersection is a subset of nature");
		}
	}
}