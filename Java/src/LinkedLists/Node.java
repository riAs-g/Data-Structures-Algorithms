package LinkedLists;

public class Node{

    int data;
    Node next, prev;

    Node(int data){
        this.data=data;
    }

    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }

    Node(int data, Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev= prev;
    }
}
