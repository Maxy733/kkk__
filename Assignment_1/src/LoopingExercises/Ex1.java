package LoopingExercises;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(Sum(10));

	}
	
	public static int Sum(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
			
		}
		return sum;
	}

}
