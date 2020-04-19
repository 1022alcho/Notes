import java.util.*;

class IntersectionOfArray {

    public static void main(String[] args) {
        int[] testA = new int[]{4,9,5};
        int[] testB = new int[]{9,4,9,8,4};
        for(int a : intersection(testA, testB)) {
           System.out.println(" " + a);
        }
    }
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        int min = Math.min(nums1.length, nums2.length);
        int[] temp = new int[min];
        if(nums1.length == 0 || nums2.length == 0) return temp;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> set = new HashSet<Integer>();
        int i = 0 , j = 0, z = 0;
        while(i < nums1.length && j < nums2.length) { 
            int n = nums1[i];
            int n2 = nums2[j];
            if(nums1[i] == nums2[j]) {
                if(!set.contains(n)) {
                    set.add(n);
                    temp[z++] = n;
                }
                i++;
                j++;
            } else {
                if(n > n2) {
                    j++;
                }
                if(n < n2) {
                    i++;
                }
            }
        } 
        return temp;
    }
    
}

/*
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        if (set1.size() < set2.size()) return set_intersection(set1, set2);
        else return set_intersection(set2, set1);
    }
    
    public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int [] output = new int[set1.size()];
        int idx = 0;
        for (Integer s : set1)
          if (set2.contains(s)) output[idx++] = s;

        return Arrays.copyOf(output, idx);
    }
}
*/