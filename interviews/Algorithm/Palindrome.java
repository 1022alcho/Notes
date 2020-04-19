import java.util.*; 

class Palindrome {
    public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali.toLowerCase().replaceAll(" ", "")));
    }

    public static boolean isPermutationOfPalindrome(String str) { 
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : str.toCharArray()) { 
            if(map.containsKey(c)) { 
                map.put(c, map.get(c) + 1);
            } else { 
                map.put(c, 1);
            }
        }
        if(map.size() < (str.length() + 1) / 2) { 
            return false;
        }
        int count = 0;
        for(char c : map.keySet()) { 
            if(map.get(c) == 1) { 
                count++;
            }
        }
        if(count > 1) { 
            return false;
        }
        return true;
    }
}