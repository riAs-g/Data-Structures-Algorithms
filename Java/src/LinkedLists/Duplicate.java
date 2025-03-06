package LinkedLists;

import java.util.HashSet;

public class Duplicate {

    public static void main(String[] args) {
        System.out.println(duplicate(new List(3,1,3,4,2)));
    }

    private static int duplicate(List list) {
        HashSet<Integer> set=new HashSet<>();
        Node curr=list.head;
        while (curr!=null) {
            if (set.contains(curr.data)) {
                return curr.data;
            } else {
                set.add(curr.data);
            }
            curr=curr.next;
        }
        return 0;
    }
}
