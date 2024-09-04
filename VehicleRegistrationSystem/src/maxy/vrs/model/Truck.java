package maxy.vrs.model;

public class Truck extends Vehicle{
	private int payLoadCapacity;
	public Truck(String model,String brand,int payLoadCapacity) {
		super(model, brand);
		this.payLoadCapacity=payLoadCapacity;
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Pay Load Capacity: "+this.payLoadCapacity);
	}

}
