package com.infy.service;

import org.springframework.stereotype.Component;

import com.infy.entity.Flight;

@Component
public interface FlightService {

	public void addFlight();
	public Flight searchFlight(int id);
}
