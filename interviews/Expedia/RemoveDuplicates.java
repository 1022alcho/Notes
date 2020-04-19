import java.util.*;
import java.io.*;

class RemoveDuplicates { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a string you want to check if it has duplicates");
        String myString = scanner.nextLine();
        scanner.close();
        
        System.out.println(removeDuplicates1(myString));
        System.out.println(removeDuplicates2(myString));
        System.out.println(removeDuplicates3(myString));
    }

    public static String removeDuplicates1(String str) { 
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            if(str.indexOf(str.charAt(i)) == i) {
                sb.insert(0, str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates2(String str) { 
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            } else {
                System.out.println("it has duplicates : " + str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeDuplicates3(String str) { 
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        char[] temp = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            if(!set.contains(temp[i])) {
                set.add(temp[i]);
                sb.append(temp[i]);
            } else {
                System.out.println("it has duplicates : " + temp[i]);
            }
        }
        return sb.toString();
    }
}