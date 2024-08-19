package com.example.main;
import com.example.model.ContractEmployee;
import com.example.model.Employee;
import com.example.model.FullTimeEmployee;
import com.example.model.PartTimeEmployee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Employee emp1= new PartTimeEmployee("Zaw Zaw",3433,0.0,30,1000);
				Employee emp2= new FullTimeEmployee("Ni Ni",2545,5000,0.0,500);
				Employee emp3= new ContractEmployee("Bo Bo",4565,0.0,6,60000);
				Employee emp4= new FullTimeEmployee("John",7788,3000,1000,0.0);
				
				emp1.display(); //non static
				emp2.display();
				emp3.display();
				emp4.display();
				
				System.out.println("Total Employees Count: "+Employee.getCount());//static
			
		


	}

}
