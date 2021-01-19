package JavaPrograms;
// Java program to find missing element 
// from same arrays 
// (except one missing element) 
  
import java.io.*; 
class MissingNumber { 
  
    /* Function to find missing element based 
     on binary search approach. arr1[] is of 
     larger size and N is size of it.arr1[] and  
     arr2[] are assumed to be in same order. */
    int findMissingUtil(int arr1[], int arr2[], 
                        int N) 
    { 
        // special case, for only element 
        // which is missing in second array 
        if (N == 1) 
            return arr1[0]; 
  
        // special case, for first 
        // element missing 
        if (arr1[0] != arr2[0]) 
            return arr1[0]; 
  
        // Initialize current corner points 
        int lo = 0, hi = N - 1; 
  
        // loop until lo < hi 
        while (lo < hi) { 
            int mid = (lo + hi) / 2; 
  
            // If element at mid indices are 
            // equal then go to right subarray 
            if (arr1[mid] == arr2[mid]) 
                lo = mid; 
            else
                hi = mid; 
  
            // if lo, hi becomes  
            // contiguous, break 
            if (lo == hi - 1) 
                break; 
        } 
  
        // missing element will be at hi  
        // index of bigger array 
        return arr1[hi]; 
    } 
  
    // This function mainly does basic error 
    // checking and calls findMissingUtil 
    void findMissing(int arr1[], int arr2[],  
                              int M, int N) 
    {
        if (N == M - 1)
        System.out.println("Missing Element is "
        + findMissingUtil(arr1, arr2, M) + "\n"); 
        else if (M == N - 1)
        System.out.println("Missing Element is "
        + findMissingUtil(arr2, arr1, N) + "\n"); 
        else
        System.out.println("Invalid Input"); 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        MissingNumber obj = new MissingNumber(); 
        int arr1[] = { 1, 4, 5, 7, 9 };
        int arr2[] = { 4, 5, 7, 9 }; 
        int M = arr1.length; 
        int N = arr2.length; 
        obj.findMissing(arr1, arr2, M, N); 
    } 
} 
  