package com.mindtree.booking.model;

public class SeatBookingResponse {

	private  int seatHoldId;
	private  String customerEmail;
	private  String confirmationCode;
	
	public int getSeatHoldId() {
		return seatHoldId;
	}
	
	public String getCustomerEmail() {
		return customerEmail;
	}
	
	public String getConfirmationCode() {
		return confirmationCode;
	}

	@Override
	public String toString() {
		return "SeatBookingResponse [seatHoldId=" + seatHoldId + ", customerEmail=" + customerEmail
				+ ", confirmationCode=" + confirmationCode + "]";
	}
	
	
	
	
	

}
