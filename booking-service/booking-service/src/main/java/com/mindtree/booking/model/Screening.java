package com.mindtree.booking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "screening")
public class Screening {

	@Id

	private long screeningId;

	private long theatreId;

	private long screenId;

	private String movieName;

	private java.sql.Date screeningDate;

	private java.sql.Time screeningTime;

	private int bookedTickets;

	public long getScreeningId() {
		return screeningId;
	}

	public void setScreeningId(long screeningId) {
		this.screeningId = screeningId;
	}

	public long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public java.sql.Date getScreeningDate() {
		return screeningDate;
	}

	public void setScreeningDate(java.sql.Date screeningDate) {
		this.screeningDate = screeningDate;
	}

	public java.sql.Time getScreeningTime() {
		return screeningTime;
	}

	public void setScreeningTime(java.sql.Time screeningTime) {
		this.screeningTime = screeningTime;
	}

	public int getBookedTickets() {
		return bookedTickets;
	}

	public void setBookedTickets(int bookedTickets) {
		this.bookedTickets = bookedTickets;
	}
	
	

}
