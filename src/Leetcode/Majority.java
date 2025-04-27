package Leetcode;

import java.util.*;

public class Majority {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter size of array");
            int n=input.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter an array of numbers");
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            System.out.println(major(arr));
        }
    }

    private static int major(int[] arr) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for (int element: arr){
            s.put(element,0);
        }
        int ele=0, count=0;
        for (int element: arr){
            s.put(element,s.getOrDefault(element,0)+1);
        }
        for (Map.Entry<Integer,Integer> element:s.entrySet()){
            if (element.getValue()>count){
                ele=element.getKey();
                count=element.getValue();
            }
        }
        return ele;
    }
}