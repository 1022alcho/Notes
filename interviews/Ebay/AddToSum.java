import java.util.*; 
  
class AddToSum 
{ 
    static int[] arr = new int[]{1, 5, 7, -1, 5} ; 
    public static void main(String[] args) {    
        int sum = 6; 
        getPairsCount(arr,sum); 
          
    } 

    static void getPairsCount(int[] n, int sum) 
    { 
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n.length; i++) {
            int match = sum = n[i];
            if(match >= 0 && set.contains(match)) { 
                System.out.println("" + n[i] + ", " + match);
            }
            set.add(n[i]);
        }
    } 
} 