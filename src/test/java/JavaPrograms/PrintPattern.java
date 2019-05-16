package JavaPrograms;
import java.util.Scanner;

public class PrintPattern 
{
	public static void main (String[] args)
	{
		System.out.println("Enter the value of N : ");
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		read.close();
		
		printSimplePattern(n);
		printSimplePattern_Same(n);
		
		int a = 10;
		int b = 20;

		// Tedious string concatenation.
		System.out.println("a: " + a + " b: " + b);

		// Output using string formatting.
		System.out.printf("a: %d b: %d\n", a, b);
		
	}



	static void printSimplePattern(int n)
	{
		int i,j,k=1;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<i+1;j++)
			{
				System.out.print(k++ +" ");				
			}
			System.out.println();
		}
	}
	
	static void printSimplePattern_Same(int n)
	{
		int i,j,k=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(k +" ");				
			}
			k++;
			System.out.println();
		}
	}
}
