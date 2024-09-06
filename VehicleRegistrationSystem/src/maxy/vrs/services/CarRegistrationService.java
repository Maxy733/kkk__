package maxy.vrs.services;
import java.io.IOException;

import maxy.vrs.model.Car;
import maxy.vrs.model.Vehicle;


public class CarRegistrationService extends VehicleRegistrationService{
	
	public Car getAddInfo() throws IOException {
		Vehicle vehicle= getInfo();
		System.out.println("Enter the number of doors: ");
		int doors=Integer.parseInt(br.readLine());
		Car car=new Car(vehicle.getBrand(),vehicle.getModel(),doors);
		vehicleList[vehicleCount] = car;
		vehicleCount++;
		return car;
		
	}
    
}
