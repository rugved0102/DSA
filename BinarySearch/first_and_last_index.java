//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1293403352/

public class first_and_last_index {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] ans = {-1,-1};
            int start = firstIndex(nums, target, true);
            int end = firstIndex(nums, target, false);
            ans[0] = start;
            ans[1] = end;
            return ans;
        }
    }
    static int firstIndex(int[] nums, int target, boolean check) {
        int ans = -1;
        int s = 0;
        int e= nums.length-1;
        while(s <= e) {
            int m = s + (e-s)/2;
            if(target > nums[m]) {
                s = m + 1;
            }
            else if(target < nums[m]) {
                e = m - 1;
            }
            else {
                ans = m;
                if(check) {
                    e = m -1;
                }
                else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}
