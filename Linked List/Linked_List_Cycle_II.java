public class Linked_List_Cycle_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
    
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast) {
                    break;
                }
            }
            if(fast == null || fast.next == null) return null;
    
            while(head != slow) {
                slow = slow.next;
                head = head.next;
            }
            return head;
    }
}
