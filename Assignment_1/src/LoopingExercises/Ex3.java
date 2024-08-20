package LoopingExercises;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=scan.nextInt();
		scan.close();
		System.out.println("Multiplication Table for "+num);
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
	}

}
