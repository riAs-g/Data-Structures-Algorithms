package Leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class RomanInteger {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a roman number");
            String roman = input.nextLine();
            System.out.println(toInteger(roman));
        }
    }

    private static int toInteger(String roman) {
        HashMap<Character, Integer> table = new HashMap<>();
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);

        int sum = 0;
        char[] rom = roman.toCharArray();
        for (int i = 0; i < rom.length - 1; i++) {
            if (table.get(rom[i]) < table.get(rom[i + 1]))
                sum -= table.get(rom[i]);
            else
                sum += table.get(rom[i]);
        }
        sum = sum + table.get(rom[rom.length - 1]);
        return sum;
    }
}