package com.infy.entity;

import org.springframework.stereotype.Component;

@Component("flight")
public class Flight {

	private int flightId;
	private String airlines;
	private String source;
	private String destination;
	private int seatCount;
	
	public Flight() {
		
	}
	
	public Flight(int flightId, String airlines, String source, String destination, int seatCount) {
		super();
		this.flightId = flightId;
		this.airlines = airlines;
		this.source = source;
		this.destination = destination;
		this.seatCount = seatCount;
	}


	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlines=" + airlines + ", source=" + source + ", destination="
				+ destination + ", seatCount=" + seatCount + "]";
	}
	
	
	
}
