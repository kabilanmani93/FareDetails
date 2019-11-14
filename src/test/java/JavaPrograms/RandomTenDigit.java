package JavaPrograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTenDigit {
	
	static ArrayList<Character> VHnumbers;

	public static void main (String[] args)
	{
	 //Create KeyPad 4*3 array
	 
	 char keypad[][] = 
	  {
	    {'1','2','3'},
	    {'4','5','6'},
	    {'7','8','9'},
	    {'*','0','#'}
	     };
	 
	 
	 // count of row and column
	 int x = keypad.length-1;
	 int y = keypad[0].length-1;
	 
	 System.out.println("Row count is : " + x + " and " + " Col Count is : " + y );
	   
	 
	 //iterate all the Numbers of Keypad
	 /*for(int i=0; i<keypad.length; i++)
	 {
	  for (int j=0; j<keypad[i].length; j++)
	  {
	   //start Number is 
	   System.out.println("Starting Number is  " + keypad[i][j]);
	   
	   //Identify all the Vertical and Horizontal Numbers for a given index   
	   
	   
	  }
	 }*/
	 
	 
	 
	 
	 
	 for (int m=1 ; m<=10 ; m++)
	 {
	  char startnumber ='5';
	  
	  ArrayList<Character> numbers = getVHnumber(1,1,3,2,keypad);
	  System.out.println(numbers);
	  
	  char nextNum = getRandomElement(numbers);
	  
	  startnumber = (char) (startnumber+nextNum);
	  System.out.println(startnumber);
	 }
	 
	 
	}
	
	public static ArrayList<Character> getVHnumber(int i, int j, int x, int y, char[][] keypad)
	{
	 VHnumbers = new ArrayList<Character>();
	 
	 if(check(i,j,x,y))
	 {
	  //Traverse vertically downward by increasing rows till maximum number of rows
	  for(int k=i; k <= x ; k++ )
	  {
	   if(check(k+1,j,x,y))
	    VHnumbers.add(keypad[k+1][j]);
	  }
	  
	  //Traverse vertically upward by decreasing rows
	  for(int k=i; k >=0 ; k-- )
	  {
	   if(check(k-1,j,x,y))
	    VHnumbers.add(keypad[k-1][j]);
	  }
	  
	  //Traverse horizontally towards right by increasing columns
	  for(int k=j; k <= y ; k++ )
	  {
	   if(check(i,k+1,x,y))
	    VHnumbers.add(keypad[1][k+1]);
	  }
	  
	  //Traverse horizontally towards left by decreasing columns
	  for(int k=j; k >=0 ; k-- )
	  {
	   if(check(i,k-1,x,y))
	    VHnumbers.add(keypad[i][k-1]);
	  }   
	   
	 }
	 return VHnumbers;
	 

	}

	public static boolean check(int i, int j, int x, int y)
	{
	 boolean flag = false;
	 
	 if(i>=0 && j>=0 && i<=x && j <=y)
	 {
	  flag = true;
	 }
	 
	 return flag;
	 
	}

	 public static char getRandomElement(List<Character> list) 
	    { 
	        Random rand = new Random(); 
	        char random = list.get(rand.nextInt(list.size())); 
	        
	        if (random == '*' || random == '#')
	        {          
	         random= (char) (random+1);
	        }
	        
	        return random;
	    } 

	
	

}