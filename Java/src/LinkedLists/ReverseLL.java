package LinkedLists;

public class ReverseLL {

    public static void main(String[] args) {
        List list=reverse(new List(5), 1, 1);
        list.displayList();
    }

    private static List reverse(List ls, int left, int right) {
        Node dummy=new Node(0);
        dummy.next=ls.head;
        Node leftPrev=dummy;
        Node curr=ls.head;
        for (int i = 0; i < left - 1; i++) {
            leftPrev=curr;
            curr=curr.next;
        }
        Node prev=null;
        for (int i = 0; i < right - left + 1; i++) {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        leftPrev.next.next=curr;
        leftPrev.next=prev;
        return ls;
    }
}
