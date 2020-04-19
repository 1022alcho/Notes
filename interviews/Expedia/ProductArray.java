public class ProductArray {

    public static void main(String[] args) {
        int[] temp = new int[]{2,3,4,5};
        int[] hey = productExceptSelf(temp);
        for(int x : hey) {
            System.out.println(" " + x);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
