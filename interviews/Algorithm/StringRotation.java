class StringRotation { 
    public static void main(String[] args) {
		String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
    }
    
    // public static boolean isRotation(String w1, String w2) { 
    //     if(w1.length() != w2.length()) { 
    //         return false;
    //     }
    //     int index = w2.indexOf(w1.charAt(0));
    //     if(isSubstring(w1, w2.substring(index))){
    //         int cuttingline = w2.substring(index).length();
    //         if(w1.substring(cuttingline).equals(w2.substring(0, w2.length() - cuttingline))) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
    public static boolean isRotation(String w1, String w2) { 
        if(w1.length() == w2.length() && w1.length() > 0) { 
            if(isSubstring(w1 + w1, w2)) { 
                return true;
            }
        }
        return false;
    }
    public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}
}