public class CycleLength {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return countCycleNode(fast,slow);
                 
            }
        }
        return 0;
    }
    public int countCycleNode(ListNode f, ListNode s) {
        int cnt = 1;
        s = s.next;
        while(s != f) {
            cnt++;
            s = s.next;
        }
        //System.out.println(cnt);
        return cnt;
    }

}
