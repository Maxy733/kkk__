package maxy.vrs.model;

public class Vehicle {
	private String model;
	private String brand;
	public Vehicle(String model,String brand) {
		this.model=model;
		this.brand=brand;
		
	}
	public void displayInfo() {
		System.out.println("Model Name: "+this.model);
		System.out.println("Brand Name: "+this.brand);
	}

}
