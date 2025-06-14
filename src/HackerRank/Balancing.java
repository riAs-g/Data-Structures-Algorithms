package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Balancing {

    public static void main(String[] args) {
        System.out.println(countBalancingElements(new ArrayList<>(List.of(5, 5, 2, 5, 8))));
    }

    public static int countBalancingElements(List<Integer> arr) {
        int n = arr.size();
        int count = 0;
        int evenSum;
        int oddSum;
        List<Integer> arrc = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrc.addAll(arr);
            arrc.remove(i);
            evenSum = 0;
            oddSum = 0;
            for (int j = 0; j < arrc.size(); j++) {
                if (j % 2 == 0) {
                    evenSum += arrc.get(j);
                } else {
                    oddSum += arrc.get(j);
                }
            }
            if (oddSum == evenSum)
                count++;
            arrc.removeAll(arr);
        }
        return count;
    }
}
