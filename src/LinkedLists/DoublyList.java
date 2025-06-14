package LinkedLists;

public class DoublyList {

    Node head, tail;
    int size;

    public DoublyList(int... args) {
        for (int dat : args) {
            insertLast(dat);
            size += 1;
        }
    }

    public void deleteNode(int data) {
        Node temp = head;
        if (size == 0)
            return;
        for (int i = 0; i < size; i++) {
            if (temp.next.data != data)
                temp = temp.next;
            else {
                Node t = temp;
                if (temp.next.next == null) {
                    t.next = null;
                    tail = t;
                }
                if (temp.next != null)
                    temp = temp.next;
                if (temp.next != null) {
                    temp = temp.next;
                    t.next = temp;
                    temp.prev = t;
                }
                size--;
            }
        }
    }

    public void deleteIndex(int index) {
        Node temp = head;
        if (size == 0)
            return;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node t = temp;
        if (temp.next.next == null) {
            t.next = null;
            tail = t;
        }
        if (temp.next != null)
            temp = temp.next;
        if (temp.next != null) {
            temp = temp.next;
            t.next = temp;
            temp.prev = t;
        }
        size--;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int data) {
        if (size == 0) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        node.prev = tail;
        tail = node;
        size += 1;
    }

    public void insertIndex(int data, int index) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node t = new Node(data);
        temp.next = t;
        size += 1;
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
        Node store = head;
        head = tail;
        tail = store;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
