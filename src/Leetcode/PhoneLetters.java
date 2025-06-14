package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneLetters {

    public static void main(String[] args) {
        System.out.print(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) {
            return res;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        StringBuilder sb = new StringBuilder();
        backtrack(digits, sb, res, map, 0);
        return res;

    }

    public static void backtrack(String digits, StringBuilder sb, List<String> res,
            Map<Character, String> map, int index) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }

        char dig = digits.charAt(index);
        String letters = map.get(dig);

        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(digits, sb, res, map, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
