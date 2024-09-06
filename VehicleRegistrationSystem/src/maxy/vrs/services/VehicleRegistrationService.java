package maxy.vrs.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import maxy.vrs.model.Vehicle;

public class VehicleRegistrationService {
	
	public BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	public static List<Vehicle> vehicleList = new ArrayList<>();
	
	public Vehicle getInfo() throws IOException {
		System.out.println("Enter Your Vehicle Brand: ");
		String brand=br.readLine();
		System.out.println("Enter Your Vehicle Model: ");
		String model=br.readLine();
		return new Vehicle(brand,model);
		
		
	}
	
	public static void displayAllInfo() {
		for (Vehicle vehicle:vehicleList) {
			vehicle.displayInfo();
			System.out.println("-----------------");
			System.out.println();
			
		}
		
		
		
		
	}
	
	

}
