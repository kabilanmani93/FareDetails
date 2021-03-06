package Sorting;

// Java program for implementation of QuickSort
class QuickSort 
{ 
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; //low
		int i = low; // index of smaller element //low+1
		for (int j=low; j<high; j++) //low+1 till <=high
		{ 
			// If current element is smaller than the pivot 
			if (arr[j] < pivot)
			{
				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp;

				i++;
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		return i;
	} 


	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */

			int pi = partition(arr, low, high);

			System.out.println("partition from, " + low + " to " + high + "=> partition: " + pi);
			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1);

            System.out.println("2nd recursive partition from, " + low + " to " + high + "=> partition: " + pi);

			sort(arr, pi+1, high); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver program 
	public static void main(String args[]) 
	{ 
		int arr[] = {5,91,93,6,85,95,96,78,82,90};
		int n = arr.length; 

		QuickSort ob = new QuickSort(); 
		ob.sort(arr, 0, n-1); 

		System.out.println("sorted array"); 
		printArray(arr); 
	} 
} 
/*This code is contributed by Rajat Mishra */
