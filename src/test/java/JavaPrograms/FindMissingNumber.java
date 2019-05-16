package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,3,4,6};
		int m = a.length;
		int n = b.length;
		
		List<Integer> Output = findMissingNumber(a,b,m,n);
		System.out.println(Output);
		
		List<Integer> Output1 = findMatchingNumber(a,b,m,n);
		System.out.println(Output1);

	}
	
	public static List<Integer> findMatchingNumber(int[] a, int[] b, int m, int n)
	{
		List<Integer> MatchingNumber = new ArrayList<Integer>();
		
		for(int i =0; i<m ; i++)
		{
			for(int j =0; j<n ; j++)
			{
				if(a[i] == b[j]) // important if you find it break it 
				{
					break;
				}
				else if (a[i] != b[j] && j==n-1)		
				{
					MatchingNumber.add(a[i]);
				}
				
			}
		}
		
		return MatchingNumber;
		
	}
	
	public static List<Integer> findMissingNumber(int[] a, int[] b, int m, int n)
	{
		List<Integer> MissingNumber = new ArrayList<Integer>();
		
		//store the element in Hasset
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i =0; i<n ; i++)
		{
			s.add(b[i]);
		}
		
		for(int i =0; i<m ; i++)
		{
			if(!s.contains(a[i]))
			{
				MissingNumber.add(a[i]);
			}
									
		}
		
		return MissingNumber;
		
	}


}
