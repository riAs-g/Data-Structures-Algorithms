package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Keyboard {
    public static void main(String[] args) {
        String[] words = {"a","b"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        List<String> validWords = new ArrayList<>();
        for (String word : words) {
            if (check(word)) {
                validWords.add(word);
            }
        }
        return validWords.toArray(new String[0]);
    }
        private static boolean check(String words) {
            char[] second = "qwertyuiop".toCharArray();
            char[] third = "asdfghjkl".toCharArray();
            char[] fourth = "asdfghjkl".toCharArray();
            Arrays.sort(second);
            Arrays.sort(third);
            Arrays.sort(fourth);
            for (int i = 0; i < words.length(); i++) {
                char[] first = words.toCharArray();
                Arrays.sort(first);
                int count=0;
                for (char c : first) {
                    for (char value : second) {
                        if (Character.toLowerCase(c) == Character.toLowerCase(value)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count==words.length()){
                    return true;
                }
                else{
                    count=0;
                }
                for (char c : first) {
                    for (char value : third) {
                        if (Character.toLowerCase(c) == Character.toLowerCase(value)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count==words.length()){
                    return true;
                }
                else{
                    count=0;
                }
                for (char c : first) {
                    for (char value : fourth) {
                        if (Character.toLowerCase(c) == Character.toLowerCase(value)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count==words.length()){
                    return true;
                }
                else{
                    count=0;
                }
        }
        return false;
    }
}