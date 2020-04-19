import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] temp = new int[]{1,2,3,1,1,2,4,5};
        System.out.println(longestSubArray(temp, 7));
    }

    private static int longestSubArray(int[] temp, int k) {
        int max = 0, count = 0, sum = 0;
        for(int i = 0; i < temp.length; i++) {
            sum += temp[i];
            if(sum <= k) {
                count++;
            } else {
                sum = sum - temp[i - count];
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
