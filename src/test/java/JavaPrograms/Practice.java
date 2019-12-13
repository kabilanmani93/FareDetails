package JavaPrograms;

public class Practice {

    public static void main(String[] args)
    {
        int[] arr = {9,5,0,6,3,2,3,8};
        int n = arr.length;

        Practice pr = new Practice();
       // pr.quicksort(arr,0,n-1);

        pr.mergesort(arr,0,n-1);

        printarray(arr);


    }


    void mergesort(int arr[], int low, int high)
    {
        if(low < high)
        {

            //midpoint
            int mid = (low + high)/2;

            //sort
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);

            //merge
            merge(arr,low,mid,high);

        }
    }

    void merge(int arr[], int l, int m , int r)
    {
        //size of 2 arrays
        int n1 = m-l+1;
        int n2 = r-m;

        //create temp arrays
        int L[] = new int[n1];
        int R[]  = new int[n2];

        //copy the elements to the array
        for(int i=0; i < n1 ;i++)
            L[i] = arr[l+i];
        for(int j=0; j < n2 ;j++)
            R[j] = arr[m+1+j];

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;

        while(i<n1 && j< n2)
        {
            if(L[i] <= R[j])
            {
               arr[k++] = L[i++];
            }
            else
            {
                arr[k++] = R[j++];
            }
        }

        while(i<n1)
        {
            arr[k++]=L[i++];
        }

        while(j<n2)
        {
            arr[k++]=R[j++];
        }

    }

    void quicksort(int[] arr, int low, int high)
    {
        if(low < high)
        {

            int pi = partition(arr,low,high);

            quicksort(arr, low,pi-1);
            quicksort(arr, pi+1, high);
        }


    }

    static int partition (int[] arr, int low, int high)
    {

            int pivot = arr[low];
            int i = low+1;

            for (int j = i; j <= high; j++)
            {
                if(arr[j] > pivot)
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                    i++;
                }
            }

        int temp = arr[low];
        arr[low] = arr[i-1];
        arr[i-1] = temp;


        return i;

    }

    static void printarray(int arr[])
    {
        System.out.println("The Sorted array is");
        int n = arr.length;

        for(int i =0 ; i < n ;i++)
        {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}
