package Sorting;

/* Java program for Merge Sort */
class MergeSort 
{ 
	// Merges two subarrays of arr[]. 
	// First subarray is arr[l..m] 
	// Second subarray is arr[m+1..r] 
	void merge(int arr[], int l, int m, int r) 
	{ 
		// Find sizes of two subarrays to be merged 
		int n1 = m - l + 1; 
		int n2 = r - m;

		System.out.println("Value of n1 and n2 : " + n1 + " " + n2 +"********************************");

		/* Create temp arrays */
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		/*Copy data to temp arrays*/
        System.out.print("L[i] = ");
		for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i];
            System.out.print(L[i] + " ");
        }
		System.out.println();
        System.out.print("R[j] = ");
		for (int j=0; j<n2; ++j) {
            R[j] = arr[m + 1 + j];
            System.out.print(R[j] + " ");
        }
        System.out.println();


		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of L[] if any */
		while (i < n1) 
		{ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		/* Copy remaining elements of R[] if any */
		while (j < n2) 
		{ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 

	// Main function that sorts arr[l..r] using 
	// merge() 
	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) 
		{
            //System.out.println("sort called");
			// Find the middle point

			int m = (l+r)/2;
            System.out.println("**************************************Mid Point:  " + l + " to " + r + "=> partition: " + m + "*************************************");

			// Sort first and second halves
            System.out.println("1st merge sort :  " + l + " to " + m);
			sort(arr, l, m);
            System.out.println("2nd recursive merge mid from, " + (m+1) + " to " + r );
			sort(arr , m+1, r);
            System.out.println("2nd recursive merge mid from, " + (m+1) + " to " + r );

			// Merge the sorted halves
            System.out.println("(((((((((((((((((((((((((((Merge Method Called" + " l---> " +l+" m----->"+ m+ " r----->  "+ r + "))))))))))))");
			merge(arr, l, m, r);

            System.out.println( "--------------------------------------------------------------------------------------------------------------------------------------------------" );
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = {38,27,43,3,9,82,10};

		System.out.println("Given Array"); 
		printArray(arr); 

		MergeSort ob = new MergeSort(); 
		ob.sort(arr, 0, arr.length-1); 

		System.out.println("\nSorted array"); 
		printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra */
