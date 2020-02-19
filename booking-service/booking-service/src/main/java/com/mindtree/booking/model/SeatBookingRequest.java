package com.mindtree.booking.model;

public class SeatBookingRequest {
	
	private String seatHoldId;
    private String customerEmail;
    
    
	public String getSeatHoldId() {
		return seatHoldId;
	}
	public void setSeatHoldId(String seatHoldId) {
		this.seatHoldId = seatHoldId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
    
    

}
