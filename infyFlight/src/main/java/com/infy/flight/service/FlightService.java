package com.infy.flight.service;

import java.util.List;

import com.infy.flight.entity.Flight;

public interface FlightService {

	public Flight insertFlight(Flight flight);
	public void removeFlight(int id);
	public String updateFlight(Flight id);
	public List<Flight> getAllFlight();
	public void getFlight(Integer id);
}
