public class Reverse_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
       return recur(prev, curr);
  
    }
    public ListNode recur(ListNode prev, ListNode curr) {
        if(curr == null) return prev;
        ListNode temp = curr.next;
        curr.next = prev;
        return recur(curr,temp);
        
    }
}
