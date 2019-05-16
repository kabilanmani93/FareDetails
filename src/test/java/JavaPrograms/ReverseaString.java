package JavaPrograms;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) 
	{
		System.out.println("Enter a String: ");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		
		//--------------------
		String rev="";		
		for (int i = str.length()-1 ;i >= 0; i-- )
		{
			rev = rev+str.charAt(i);
		}
		System.out.println("reversed string is " + rev);
		
		//-----------------
		str = "Hello I'm your String";
		String rev1="";	
		String[] splited = str.split("\\s+");
		for (int i = splited.length-1 ;i >=0; i-- )
		{
									
			if(i==0)
			{
				rev1 = rev1+splited[i];	
			}
			else
			{
			    rev1 = rev1+splited[i]+" ";
			}
			
		}
		System.out.println("reversed string is " + rev1);
		
		
		
	}
}
