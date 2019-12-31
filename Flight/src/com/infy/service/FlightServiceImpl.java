package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infy.Repository.FlightRepository;
import com.infy.entity.Flight;

@Component(value = "flightService")
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository repository;
	
	

	@Override
	public void addFlight() {
		
		repository.insert();
	}

	@Override
	public Flight searchFlight(int id) {
		
		return repository.search(id);
	}

}
