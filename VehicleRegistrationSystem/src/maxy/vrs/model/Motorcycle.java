package maxy.vrs.model;

public class Motorcycle extends Vehicle{
	private boolean hasSidecar;
	public Motorcycle(String model,String brand,boolean hasSidecar) {
		super(model,brand);
		this.hasSidecar=hasSidecar;
		
	}
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Side Car: "+this.hasSidecar);
	}

}
