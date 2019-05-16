package JavaPrograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		System.out.println("Enter a Number: ");
		Scanner value = new Scanner(System.in);
		int p = value.nextInt();
		value.close();		
		
		System.out.println("Factorial of Number " + p + " is : " + factorial_No(p));

	}
	
	static int factorial_No(int n)
	{
	
		if (n==0) return 1;
		
		else return (n*factorial_No(n-1));
			
	}

}
