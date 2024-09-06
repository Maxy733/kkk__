package maxy.vrs.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;

import maxy.vrs.model.Vehicle;

public class VehicleRegistrationService {
	
	public BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static Vehicle[] vehicleList = new Vehicle[1000];
	protected static int vehicleCount = 0;
	
	public Vehicle getInfo() throws IOException {
		System.out.println("Enter Your Vehicle Brand: ");
		String brand=br.readLine();
		System.out.println("Enter Your Vehicle Model: ");
		String model=br.readLine();
		return new Vehicle(brand,model);
		
		
	}
	
	public static void displayAllInfo() {
		System.out.println("REGISTERED VEHICLES LIST:");
		for (int i=0;i<vehicleCount;i++) {
			vehicleList[i].displayInfo();
			System.out.println("-----------------");
			System.out.println();
			
		}
		
		
		
		
	}
	
	

}
