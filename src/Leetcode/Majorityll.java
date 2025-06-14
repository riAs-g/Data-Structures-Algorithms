package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Majorityll {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] { 1, 1, 1, 2, 3, 5, 5, 6 }));
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int key : count.keySet()) {
            if (count.get(key) > nums.length / 3) {
                res.add(key);
            }
        }
        return res;
    }
}
