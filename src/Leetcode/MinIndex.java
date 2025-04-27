package Leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinIndex {
    public static void main(String[] args) {
        List<String> str1=new ArrayList<>();
        List<String> str2=new ArrayList<>();
        str1.add("Shogun");
        str1.add("Piatti");
        str1.add("Tropicana");
        str1.add("Kfc");
        str2.add("Piatti");
        str2.add("Happy");
        str2.add("Sad");
        str2.add("Shogun");
        System.out.println(Arrays.toString(findRestaurant(str1, str2)));
    }

    private static String[] findRestaurant(List<String> list1, List<String> list2) {
        int i=1, max=Integer.MAX_VALUE;
        List<String> fin=new ArrayList<>();
        fin.add(String.valueOf(new ArrayList<String>()));
        for (String wrd1: list1){
            for (String wrd2: list2){
                if (wrd1.equals(wrd2) && list1.indexOf(wrd1)+ list2.indexOf(wrd2)<max){
                    max=list1.indexOf(wrd1)+ list2.indexOf(wrd2);
                    fin.set(0,wrd1);
                } else if (wrd1.equals(wrd2) && list1.indexOf(wrd1)+ list2.indexOf(wrd2) == max) {
                    fin.add(String.valueOf(new ArrayList<String>()));
                    fin.set(i,wrd1);
                    i++;
                }
            }
        }
        return fin.toArray(new String[0]);
    }
}