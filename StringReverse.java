package programming.com;

import java.util.Scanner;

public class StringReverse {
	
	public static void method1()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String input = scan.next();
		
		char[] charArr = input.toCharArray();
		int length = charArr.length;
		System.out.println("String Length : "+length);
		
		for (int i=length-1; i>=0; i--)
		{
			System.out.print(charArr[i]);
		}
		
		scan.close();
	}
	
	public static void method2()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Name : ");
		String input = scan.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		String ReverseString = sb.reverse().toString();
		System.out.println("Reverse String : "+ReverseString);
		
		scan.close();
	}

	public static void main(String[] args) {

		method2();
		
	}

}
