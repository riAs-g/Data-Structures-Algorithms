package Leetcode;

import java.util.*;

class Anagrams
{
    public static void main(String[] args) 
    {
        List<String> str=new ArrayList<>();
        str.add("bat");
        str.add("tea");
        str.add("eat");
        str.add("tan");
        str.add("nat");
        List<List<String>> group;
        group=checkAnagram(str);
        System.out.println(group);
    }

    public static List<List<String>> checkAnagram(List<String> strs)
    {
        List<List<String>> ana = new ArrayList<>();
        HashSet<String> grams = new HashSet<>(strs);
        if (grams.size()==1){
            ana.add(new ArrayList<>());
            for (String s: strs) {
                ana.get(0).add(s);
            }
            return ana;
        }else {
            Iterator<String> i=grams.iterator();
            int k=0;
                while (i.hasNext()) {
                    ana.add(new ArrayList<>());
                    String s1=i.next();
                    for (String s : strs) {
                        if (check(s1, s)) {
                            ana.get(k).add(s);
                        }
                    }
                    k++;
                }

            List<List<String>> newList = new ArrayList<>();
            for (List<String> element : ana) {
                if (!newList.contains(element)) {
                    newList.add(element);
                }
            }
            return newList;
        }
    }

    public static boolean check(String firstStr, String secondStr)
    {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}