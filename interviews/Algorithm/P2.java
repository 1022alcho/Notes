public class P2 { 
    public static void main(String[] args) { 
        po2(8);
    }

    public static void po2(int n) { 
        System.out.println(powerof2(n));
    }

    public static int powerof2(int n) { 
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int prev = powerof2(n/2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
}

