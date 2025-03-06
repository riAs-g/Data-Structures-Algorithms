package LinkedLists;

public class MergeLL {
    public static void main(String[] args) {
        List res=merge(new List(1,2,3,4),new List(2,3,4,5,6,9));
        res.displayList();
    }

    private static List merge(List list1, List list2) {
        List res=new List();
        while (list1.head != null && list2.head != null) {
            if (list1.head.data <= list2.head.data) {
                res.insertLast(list1.head.data);
                list1.head=list1.head.next;
            } else {
                res.insertLast(list2.head.data);
                list2.head=list2.head.next;
            }
        }
        res.tail.next = list1.head != null ? list1.head : list2.head;
        return res;
    }
}
