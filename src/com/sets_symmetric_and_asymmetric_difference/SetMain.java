package com.sets_symmetric_and_asymmetric_difference;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {

		Set<String> words = new HashSet<>();
		String sentence = "one day in the year of the fox";
		String[] arrayWords = sentence.split(" ");
		words.addAll(Arrays.asList(arrayWords)); // this is how you get a set of strings

		Set<String> nature = new HashSet<>();
		String natureString = "all nature is but art unknown to thee";
		String[] natureWords = natureString.split(" ");
		nature.addAll(Arrays.asList(natureWords));

		Set<String> divine = new HashSet<>();
		String divineString = "to err is human to forgive divine";
		String[] divineWords = divineString.split(" ");
		divine.addAll(Arrays.asList(divineWords));


		//Asymmetric difference
		System.out.println("\nnature - divine");
		Set<String> diff1 = new HashSet<>(nature); //new set is needed as it operates on the set and changes the set itself.
		diff1.removeAll(divine);  //diff1 - divine  //asymmetric difference
		printSet(diff1);

		System.out.println("\n\ndivine - nature");
		Set<String> diff2 = new HashSet<>(divine);
		diff2.removeAll(nature); //diff2 - nature //asymmetric difference
		printSet(diff2);


		//Symmetric Difference
		Set<String> unionTest = new HashSet<>(nature);
		unionTest.addAll(divine);  //now contains nature U divine
		Set<String> intersectionTest = new HashSet<>(nature);
		intersectionTest.retainAll(divine);
		//Symmetric Difference is removing the intersection fromm the union
		// A U B - A intersection B
		unionTest.removeAll(intersectionTest);
		System.out.println("\n\nSymmetric Difference : ");
		printSet(unionTest);
	}

	private static void printSet(Set<String> set) {
		System.out.print("\t");
		for (String s : set) {
			System.out.print(s + " ");
		}
	}
}
