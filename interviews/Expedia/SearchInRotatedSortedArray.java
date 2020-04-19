public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] temp = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(temp, 0));
    }

    public static int search(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while(i < j) {
            int mid = (j + i) / 2;
            if(nums[mid] > nums[j]) i = mid + 1;
            else j = mid;
        }
        int rot = j;
        if(nums[0] <= target && nums[rot - 1] >= target) {
            return finder(nums, 0, rot - 1, target);
        } else if(nums[rot] <= target && nums[nums.length - 1] >= target) {
            return finder(nums, rot, nums.length -1, target);
        }
        return -1;
    }
    public static int finder(int[] nums, int start, int end, int target) {
        int mid = (end + start) / 2;
        if(start > end) return -1;
        else if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return finder(nums, start, mid, target);
        else return finder(nums, mid, end, target);
    }
}
