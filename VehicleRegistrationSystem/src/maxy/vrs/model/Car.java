package maxy.vrs.model;

public class Car extends Vehicle{
	private int doors;
	
	public Car(String model,String brand,int doors) {
		super(model,brand);
		this.doors=doors;
		
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of Doors: "+this.doors);
		
	}
	

}
