package programming.com;

import java.util.Scanner;

public class StarProgram {

	public static void method1()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Limit : ");
		int limit = scan.nextInt();
		
		for (int i=1; i<=limit; i++)
		{
			for (int j=0; j<=limit; j++)
			{
				if (i>j) 
				{
					System.out.print("*");
				}
			}
			
			System.out.println();	
		}
		
		scan.close();
	}
	
	public static void method2()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Limit : ");
		int limit = scan.nextInt();
		
		for (int i=1; i<=limit; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();	
		}
		
		scan.close();
	}
	
	public static void main(String[] args) {
	
		method2();
	}
}
