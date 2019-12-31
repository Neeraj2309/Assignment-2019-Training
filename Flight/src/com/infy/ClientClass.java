package com.infy;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.infy.service.FlightService;


public class ClientClass {

	public static void main(String[] args) {
		
		  ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		  FlightService flightServ = (FlightService) context.getBean("flightService");

		int choice = 0;

		System.out.println("*************************Menu*****************************:");
		System.out.println("1. Add Flight");
		System.out.println("2. Search Flight");
		System.out.println("**********************************************************");
		System.out.println("Enter Your Choice:: ");
		Scanner scanner = new Scanner(System.in);
		choice = scanner.nextInt();
		
		switch(choice) {
		case 1:{
			flightServ.addFlight();
			
			break;
		}

		case 2:{
			System.out.println("Enter the Flight Id to search....");
			Scanner scan = new Scanner(System.in);
			int fid = scan.nextInt();
			flightServ.searchFlight(fid);
			break;
		}
		default:
			System.out.println("Wrong Choice....");
		}

	}
}
