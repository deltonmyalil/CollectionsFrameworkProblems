package com.map_init;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>(); //<key, value>
		languages.put("Java", "compiled/interpreted HLL OOL");
		languages.put("Python", "Interpreted, OOL, HLL, dynamic semantics");
		languages.put("C", "Compiled HLL, also MLL");
		languages.put("BASIC", "Beg All Pur Symb Ins Code");
		languages.put("lisp", "((())()()))(helloWorld)))()()))");

		//pretty much like python dict I guess

		System.out.println(languages.get("Python"));
		languages.put("Python", "I just overwrote the earlier value"); //Repeated put() on the same key will overwrite the existing value.
		System.out.println(languages.get("Python"));

		System.out.println(languages.put("Java", "Overwritten description about Java"));//this will give the existing value as return then overwrite the existing value
		//if there was no existing value, it would return null

		if (languages.containsKey("Java")) {
			System.out.println("Java is already in the Map");
		}
		System.out.println("\nPrinting the entire map:");
		int i = 0;
		for (String key : languages.keySet()) {
			i++;
			System.out.println(i + ". " + key + " : " + languages.get(key));
		} //Note that this prints the hashmap in no particular order

		String python = languages.remove("Python");// remove() is overloaded: one parameter - key only and two parameters: Key:value pair
		System.out.println(python); //remove() also returns the value associated with the key
	}
}
