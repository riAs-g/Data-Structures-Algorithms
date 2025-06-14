package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("bat");
        str.add("tea");
        str.add("eat");
        str.add("tan");
        str.add("nat");
        List<List<String>> group;
        group = checkAnagram(str);
        System.out.println(group);
    }

    public static List<List<String>> checkAnagram(List<String> strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}