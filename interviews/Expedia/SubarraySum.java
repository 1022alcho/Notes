import java.util.HashMap;

public class SubarraySum {
    public static void main(String[] args) {
        int[] temp = new int[]{1,2,1,-1,4,-1};
        System.out.println(subarraySum(temp, 3));
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
