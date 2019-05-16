package JavaPrograms;

public class PrintPrimeNumber
{

  public static void main (String[] args)
   {
	
	  int i =0;
	  int num =0;
	  
	  String primeNumber="";
	  
	  for (i=1; i<=100 ; i++)
	  {
		  int counter = 0;
		  for (num = i; num >=1 ; num--)
		  {
			  if(i%num ==0)
			  {
				  counter ++;
			  }
		  }
		  
		  if(counter == 2)
		  {
			  primeNumber=primeNumber + i+ " ";
		  }
	  }
	System.out.println("Prime numbers from 1 to 100 are :");
    System.out.println(primeNumber);
	
   }

}
