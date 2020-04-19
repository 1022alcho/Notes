public class SelectionSort { 
    public static void main(String[] args) { 
        int[] temp = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        printArray(SelectionSort(temp));
    }

    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

    public static int[] SelectionSort(int[] arr) { 
        int length = arr.length; 
        for(int i = 0; i < length; i++) {
            int minIndex = i;
            for(int j = i; j < length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

