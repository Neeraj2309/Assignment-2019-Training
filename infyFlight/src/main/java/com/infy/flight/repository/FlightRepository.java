package com.infy.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.flight.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

	
	
}
