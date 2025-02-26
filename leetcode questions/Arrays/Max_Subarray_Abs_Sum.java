//https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/?envType=daily-question&envId=2025-02-26
public class Max_Subarray_Abs_Sum {
    public int maxAbsoluteSum(int[] nums) {
        int minPrefixSum = 0, maxPrefixSum = 0;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            minPrefixSum = Math.min(minPrefixSum, prefixSum);
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);
        }

        return maxPrefixSum - minPrefixSum;
    }
}
