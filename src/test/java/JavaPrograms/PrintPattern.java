package JavaPrograms;
import java.util.Scanner;

public class PrintPattern 
{
	public static void main (String[] args)
	{
//		System.out.println("Enter the value of N : ");
//		Scanner read = new Scanner(System.in);
//		int n = read.nextInt();
//		read.close();

		DownSideTriangle(5);
		UpSideTriangle(5);

		
		int a = 10;
		int b = 20;

		// Tedious string concatenation.
		//System.out.println("a: " + a + " b: " + b);

		// Output using string formatting.
		//System.out.printf("a: %d b: %d\n", a, b);

		//logic
		/*
		if there is a space that needs to be added add it first
		upside(topmost having 1 symbol) : space : n=5 : from fourth row need to add 8 spaces ={[2*(n-i)]-2}}/2
		downside: : space : n=5 : from fourth row need to add 2 spaces : 2*i/2
		 */
		
	}


	static void DownSideTriangle(int n)
	{
		//outer loop
		for (int i = 0; i <n ; i++) {

			//Add Space
			for (int k = (2*i); k > 0; k--) {
				System.out.print(" ");
			}

			//print characters
			for (int j = 0; j < n-i ; j++) {
				System.out.print("* ");
			}

			//next line
			System.out.println();

		}
	}

	static void UpSideTriangle(int n)
	{
		//outer loop
		for (int i = 0; i <n ; i++) {


			//Add Space
			for (int k = 0; k < ((2*(n-i))-2)/2; k++) {
				System.out.print(" ");
			}

			//print characters
			for (int j = 0; j <=i ; j++) {
				System.out.print("* ");
			}

			//next line
			System.out.println();

		}
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
