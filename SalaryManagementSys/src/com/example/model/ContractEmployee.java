package com.example.model;

public class ContractEmployee extends Employee{
	
	private int contractDuration;
	private double contractAmount;
	private static int count=0;
	
	public ContractEmployee(String name, int id, double basicSalary,int contractDuration,double contractAmount){
		
		super(name,id,basicSalary);
		this.contractDuration=contractDuration;
		this.contractAmount=contractAmount;
		count++;
		
		
	}
	public static int getCount() {
		return count;
		
	}
	@Override
	public double calculateSalary() {
		return this.contractAmount/this.contractDuration;
	}
	@Override
	public void display() {
		System.out.println("***** Contract Employee *****");
		super.display();
		System.out.println("Contract Employee Count: "+getCount());
		System.out.println();
		
	}

}
