package com.collections_and_builtin_binary_search;

public class Main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("ShakespeareZoned", 8, 12);
		theatre.getSeat();
		if(theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Seat is taken");
		}
		if(theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Seat is taken");
		}
	}
}
