public class Middle_Node {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int len = 0;
        while(node != null) {
            node = node.next;
            len++;
        }
        
        node = head;
        for (int i = 0; i < len / 2; i++) {
            node = node.next;
        }
        
        return node;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
