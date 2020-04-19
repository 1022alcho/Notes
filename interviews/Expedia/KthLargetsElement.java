public class KthLargetsElement {

    public static void main(String[] args) {
        int[] temp = new int[]{3,6,5,1,2,4};
        int result = findKthLargest(temp, 4);
        System.out.println(result);
    }

    public static int findKthLargest(int[] nums, int k) {
        int size = nums.length;
        // kth largest is (N - k)th smallest
        return quickselect(nums ,0, size - 1, size - k);
    }

    public static int quickselect(int[] nums, int left, int right, int k_smallest) {
    /*
    Returns the k-th smallest element of list within left..right.
    */

        if (left == right) // If the list contains only one element,
            return nums[left];  // return that element

        int pivot_index =  partition(nums, left, right);

        // the pivot is on (N - k)th smallest position
        if (k_smallest == pivot_index)
            return nums[k_smallest];
            // go left side
        else if (k_smallest < pivot_index)
            return quickselect(nums, left, pivot_index - 1, k_smallest);
        // go right side
        return quickselect(nums, pivot_index + 1, right, k_smallest);
    }

    public static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int store_index = left;

        // 2. move all smaller elements to the left
        for (int i = left; i <= right; i++) {
            if (nums[i] < pivot) {
                swap(nums, store_index, i);
                store_index++;
            }
        }

        // 3. move pivot to its final place
        swap(nums, store_index, right);

        return store_index;
    }

    public static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}
