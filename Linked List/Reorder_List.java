public class Reorder_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode s = head;
        ListNode e = reverse(slow);

        while(s != null && e != null) {
            ListNode temp = s.next;
            s.next = e;
            s = temp;
            temp = e.next;
            e.next = s;
            e = temp;
        }

        if(s!= null) {
            s.next = null;
        }
        
    }
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
