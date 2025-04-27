package Leetcode;

import java.util.*;

public class TopKFrequency {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{5,3,-1,-1,-1,3,73,1}, 1)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> s = frequency(nums);
        System.out.println(s);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);
        for (Map.Entry<Integer, Integer> entry : s.entrySet()) {
            list.get(entry.getValue()).add(entry.getKey());
        }
        System.out.println(list);

        int[] result = new int[k];
        int j= 0;
        for (int i = 0; i < k; i++) {
            if (!list.get(list.size()-1-j).isEmpty()) {
                result[i] = list.get(list.size()-1-j).getFirst();
                list.get(list.size()-1-j).removeFirst();
            } else {
                j++;
                i--;
            }
        }
        return result;
    }

    public static HashMap<Integer,Integer> frequency(int[] arr) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int j : arr) {
            mp.put(j, mp.get(j) == null ? 1 : mp.get(j) + 1);
        }
        return (mp);
    }
}
