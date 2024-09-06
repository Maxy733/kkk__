package maxy.vrs.services;
import java.io.IOException;

import maxy.vrs.model.Truck;
import maxy.vrs.model.Vehicle;


public class TruckRegistrationService extends VehicleRegistrationService{
	
	public Truck getAddInfo() throws IOException {
		Vehicle vehicle= getInfo();
		System.out.println("Enter your maximum capacity: ");
		int maxCap=Integer.parseInt(br.readLine());
		Truck truck = new Truck(vehicle.getBrand(),vehicle.getModel(),maxCap);
		vehicleList.add(truck);
		return truck;
		
	}
    
}
