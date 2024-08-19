package com.example.model;

public class FullTimeEmployee extends Employee{

	private double allowance;
	private double bonus;
	private static int count=0;
	
	public FullTimeEmployee(String name, int id, double basicSalary,double allowance, double bonus) {
		super(name,id,basicSalary);
		this.allowance=allowance;
		this.bonus=bonus;
		count++;
		
	}
	
	public static int getCount() {
		return count;
	}
		
	@Override
	public double calculateSalary() {
		return this.getBasicSalary()+this.allowance+this.bonus;
	}
	@Override
	public void display() {
		System.out.println("***** Full Time Employee *****");
		super.display();
		System.out.println("Full Time Employees Count: "+getCount());
		System.out.println();
	}
	
}
