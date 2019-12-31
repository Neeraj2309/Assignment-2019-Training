package com.infy.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.flight.entity.Flight;
import com.infy.flight.repository.FlightRepository;

@Service("flightserv")
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository repository;
	
	@Override
	public Flight insertFlight(Flight flight) {
		
		Flight fl= repository.save(flight);
		return fl;
	}

	@Override
	public void removeFlight(int id) {
		
		repository.deleteById(id);
	}

	@Override
	public String updateFlight(Flight id) {
		return null;
	}

	@Override
	public List<Flight> getAllFlight() {
		
		return repository.findAll();
	}

	@Override
	public void getFlight(Integer id) {
		Optional<Flight> flight = Optional.empty();
		flight=repository.findById(id);
		
		;
	}

}
