package maxy.vrs.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import maxy.vrs.model.Vehicle;

public class VehicleRegistrationService {
	
	public BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	private Vehicle Vehicle;
	public Vehicle [] vehicleList = new Vehicle[1000];
	System.out.println("Enter Your Vehicle Brand: ");
	String brand=br.readLine();
	
	

}
