//package DSA.Linked List.Custom Linked List;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size--;
        return value;
    }
    public Node findNodeValue(int value) {
        Node node = head;
        while(node != null) {
            if(node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node getNodeIndex(int index) {
        Node node = head;         // Start from the head of the list
        for (int i = 0; i < index; i++) {
            node = node.next;     // Move to the next node
        }
        return node;              // Return the node at the desired index
    }    

    public int deleteLast() {
        int value = tail.value;
        if (size == 0) {
            throw new IllegalStateException("List is empty"); // Ensure size is checked
        }
        if (size == 1) {
            head = null;    // If there's only one node, set head and tail to null
            tail = null;
        } else {
            Node secondLast = getNodeIndex(size - 2); // Get the second-to-last node
            secondLast.next = null;              // Remove the link to the last node
            tail = secondLast;                   // Update the tail reference
        }
        size--; // Decrement the size of the list
        return value;
    }
    
    public int delete(int index) {
        // Validate index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        
        // If deleting the first node
        if (index == 0) {
            deleteFirst();
            //return;
        }
        
        // If deleting the last node
        if (index == size - 1) {
            deleteLast();
            //return;
        }
        
        // Delete node at the given index
        Node prev = getNodeIndex(index - 1); // Get the previous node
        int value = prev.next.value;
        Node curr = prev.next; // The current node to be deleted
        prev.next = curr.next; // Bypass the current node
    
        size--; // Reduce the size of the list
        return value;
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
        Node temp = head; // Start from the head of the list
        while (temp != null) {
            System.out.print(temp.value); // Print the current node value
            if (temp.next != null) {      // If there’s a next node, add " -> "
                System.out.print(" -> ");
            }
            temp = temp.next;             // Move to the next node
        }
        System.out.println(" -> null");             // Print a newline after the list
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
            // private Node(int value, Node next) {
            //     this.value = value;
            //     this.next = next;
            // }

    }
}
