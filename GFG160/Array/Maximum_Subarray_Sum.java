public class Maximum_Subarray_Sum {
    int maxSubarraySum(int[] nums) {
        int n = nums.length;
                int sum = 0;
                int max = nums[0];
                for(int i=0;i<n;i++)
                {
                    sum += nums[i];
                    max=max<sum?sum:max;
                    // max = Math.max(max,sum);
                    if(sum<0) sum = 0;
                }
                return max;
            }
}
