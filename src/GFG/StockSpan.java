package GFG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter Stock Values");
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 6; i++) {
                arr.add(input.nextInt());
            }
        }
        System.out.println(Arrays.toString(stockSpan(arr)));
    }

    private static int[] stockSpan(ArrayList<Integer> arr) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int[] array = new int[10];
        if (arr.isEmpty())
            return null;
        for (int i = 0; i < 6; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr.get(j) <= arr.get(i))
                    array[i] += 1;
                else
                    break;
            }
        }
        return array;
    }
}