package Leetcode;

public class CharReplace {
    public static void main(String[] args) {
        System.out.println(replace("AABABBA", 1));
    }

    private static int replace(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }

    // private static int replace(String str, int k) {
    // HashMap<Character, Integer> map;
    // int res=0, i=0, j=0;
    // while (j<=str.length() && i<=j) {
    // map=getMap(str.substring(i,j));
    // if (isValid(str.substring(i,j), map, k) && (j-i)>res) {
    // res=j-i;
    // } else if (!isValid(str.substring(i,j), map, k)){
    // i++;
    // }
    // j++;
    // }
    // return res;
    // }
    //
    // private static boolean isValid(String substring, HashMap<Character, Integer>
    // map, int k) {
    // int max=0;
    // for (Map.Entry<Character, Integer> mapElement : map.entrySet()) {
    // if (mapElement.getValue()>max) {
    // max=mapElement.getValue();
    // }
    // }
    // return substring.length() - max <= k;
    // }
    //
    // private static HashMap<Character, Integer> getMap(String substring) {
    // HashMap<Character, Integer> map = new HashMap<>();
    // for (int i = 0; i < substring.length(); i++) {
    // map.put(substring.charAt(i), map.getOrDefault(substring.charAt(i), 0)+1);
    // }
    // return map;
    // }
}
