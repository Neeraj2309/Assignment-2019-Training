package com.infy.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.infy.entity.Flight;

@Component
public class FlightRepositoryImpl implements FlightRepository{
	Flight flight = new Flight();
	public Flight populateRepo() {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter Flight Id = " );
		int flightId= scan.nextInt();
		flight.setFlightId(flightId);
		
		System.out.println("Enter Airlines Name = " );
		String airlines= scan.next();
		flight.setAirlines(airlines);
		
		System.out.println("Enter Flight Source = " );
		String flightSource= scan.next();
		flight.setSource(flightSource);

		System.out.println("Enter Flight Destination = " );
		String flightDestiation= scan.next();
		flight.setDestination(flightDestiation);
		
		System.out.println("Enter Seat Count  = " );
		int seat= scan.nextInt();
		flight.setSeatCount(seat);
		
		List<Flight> flightList = new ArrayList<Flight>();
		flightList.add(flight);
		
	return flight;
	}
	@Override
	public void insert() {
		Flight fl = populateRepo();
		System.out.println("Flight Added with content-->"+fl);
	}

	@Override
	public Flight search(int fid) {
		System.out.println("Inside Search of Service...");
		
		return flight;
	}

	
}
