
public class DLL {
    private Node head;
    private int size;
    public DLL() {
        this.size = 0;
    }
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
        size++;
    }

    public void insert(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
    
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
    
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
    
        if (temp.next != null) {
            temp.next.prev = node;
        }
    
        temp.next = node;
        size++;
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
        size++;
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

    public void insertAfterValue(int after, int value) {
        Node p = findNodeValue(after);
        if(p == null) {
            System.out.println("Node with value = "+value+" Not found in the DLL");
            return;
        }
        if(p.next == null) {
            insertLast(value);
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        if(node.next != null) {
            node.next.prev = node;
        }
        node.prev = p;
        size++;
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
        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        private Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        
    }
    
}
