package com.collections_and_builtin_binary_search;

//import java.util.*;

import java.util.*;

public class Theatre {
	private final String theatreName;
	//	private Collection<Seat> seats = new HashSet<>();  //Seats displayed out of order
//	private Collection<Seat> seats = new LinkedList<>();  //In order
	private List<Seat> seats = new ArrayList<>(); //in order
	private int numRows;
	private int seatsPerRow;

	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		this.theatreName = theatreName;
		this.numRows = numRows;
		this.seatsPerRow = seatsPerRow;
		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}

	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat>=0) {
			return seats.get(foundSeat).reserve();
		} else {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
		/*for (Seat seat : seats) {
			if (seat.getSeatNumber().equals(seatNumber)) {
				requestedSeat = seat;
				break;
			}
		}
		if (requestedSeat == null) {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
		return requestedSeat.reserve();*/   //Commented out linear search section in favor of binary search
	}

	public void getSeat() {  //This is not a getter
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

//	public void getSeatsRepresentation() {
//		for (int i = 1; i <= seats.size(); i++) {
//			System.out.print(seats.get(i - 1).getSeatNumber()+ " ");
//			if (i % seatsPerRow == 0)
//				System.out.println();
//		}
//	}
}
