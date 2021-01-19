package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMissingNumber {

	//problem1: unsorted array [3,4,9,5] and [9,5,4] if only  number is missing use xor option and the size is less by 1
	//problem2 : either array 1 can be big or array 2 can be big
	// one method to find the missing number by passing the highest array findmissingnumberutil(arr1,arr2,n) arr1 is larger and n is length of larger array
	//before calling the til define the biggest array.
	// sorted array use binary low=0, high =n-1 , mid =low+high/2.


	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,3,4,7,6};
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
		
		//store the element in Hashset
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
