public class Reverse_Linked_List_II {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 0; curr != null && i < left-1; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode firstPart = prev;
        ListNode newNode = curr;

        ListNode next = curr.next;
        for(int i =0; curr != null && i < right - left + 1; i++) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) {
                next = next.next;
            }
        }

        if(firstPart != null) {
            firstPart.next = prev;
        } else {
            head = prev;
        }

        newNode.next = curr;

        return head;
    }
}
