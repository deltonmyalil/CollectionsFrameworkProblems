package com.collections_init_using_arraylist;

public class Seat {
	private final String seatNumber;
	private boolean reserved = false;

	public Seat(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean reserve() {
		if(!this.reserved) {
			this.reserved = true;
			System.out.println("Seat " + seatNumber + " reserved");
			return true;
		} else {
			return false;
		}
	}

	public boolean cancel() {
		if(this.reserved) {
			this.reserved = false;
			System.out.println("Reservation for " + seatNumber + " is cancelled");
			return true;
		} else {
			return false;
		}
	}

	public String getSeatNumber() {
		return seatNumber;
	}
}
