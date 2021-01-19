package Sorting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import factory.DataProviderFactory;

public class Sorting {
	
	static Logger logger = Logger.getLogger(Sorting.class);
	static String path = DataProviderFactory.getConfig().getLog4jPath();
	 
	
	public static void main(String[] args) 
	{
	   int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
       Sorting ob = new Sorting();
       ob.BubbleSort(arr);
       ob.printArray(arr);
       
       int arrInsertion[] = {64, 34, 25, 12, 22, 11, 90}; 
       ob.InsertionSort(arrInsertion);
       ob.printArray(arrInsertion);
       
       PropertyConfigurator.configure(path);
       //System.setProperty("logfile.name","app.log");
      
       logger.info("This sorted array logged is : " + arrInsertion);
       logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
       
      
	}
	
	//print array
	void printArray(int arr[])	
	{
		int n= arr.length;
		System.out.println("The sorted array is : ");
		for(int i =0; i<n; i++)
			System.out.print(arr[i] + " ");
	}
	
	//Bubble sort
   void BubbleSort (int arr[])
	{
		int n= arr.length;
		System.out.println(n);
		
		for(int i= 0;i<n-1; i++)
		{
			for(int j=0; j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					swap(arr, j ,j+1);
				}
			}
		}
	}
   
   //Insertion Sort
   void InsertionSort(int arr[])
   {
	   int n = arr.length;	   
	   for(int i = 1; i<n;i++)
	   {
		   int key = arr[i];
		   int j = i-1;
		   
		   while(j>= 0  && arr[j]>key)
		   {
			   arr[j+1] =arr[j];
			   j= j-1;
		   }
		   arr[j+1] = key;
	   }
   }

   //swap
	private void swap (int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

}
