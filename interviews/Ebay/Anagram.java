import java.util.Arrays;

class Anagram {
    public static void main(String args[]) 
        {
            boolean testA = anagram("String", "gnirts");
            boolean testB = anagram("String", "gnirtS");
            boolean testC = anagram("String", "ginrtS");  
            boolean[] arr = new boolean[3];
            arr[0]= testA;
            arr[1]= testB;
            arr[2]= testC;
            for(boolean b : arr) {
                if(b) {
                    System.out.println("true");
                } else { 
                    System.out.println("false");
                }
            }
        }
    // option 1
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public static boolean anagram(String a, String b) { 
        if(a.length() != b.length()) { 
            return false;
        }
        for(int i = 0; i < b.length(); i++) {
            int index = b.length() - 1 - i;
            if(a.charAt(index) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // option 2
    // has problem when "String", "ginrtS"
    // public static boolean anagram(String a, String b) { 
    //     if(a.length() != b.length()) { 
    //         return false;
    //     }
    //     char ax[] = a.toCharArray();
    //     char bx[] = b.toCharArray();
    //     Arrays.sort(ax);
    //     Arrays.sort(bx);
    //     for (int i = 0; i < ax.length; i++) 
    //         if (ax[i] != bx[i]) 
    //             return false; 
  
    //     return true; 
    // }

    //option 3
    // create two arrays for both strings
    // set them all to 0 and raise the counter whenever 
    // the character is found and compare.
}