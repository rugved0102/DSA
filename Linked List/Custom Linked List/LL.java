//package DSA.Linked List.Custom Linked List;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    public void insert(int val, int index) {
        if(size == 0) {
            insertFirst(val);
            return;
        }
        if(size == index) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(tail == null)  {
            insertFirst(val);
            return; // return is important to avoid the increment of size twice
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    private class Node {
        private int value;
        private Node next;
            private Node(int value) {
            this.value = value;
        }
            private Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }

    }
}
