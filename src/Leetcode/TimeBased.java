package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class TimeBased {

    // Could make a unique type of data structure using a class that stores 3 values
    public static void main(String[] args) {
        TimeBased time = new TimeBased();
        time.set("a", "bar", 1);
        time.set("x", "b", 3);
        System.out.println(time.get("b", 3));
        time.set("foo", "bar2", 4);
        System.out.println(time.get("foo", 4));
    }

    HashMap<String, ArrayList<ArrayList<String>>> map;

    public TimeBased() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new ArrayList<>());
        map.get(key).getLast().add(0, value);
        map.get(key).getLast().add(1, String.valueOf(timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "key does not exist";
        int last = map.get(key).size();
        int first = 0;
        int mid = 0;
        String res = "";
        while (first <= last) {
            mid = (last + first) / 2;
            if (mid < map.get(key).size() && Integer.parseInt(map.get(key).get(mid).get(1)) <= timestamp) {
                res = map.get(key).get(mid).getFirst();
                first = mid + 1;
            } else if (mid < map.get(key).size() && Integer.parseInt(map.get(key).get(mid).get(1)) > timestamp) {
                last = mid - 1;
            } else {
                break;
            }
        }
        return res;
    }
}
