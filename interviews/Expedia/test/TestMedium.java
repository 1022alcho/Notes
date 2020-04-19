class TestMedium {

    // Medium : 13 min 08 seconds
    // Run time : O(n), n is size of given array
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        char[] ch = s.toCharArray();
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = counter(ch, i, i);
            int len2 = counter(ch, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + (len) / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int counter(char[] ch, int l, int r) {
        int left = l, right = r;
        while((left >= 0 && right < ch.length) && ch[left] == ch[right]) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Medium : 
    // Run time : O(n), n is size of given array
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) { 
            return s.length();
        }
        int max = 0, i = 0, j = 0, n = s.length();
        Set<Character> set = new HashSet<>();
        while(i < n && j < n) { 
            char ch = s.charAt(j);
            if(!set.contains(ch)) { 
                set.add(ch);
                j++;
                max = Math.max(max, j - i);
            } else { 
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}