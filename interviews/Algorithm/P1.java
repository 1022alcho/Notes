public class P1 { 
    public static void main(String[] args) { 
        allFib(10);
    }

    public static void allFib(int n) { 
        int[] mem = new int[n + 1];
        for(int i = 0; i < n; i++) {
            System.out.println(i + " : " + fib(i, mem));
        }
    }

    public static int fib(int n, int[] mem) { 
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (mem[n] > 0) { 
            return mem[n];
        }
        return fib(n - 1, mem) + fib(n - 2, mem);
    }
}

