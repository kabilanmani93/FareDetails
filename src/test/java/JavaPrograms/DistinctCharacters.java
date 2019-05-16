package JavaPrograms;

public class DistinctCharacters
{
	
    static final int NO_OF_CHARS = 256; 
	       
	    /* Print duplicates present in the passed string */
	    static void printDistinct(String str) 
	    { 
	        int[] count = new int[NO_OF_CHARS];
	        
	        int i;
	        for (i=0;i<str.length();i++)
	        {
	        	if(str.charAt(i)!= ' ')
	        	{
	        		count[str.charAt(i)]++;
	        	}
	        	 
	        }
	        int n=i;
	        
	        
	        for (i=0;i<n;i++)
	        {
	          if(count[str.charAt(i)]==1)
	          {
	        	  System.out.print(str.charAt(i));
	          }
	        }
	        
	        
	    } 
	    
	    //count distint java 8
	    public static long countUniqueCharacters(String input)
	    {
	        return input.chars().distinct().count();
	    }
	       
	    /* Driver program*/
	    public static void main(String args[]) 
	    { 
	        String str = "GeeksforGeekso"; 
	        System.out.println("The count is " + countUniqueCharacters(str) );
	        printDistinct(str); 
	    } 
	} 

