public class BubbleSort { 
    public static void main(String[] args) { 
        int[] temp = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        printArray(BubbleSort(temp));
    }

    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

    public static int[] BubbleSort(int[] arr) { 
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

