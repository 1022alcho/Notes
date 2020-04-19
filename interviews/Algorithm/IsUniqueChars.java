import java.util.HashSet;
import java.util.Set;

class IsUniqueChars {
    public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
    }
    
    public static boolean isUniqueChars(String str) {
        if(str.length() > 26) { 
            return false;
        }
        Set<Character> unique = new HashSet<Character>();
        for(int i = 0; i < str.length(); i++) { 
           if(unique.contains(str.charAt(i))) { 
               return false;
           } 
           unique.add(str.charAt(i));
        }
        return true;
    }
    
}