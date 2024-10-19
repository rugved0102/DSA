// https://leetcode.com/problems/maximum-product-subarray/description/

class Max_pdt_subarray {
    public int maxProduct(int[] nums) {
        int leftpdt = 1;
        int rightpdt = 1;
        int ans = nums[0];

        for(int i = 0; i < nums.length; i++){

            leftpdt = leftpdt == 0 ? 1 : leftpdt;
            rightpdt = rightpdt == 0 ? 1 : rightpdt;

            leftpdt *= nums[i];
            rightpdt *= nums[nums.length - i -1];

            ans = Math.max(ans, Math.max(leftpdt,rightpdt));
        }
        return ans;
    }
}