package com.infy.Repository;

import org.springframework.stereotype.Repository;

import com.infy.entity.Flight;


public interface FlightRepository {

	public void insert();
	public Flight search(int fid);
}
