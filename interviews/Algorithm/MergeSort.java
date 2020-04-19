// public class MergeSort { 
//     public static void main(String[] args) { 
//         int arr[] = {10, 7, 8, 9, 1, 5}; 
//         int n = arr.length; 
  
//         MergeSort ob = new MergeSort(); 
//         ob.sort(arr, 0, n-1); 
  
//         System.out.println("sorted array"); 
//         printArray(arr); 
//     }

//     public static void printArray(int arr[]) 
//     { 
//         int n = arr.length; 
//         for (int i=0; i<n; ++i) 
//             System.out.print(arr[i]+" "); 
//         System.out.println(); 
//     } 

//     void sort(int[] arr, int start, int end) {
//         if(end > start) {
//             int middle = (start + end) / 2;
//             sort(arr, start, middle);
//             sort(arr, middle + 1, end);
//             merge(arr, start, middle, end);
//         }
//     }

//     void merge(int[] arr, int start, int middle, int end) { 
//         int i = start, j = middle + 1, k = start;
//         int[] sorted = new int[arr.length];
//         while(i <= middle && j < end) { 
//             if(arr[i] < arr[j]) {
//                 sorted[k] = arr[i];
//                 i++;
//             } else {
//                 sorted[k] = arr[k];
//                 i++;
//             }
//             k++;
//         }
//         if(i > middle) {
//             for(int n = j; n < end; n++) {
//                 sorted[k] = arr[n];
//                 k++;
//             }
//         } else {
//             for(int n = i; n < middle + 1; n++) { 
//                 sorted[k] = arr[n];
//                 k++;
//             }
//         }
//         for(int o = start; o < end; o++) { 
//             arr[o] = sorted[o];
//         }

//     }
// }
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
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
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
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
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
        int arr[] = {12, 11, 13, 5, 6, 7}; 
  
        System.out.println("Given Array"); 
        printArray(arr); 
  
        MergeSort ob = new MergeSort(); 
        ob.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 
} 