package programming.com;

import java.util.Scanner;

public class FibonacciSeries {
	
	/*
	 * Fibonacci Series - Sum of two preceding numbers
	 */
	
	public void Series()
	{
		int num1=0;
		int num2=0;
		int num3=1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		
		int numOutput = scan.nextInt();
		
		scan.close();
		
		for (int i=1; i<=numOutput; i++)
		{
			num1=num2;
			num2=num3;
			num3=num1+num2;
			System.out.print(num1+ " ");
		}
	}

	public static void main(String[] args) {
			
		FibonacciSeries object = new FibonacciSeries();
		object.Series();
	}	
}
