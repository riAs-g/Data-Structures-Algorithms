package Leetcode;

public class CompleteWord {
    public static void main(String[] args) {
        String plate = "PA123";
        String[] arr = new String[] { "participant", "individual", "start", "exist", "above",
                "already", "easy", "attack", "player", "planer" };
        System.out.println(shortestCompletingWord(plate, arr));
    }

    private static String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < licensePlate.length(); i++) {
            if (Character.isLetter(licensePlate.charAt(i))) {
                st.append(licensePlate.charAt(i));
            }
        }
        char[] arr = st.toString().toCharArray();
        int count = 0, len = Integer.MAX_VALUE;
        String ret = "";
        for (String str : words) {
            StringBuilder nstr = new StringBuilder();
            nstr.append(str);
            for (char c : arr) {
                for (int j = 0; j < nstr.length(); j++) {
                    if (Character.toLowerCase(nstr.charAt(j)) == Character.toLowerCase(c)) {
                        count++;
                        nstr.deleteCharAt(j);
                        break;
                    }
                }
            }
            if (count == arr.length && len > str.length()) {
                len = str.length();
                ret = str;
            }
            count = 0;
        }
        return ret;
    }
}