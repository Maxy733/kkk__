package com.example.model;

public class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	private double hourlyRate;
	private static int count=0;
	
	public PartTimeEmployee(String name, int id, double basicSalary,int hoursWorked,double hourlyRate){
		super(name,id,basicSalary);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		count++;
	
	}
	
	public static int getCount() {
		return count;
	}
	@Override
	public double calculateSalary() {
		return this.hourlyRate+this.hoursWorked;
	}
	@Override
	public void display() {
		System.out.println("***** Part Time Employee *****");
		super.display();
		System.out.println("Part Time Employees Count: "+getCount());
		System.out.println();
	}

}
