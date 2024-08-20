package LoopingExercises;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num=scan.nextInt();
		scan.close();
		System.out.print("The factorial is "+fact(num));
	}
	public static int fact(int num) {
		if(num==0||num==1) {
			return 1;
		}
		else
			return num*fact(num-1);
	}

}
