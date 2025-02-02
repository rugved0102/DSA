public class CLL {
    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head; // Maintain circularity
            return;
        }

        tail.next = node;
        node.next = head; // Maintain circularity
        tail = node;
    }

    public void delete(int value) {
        Node node = head;
        if(node == null) {
            return;
        }
        if(node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if(n.value == value) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        
        Node node = head;
        do {
            System.out.print(node.value + " -> ");
            node = node.next;
        } while (node != head);
        System.out.println("(back to head)");
    }

    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }
}
