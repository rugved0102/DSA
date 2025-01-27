
public class DLL {
    private Node head;
    
    public void insertFirst(int val) {
        // 1. Create a new node with the given value
        Node node = new Node(val);
    
        // 2. Point the new node's 'next' reference to the current head
        node.next = head;
    
        // 3. The new node's 'prev' reference is set to null (it's the first node)
        node.prev = null;
    
        // 4. If the list is not empty (head is not null):
        //    Update the current head's 'prev' reference to point to the new node
        if(head != null) {
            head.prev = node;
        }
    
        // 5. Update the head of the list to the new node
        head = node;
    }
    
    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        
        last.next = node;
        
        node.prev = last;

    }

    public void display() {
        Node node = head;
        Node last = null;
        while(node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse"); 
        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;
        private Node(int value) {
            this.value = value;
        }
        private Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        
    }
    
}
