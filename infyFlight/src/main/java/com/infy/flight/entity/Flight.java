package com.infy.flight.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "INFY_FLIGHT")
public class Flight {

	@Id
	@Column(name = "FLIGHT_ID")
	private int flightId;
	
	@Column(name = "AIRLINES_NAME")
	private String airlinesName;
	
	@Column(name = "FLIGHT_SOURCE")
	private String flightSource;
	
	@Column(name = "FLIGHT_DESTINATION")
	private String flightDestination;
	
	/*
	 * @Column(name = "JOURNEY_DATE") private Date journeyDate;
	 */
	
	@Column(name = "NO_OF_SEATS")
	private int seatCount;
		
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlinesName() {
		return airlinesName;
	}
	public void setAirlinesName(String airlinesName) {
		this.airlinesName = airlinesName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}

	/*
	 * public Date getJourneyDate() { return journeyDate; } public void
	 * setJourneyDate(Date journeyDate) { this.journeyDate = journeyDate; }
	 */
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlinesName=" + airlinesName + ", flightSource=" + flightSource
				+ ", flightDestination=" + flightDestination + ", seatCount="
				+ seatCount + "]";
	}
	
	
	
}
