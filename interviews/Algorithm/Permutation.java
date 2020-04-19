import java.util.*;

class Permutation {
    public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = permutation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
    
    public static boolean permutation(String s, String t) {
        return sorted(s).equals(sorted(t));
    }
    
    public static String sorted(String input) { 
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}