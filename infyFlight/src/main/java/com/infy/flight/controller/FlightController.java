package com.infy.flight.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.flight.dto.FlightDTO;
import com.infy.flight.entity.Flight;
import com.infy.flight.service.FlightService;

@RestController
public class FlightController {

	Logger logger =LoggerFactory.getLogger(FlightController.class);
	@Autowired
	private FlightService flightService;
	
	@RequestMapping(value = "/addFlight", method = RequestMethod.POST, consumes  = "application/json")
	public Flight addFlight(@RequestBody FlightDTO flightDTO) {
	
		Flight fl = flightDTO.convertToEntity();
		flightService.insertFlight(fl);
		logger.info("Flight Added...");
		return fl;
	}
	
	@RequestMapping(value = "/getAllFlight", method = RequestMethod.GET)
	public List <Flight> getListOfFlight() {
		
		List<Flight> flightList = flightService.getAllFlight();
		logger.info("List of Flight fetched...");
		return flightList ;
	}
	
	@RequestMapping(value = "/getSingleFlight/{id}")
	@ResponseBody
	public Flight getFlight(@PathVariable("id") Integer id) {
		
		flightService.getFlight(id);
		return null;
	}
	
	@RequestMapping(value = "/deleteFlight/{id}", method = RequestMethod.DELETE)
	public void deleteFlight(@PathVariable("id") int id) {
		logger.info("Flight Deleted with Id :"+id+" Successfully");
		
		
		flightService.removeFlight(id);
		
	}
}
