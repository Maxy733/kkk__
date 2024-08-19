package com.example.model;

public class Employee {
	
	private String name;
	private int id;
	private double basicSalary;
	private static int count=0;
	
	public Employee(String name, int id, double basicSalary) {
		
		this.name=name;
		this.id=id;
		this.basicSalary=basicSalary;
		count++;
		
		
	}
	public double calculateSalary() {
		
		return this.basicSalary;
	}
	
	//Getter for Private
	
	public double getBasicSalary() {
		return this.basicSalary;
		
	}
	public static int getCount() {
		return count;
		
	}
	
	public void display()
	{
		
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee ID: "+this.id);
		System.out.println("Basic Salary: "+this.basicSalary);
		System.out.println("Actual Salary: "+this.calculateSalary());
		
	}
		
	

}
