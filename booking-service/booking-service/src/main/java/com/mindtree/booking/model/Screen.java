package com.mindtree.booking.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "screen")
public class Screen {

	@Id
	private long screenId;

	private long theatreId;

	private int seatsNum;

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public long getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}

	public int getSeatsNum() {
		return seatsNum;
	}

	public void setSeatsNum(int seatsNum) {
		this.seatsNum = seatsNum;
	}
	
	

}
