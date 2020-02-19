package com.mindtree.booking.model;

import java.security.Timestamp;
import java.util.List;

public class SeatHold {
	
	private long id;
    private long customerId;
    private Timestamp holdTime;
    private String customerEmail;
    private String bookingCode;
    private Timestamp bookingTime;
    private List<Seat> seatBookings;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Timestamp getHoldTime() {
		return holdTime;
	}
	public void setHoldTime(Timestamp holdTime) {
		this.holdTime = holdTime;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getBookingCode() {
		return bookingCode;
	}
	public void setBookingCode(String bookingCode) {
		this.bookingCode = bookingCode;
	}
	public Timestamp getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Timestamp bookingTime) {
		this.bookingTime = bookingTime;
	}
	public List<Seat> getSeatBookings() {
		return seatBookings;
	}
	public void setSeatBookings(List<Seat> seatBookings) {
		this.seatBookings = seatBookings;
	}
    
    

}
