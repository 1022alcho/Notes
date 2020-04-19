import java.util.*;

public class MaxCandies {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add((long)7);
        list.add((long)3);
        list.add((long)4);
        list.add((long)4);

        System.out.println(maxCandies(list, 9));
    }

    private static long maxCandies(List<Long> list, int k) {
        int sum = 0, max = 0, i = 0, j = list.size() - 1;
        Collections.sort(list);
        while(i < j) {
            if(k < (sum += list.get(j))) {
                j--;
            } else {
                sum += list.get(j);
            }


        }
        return 0;
    }
}
