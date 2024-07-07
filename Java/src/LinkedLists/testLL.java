package LinkedLists;

public class testLL {
    public static void main(String[] args) {
        List ll=new List();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.deleteNode(3);
        ll.deleteIndex(2);
        ll.displayList();
    }
}
