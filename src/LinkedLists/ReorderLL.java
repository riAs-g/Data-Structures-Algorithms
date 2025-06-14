package LinkedLists;

public class ReorderLL {
    public static void main(String[] args) {
        List res = reorder(new List(1, 2, 3, 4, 5));
        res.displayList();
    }

    private static List reorder(List list) {
        Node slow = list.head;
        Node fast = list.head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list using a tmp variable
        Node second = slow.next;
        Node prev = slow.next = null;
        while (second != null) {
            Node tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        // Re-assign the pointers to match the pattern
        Node first = list.head;
        second = prev;
        while (second != null) {
            Node tmp1 = first.next;
            Node tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
        return list;
    }
}
