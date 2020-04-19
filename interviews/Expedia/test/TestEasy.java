class TestEasy {

    // Easy : 9 min 04 seconds
    // Run time : O(n), n is size of given array
    public static int[] twoSum(int[] nums, int target) { 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) { 
            int n = target - nums[i];
            if(map.containsKey(n)) {
                return new int[]{i, map.get(n)};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    // Easy : 15 min 57 seconds
    // Run time : O(n)
    // Edge case: if either array is empty, return the other array
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode a = new ListNode(0);
        ListNode prev = a;
        while(l1 != null && l2 != null) { 
            if(l1.val > l2.val) { 
                prev.next = l2;
                l2 = l2.next;
            } else {
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }
        if(l1 != null) { 
            prev.next = l1;
            l1 = l1.next;
            prev = prev.next;
        }
        if(l2 != null) { 
            prev.next = l2;
            l2 = l2.next;
            prev = prev.next;
        }
        return a.next;
    }
    
    // Easy : 10 min 23 sec
    // Run time : O(n), n is the length of s 
    // Edge case : if the given string is Empty, return true;
    //             if the given string has odd length, return false;
    public boolean isValid(String s) {
        int length = s.length();
        if(length % 2 == 1) return false;
        else if(length == 0)  return true;
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < length; i++) { 
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    char popped = stack.pop();
                    if(ch != map.get(popped)) {
                        return false;
                    }
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    // Easy : 17 minutes 32 seconds
    // Run time : O(n), n is the size of the given array
    // Edge case : if the given array has 0 size, return 0;
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 0) { 
            return 0;
        }
        int sum = 0, max = nums[0];
        for(int i = 0; i < n; i++) {
            sum += nums[i];
            if(nums[i] > sum) {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    // Easy : 4 min 11 seconds
    // Run time : O(n), n is the size of the given ListNode
    // Edge case : if the given Node has 0 or 1 size, return itself;
    public ListNode reverseList(ListNode head) {
        ListNode back = null;
        ListNode front = head;
        while(head != null) { 
            head = head.next;
            front.next = back;
            back = front;
            front = head;
        }
        head = back;
        return head;
    }

    // Easy : 11 min 01 seconds
    // Run time : O(n), n is the size of the given array
    // Edge case : if the array is decending order, then return 0
    //             if the array is empty, return 0
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n <= 1) {
            return 0;
        }
        int maxProfit = 0, min = prices[0];
        for(int i = 1; i < n; i++) { 
            int current = prices[i];
            if(current < min) {
                min = current;
            }
            maxProfit = Math.max(maxProfit, current - min);
        }
        return maxProfit;
    }



    // WRONGGGGGGGGGGGG REVIEW : Answer replaced
    // Easy : 3 min 24 seconds
    // Run time : O(n), n is the size of the given array
    // Edge case : if the ListNode has size of one, return false;
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast) { 
            if(fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    // Easy : 29 min 01 seconds
    // Run time : O(n), n is the size of the given array
    // Edge case : if the String is Empty, return 0;
    public int romanToInt(String s) {
        if(s.length == 0) { 
            return 0;
        }
        char[] ch = s.toCharArray();
        int count = singleRomanToIntger(ch[0]);
        int prev = count;
        for(int i = 1; i < ch.length; i++) { 
            int num = singleRomanToIntger(ch[i]);
            if(prev < num) { 
                count -= 2 * prev;
            }
            count += num;
            prev = num;
        }
        return count;
    }

    public static int singleRomanToIntger(char ch) { 
        switch (ch) {
            case 'I' : 
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' : 
                return 50;
            case 'C' : 
                return 100;
            case 'D' :
                return 500;
            case 'M' :
                return 1000;
            default : 
                break;
        }
        return 0;
    }

    // Easy : 26 min 07 seconds
    // Run time : O(n), n is the size of the given array
    // Edge case : if two arrays have different size, 
    //             use the while loop until either size is gone,
    //             then append the rest.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arrayIndex = m + n - 1;
        m--;
        n--;
        while(m >= 0 && n >= 0) { 
            if(nums1[m] < nums2[n]) { 
                nums1[arrayIndex] = nums2[n];
                n--;
            } else if(nums1[m] >= nums2[n]) { 
                nums1[arrayIndex] = nums1[m];
                m--;
            }
            arrayIndex--;
        }
        for(int i = m; i >= 0; i--) {
            nums1[arrayIndex] = nums1[i];
            arrayIndex--;
        }
        for(int i = n; i >= 0; i--) {
            nums1[arrayIndex] = nums2[i];
            arrayIndex--;
        }
    }

    //TAKE A LOOK
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[n+m];
        int i = 0,j = 0,k = 0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                res[k++] = nums1[i++];
            } else{
                res[k++] = nums2[j++];
            }
        }
        while(i<m){
            res[k++] = nums1[i++];
        }
        while(j<n){
            res[k++] = nums2[j++];
        }
        for(int l = 0;l<m+n;l++){
            nums1[l] = res[l];
        }
    }
}
