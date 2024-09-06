package maxy.vrs.model;

public class Vehicle {
	private String model;
	private String brand;
//	private static int count=0;
	public Vehicle(String model,String brand) {
		this.model=model;
		this.brand=brand;
//		count++;
		
	}
	
	public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
	public void displayInfo() {
		System.out.println("Brand Name: "+this.brand);
		System.out.println("Model Name: "+this.model);
		
	}
	/*public static int getCount() {
		// TODO Auto-generated method stub
		return count;
	}*/

}
