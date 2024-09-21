//https://leetcode.com/problems/missing-number/
public class MissingNum {
    
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int sum = 0;
            int totalSum = n*(n+1)/2;
            for(int num : nums) {
                sum += num;
            }
            return totalSum - sum;
        }
    
}
