
public class isPalindrome_LL {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode firstHalf = head;
        ListNode SecondHalf = reverse(slow);

        while(SecondHalf != null) {
            if(firstHalf.val != SecondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            SecondHalf = SecondHalf.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode curr = node;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
