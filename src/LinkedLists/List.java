package LinkedLists;

import java.util.HashSet;

public class List {

    Node head, tail;
    int size;

    public List(int...args){
        for (int dat: args) {
            insertLast(dat);
            size+=1;
        }
    }

    public void deleteNode(int data){
        Node temp=head;
        if (size==0)
            return;
        for (int i = 0; i < size; i++) {
            if (temp.next.data!=data)
                temp=temp.next;
            else {
                Node t=temp;
                temp=temp.next;
                temp=temp.next;
                t.next=temp;
                size--;
                return;
            }
        }
    }

    public void deleteIndex(int index){
        Node temp=head;
        if (size==0)
            return;
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node t = temp;
        temp = temp.next;
        temp = temp.next;
        t.next = temp;
        size--;
    }

    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int data){
        if (size==0) {
            insertFirst(data);
            return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insertIndex(int data, int index){
        if (index==0){
            insertFirst(data);
            return;
        }
        if (index==size){
            insertLast(data);
            return;
        }
        Node temp=head;
        for (int i = 0; i < index - 1; i++) {
            temp=temp.next;
        }
        Node t=new Node(data);
        temp.next=t;
        size+=1;
    }

    public void reverseList() {
        Node current = head;
        Node previous = null;
        Node nextCurrent;
        while (current != null) {
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }
        Node store=head;
        head=tail;
        tail=store;
    }

    public boolean detectCycle() {
        HashSet<Node> set=new HashSet<>();
        Node temp=head;
        if (temp==null)
            return false;
        while (temp.next!=null) {
            if (set.contains(temp.next))
                return true;
            set.add(temp);
            temp=temp.next;
        }
        return false;
    }

    public void displayList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}