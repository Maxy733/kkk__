package maxy.vrs.services;
import java.io.IOException;

import maxy.vrs.model.Motorcycle;
import maxy.vrs.model.Vehicle;


public class MotorCycleRegistrationService extends VehicleRegistrationService{
	
	public Motorcycle getAddInfo() throws IOException {
		Vehicle vehicle= getInfo();
		System.out.println("Does it have sidecar? (Yes/No) ");
		boolean sideCar;
		if (br.readLine().equalsIgnoreCase("yes")) {
			sideCar=true;
		}
		else {
			sideCar=false;
		}
		Motorcycle cycle = new Motorcycle(vehicle.getBrand(),vehicle.getModel(),sideCar);
		vehicleList[vehicleCount] = cycle;
		vehicleCount++;
		return cycle;
		
	}

}
