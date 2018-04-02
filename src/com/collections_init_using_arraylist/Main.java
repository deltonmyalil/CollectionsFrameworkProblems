package com.collections_init_using_arraylist;

public class Main {
	public static void main(String[] args) {
		Theatre theatre = new Theatre("ShakespeareZoned", 8, 12);
//		theatre.getSeat();
		theatre.getSeatsRepresentation();
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
