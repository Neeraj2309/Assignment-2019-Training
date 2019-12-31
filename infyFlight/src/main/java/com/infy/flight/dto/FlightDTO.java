package com.infy.flight.dto;

import com.infy.flight.entity.Flight;

public class FlightDTO {

	private int flightId;
	private String airlinesName;
	private String flightSource;
	private String flightDestination;
	private int seatCount;
	
	public FlightDTO() {
		
	}
	
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
	public int getSeatCount() {
		return seatCount;
	}
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	//convert entity object to DTO
	
	public FlightDTO convertToDTO(Flight flight) {
		FlightDTO flightDTO = new FlightDTO();
		
		flightDTO.setFlightId(flight.getFlightId());
		flightDTO.setAirlinesName(flight.getAirlinesName());
		flightDTO.setFlightDestination(flight.getFlightDestination());
		flightDTO.setFlightSource(flight.getFlightSource());
		flightDTO.setSeatCount(flight.getSeatCount());
		
		return flightDTO;
	}
	
	//convert DTO object to entity
	
	public Flight convertToEntity() {
		Flight flight = new Flight();
		
		flight.setFlightId(this.flightId);
		flight.setAirlinesName(this.airlinesName);
		flight.setFlightSource(this.flightSource);
		flight.setFlightDestination(this.flightDestination);
		flight.setSeatCount(this.seatCount);
		
		return flight;
	}

	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", airlinesName=" + airlinesName + ", flightSource=" + flightSource
				+ ", flightDestination=" + flightDestination + ", seatCount=" + seatCount + "]";
	}
	
	
	
}
