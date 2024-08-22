//https://leetcode.com/problems/maximum-product-of-three-numbers/description/
import java.util.Arrays;

public class max_pdt_of_3_no {
    
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int c = nums[n-3]*nums[n-2]*nums[n-1];
        if(nums[0]*nums[1]*nums[n-1] > nums[n-3]*nums[n-2]*nums[n-1])
            return nums[0]*nums[1]*nums[n-1];

        return c;
    }

}
