package maxy.vrs.main;
import maxy.vrs.model.*;
import maxy.vrs.services.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String txt = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			
			System.out.println("Select your vehicle type (car,motorcycle,truck): ");
			String type=br.readLine();
			
			
			if (type.equalsIgnoreCase("car")) {
				CarRegistrationService serviceType= new CarRegistrationService();
				Car car=serviceType.getAddInfo() ;
				car.displayInfo();
			}
			else if (type.equalsIgnoreCase("motorcycle")) {
				MotorCycleRegistrationService serviceType= new MotorCycleRegistrationService();
				Motorcycle cycle=serviceType.getAddInfo() ;
				cycle.displayInfo();
			}
			else if (type.equalsIgnoreCase("truck")) {
				TruckRegistrationService serviceType= new TruckRegistrationService();
				Truck truck=serviceType.getAddInfo() ;
				truck.displayInfo();
			}
				
			
			System.out.println("Do u want to add another vehicle (yes/no) ? ");
			txt = br.readLine();
			
			
		}while (txt.equalsIgnoreCase("yes"));
		VehicleRegistrationService.displayAllInfo();
		

	}

}
