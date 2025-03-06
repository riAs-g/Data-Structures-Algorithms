package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        System.out.println(carFleet(10,new int[]{0,4,2},new int[]{2,1,3}));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> s=new Stack<>();
        s.add(Double.MIN_VALUE);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        for (int i = position.length-1; i >= 0; i--) {
            double currentTime = (double) (target - position[i]) / map.get(position[i]);
            if (!s.isEmpty() && currentTime > s.peek()) {
                s.add(currentTime);
            }
        }
        return s.size()-1;
    }
}
