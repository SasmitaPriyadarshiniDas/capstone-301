package com.mindtree.booking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "seat")
public class Seat {

	@Id

	private long seat_id;

	private char row_id;

	private int row_number;

	private long screen_id;
	

	public long getSeat_id() {
		return seat_id;
	}

	public void setSeat_id(long seat_id) {
		this.seat_id = seat_id;
	}

	public char getRow_id() {
		return row_id;
	}

	public void setRow_id(char row_id) {
		this.row_id = row_id;
	}

	public int getRow_number() {
		return row_number;
	}

	public void setRow_number(int row_number) {
		this.row_number = row_number;
	}

	public long getScreen_id() {
		return screen_id;
	}

	public void setScreen_id(long screen_id) {
		this.screen_id = screen_id;
	}
	
	
}
