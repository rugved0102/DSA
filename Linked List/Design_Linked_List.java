

public class Design_Linked_List {
    class MyLinkedList {

        private int size;
        private Node head;
        private Node tail;
    
        public MyLinkedList() {
            this.size = 0;
            this.head = null;
            this.tail = null;
        }
    
        private class Node {
            private int val;
            private Node next;
    
            private Node(int val) {
                this.val = val;
            }
    
            private Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }
    
        public int get(int index) {
            if (index < 0 || index > size - 1)
                return -1;
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.val;
        }
    
        public void addAtHead(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
            size++;
        }
    
        public void addAtTail(int val) {
            Node node = new Node(val);
            if (tail == null) {
    
                addAtHead(val);
                return;
    
            }
            tail.next = node;
            tail = node;
            size++;
        }
    
        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size)
                return; 
    
            if (index == 0) { 
                addAtHead(val);
                return;
            }
            if (index == size) { 
                addAtTail(val);
                return;
            }
    
            Node temp = head;
            for (int i = 0; i < index - 1; i++) { 
                temp = temp.next;
            }
    
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size)
                return; // Out of bounds check
    
            if (index == 0) { // Deleting the head
                head = head.next;
                if (head == null)
                    tail = null; // If list becomes empty
                size--;
                return;
            }
    
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
    
            temp.next = temp.next.next;
            if (index == size - 1)
                tail = temp; // If deleting the last node, update tail
            size--;
        }
    }
    
    /**
     * Your MyLinkedList object will be instantiated and called as such:
     * MyLinkedList obj = new MyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */
}
