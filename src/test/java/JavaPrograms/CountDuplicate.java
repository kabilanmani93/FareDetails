package JavaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountDuplicate
{
	public static void main(String[] args) 
	{
		List<String> list = new LinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add(2,"a");
		list.add(2,"g");
		System.out.println(list.get(5));
		
		List<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("b");
		list1.add("c");
		list1.add("a");
		list1.add(2,"a");
		list1.add(2,"g");
		System.out.println(list1.get(0));
		
		String[] inputvalue = new String[]{"a","b","b","a","c"};
		//String[] input = [a,b,c,d,e,f,g,h,j,hh];

		System.out.println("\nExample 3 - Count all with Map");
		
	
	
	    printMap(inputvalue);
	}
	
	public static void printMap(String[] inputvalue)
	{
		//iterate
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String temp : inputvalue) 
		{
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
	    }

		//print map
		for (Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			System.out.println("----------------> count the no of time the string occurs");
			System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
		}
		
		//print distinct
		for (Map.Entry<String, Integer> entry : map.entrySet()) 
		{
			if(entry.getValue()==1)
			{
			  System.out.println("Key : " + entry.getKey() + " Value : "+ entry.getValue());
			}
		}
	}

}



