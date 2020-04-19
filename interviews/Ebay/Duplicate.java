import java.util.*;

class Duplicate {
    public static void main(String[] args) { 
        String[] st = new String[]{"a", "b", "c", "b", "a"};
        if(duplicate(st)) {
            System.out.println("true");
        } else { 
            System.out.println("false");
        }
    }

    private static boolean duplicate(String[] arr) { 
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < arr.length; i++) {
            //checks if the element is already added into the set
            if(!set.add(arr[i])) {
                System.out.println(arr[i]);
                return false;
            }
        }
        return true;
    }
}

//Time complexity : O(n)
//Space complexity: O(1)