//https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/?envType=daily-question&envId=2025-02-13

import java.util.PriorityQueue;

class Q3066 {
    
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int cnt = 0;
        for(int num : nums) pq.offer((long) num);
        while(pq.size() >= 2) {
            long x = pq.poll();
            if(x >= k) break;
            long y = pq.poll();
            long res = Math.min(x,y)*2 + Math.max(x,y);
            pq.offer(res);
            cnt++;
        }
        return cnt;
    }

}